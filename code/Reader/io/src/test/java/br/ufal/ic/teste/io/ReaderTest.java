package br.ufal.ic.teste.io;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ReaderTest {

	private Reader r = new Reader();
	private String path = new String("src/test/resources/text2.txt");
	
	@Test
	public void testReadAll() {
		
		String content = new String("Isso é um texto de teste");
		assertThat(r.readAll(path), equalTo(content));
		
//		for (int i = 0; i < 10000 ; i++) {
//			String content = new String("Isso é um texto de teste");
//			assertThat(r.readAll(path), equalTo(content));
//		}
	}

}
