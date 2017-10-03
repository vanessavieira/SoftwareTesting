package br.ufal.ic.teste.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Reader {

	public String readAll(String path) {
		
		int count = 0;
		
		String content = new String();
		
		while (true) {
			try {
				FileInputStream stream = new FailFileInputStream(path);
	
				try{
					count++;
					
					File f = new File(path);
					
					int length = (int) f.length();
					
					byte[] bytes = new byte[length];
					
					int j = length;
					
					for(int i = 0; i < j; i++){
						bytes[i] = (byte)stream.read();
					}
					
					try{
						content = new String(bytes, "UTF-8");
					} catch(UnsupportedEncodingException e) {
						
					}
					
					break;
					
				}catch(IOException e) {
					
					if (count > 5) return null;
				}
			}catch(FileNotFoundException e){
	
			}
		
		}
		
		return content;
	}
	
	
	public class FailFileInputStream extends FileInputStream {
		
		int i = 1;
		public FailFileInputStream(String path) throws FileNotFoundException {
			super(path);
		}
		
		@Override
		public int read() throws IOException {
			
			i++;			
			int r = Math.abs(new Random().nextInt()%100);
			
			if (i > r) throw new IOException();
			
			
			System.out.println("aqui");
			return super.read();
		}
		@Override
		public int available() {
			try {
				return Math.abs(new Random().nextInt()) % super.available();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return 0;
		}
	}
}