

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufal.ic.myQueue.Queue;

public class QueueTest{
	private Queue<Integer> fila;
	//Na especificação e implementação, não são abordadso os casos onde o tamanho
	//é negativo, isso claramente deveria ser abordado
	@Test
	public void negativeSize() {
		fila = new Queue<Integer>(-5);
		fila.enqueue(Integer.valueOf(5));
		assertTrue(fila.isEmpty());
	}
	
	@Test
	public void dependencies() {
		fila = new Queue<Integer>(5);
		
		assertNull(fila.dequeue());
		assertNull(fila.element());
		assertTrue(fila.isEmpty());
		
		fila.enqueue(Integer.valueOf(5));
		fila.enqueue(Integer.valueOf(4));
		fila.enqueue(Integer.valueOf(3));
		fila.enqueue(Integer.valueOf(2));
		fila.enqueue(Integer.valueOf(1));
		
		assertEquals(Integer.valueOf(5), fila.dequeue());
		assertEquals(Integer.valueOf(4), fila.element());
		assertFalse(fila.isEmpty());
	}
	
	@Test 
	public void elementEmpty() {
		fila = new Queue<Integer>(3);
		assertNull(fila.element());
	}
	
	@Test 
	public void elementNotEmpty() {
		fila = new Queue<Integer>(3);
		fila.enqueue(Integer.valueOf(3));
		assertEquals(Integer.valueOf(3), fila.element());
		fila.enqueue(Integer.valueOf(4));
		assertEquals(Integer.valueOf(3), fila.element());
		fila.enqueue(Integer.valueOf(5));
		assertEquals(Integer.valueOf(3), fila.element());
	}
	
	//Na especificação um objeto nulo deve retornar falso, 
	//porém na implementação isso não foi realizado - bug corrigido!
	@Test
	public void enqueueNull() {
		fila = new Queue<Integer>(3);
		assertFalse(fila.enqueue(null));
	}
	
	@Test
	public void enqueue() {
		fila = new Queue<Integer>(3);
		fila.enqueue(Integer.valueOf(3));
		fila.enqueue(Integer.valueOf(6));
		fila.enqueue(Integer.valueOf(9));
		assertSame(3, fila.element());
	}
	
	@Test
	public void enqueueFull() {
		fila = new Queue<Integer>(0);
		assertFalse(fila.enqueue(Integer.valueOf(1)));
	}
	
	@Test
	public void dequeueNotEmpty() {
		fila = new Queue<Integer>(3);
		fila.enqueue(Integer.valueOf(3));
		assertEquals(Integer.valueOf(3), fila.dequeue());
		fila.enqueue(Integer.valueOf(4));
		assertEquals(Integer.valueOf(4), fila.dequeue());
		fila.enqueue(Integer.valueOf(5));
		assertEquals(Integer.valueOf(5), fila.dequeue());
	}
	
	@Test
	public void dequeueEmpty() {
		fila = new Queue<Integer>(3);
		assertNull(fila.dequeue());
	}
	
	@Test
	public void isEmptyTrue() {
		fila = new Queue<Integer>(3);
		assertTrue(fila.isEmpty());
	}
	
	@Test
	public void isEmptyFalse() {
		fila = new Queue<Integer>(3);
		fila.enqueue(Integer.valueOf(4));
		assertFalse(fila.isEmpty());
	}
	
}
