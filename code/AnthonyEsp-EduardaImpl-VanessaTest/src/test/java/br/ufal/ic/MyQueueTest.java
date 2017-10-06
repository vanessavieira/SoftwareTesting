package br.ufal.ic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MyQueueTest {
	
	private MyQueue<Integer> queue;
	
	@Before
	public void setUp(){
		queue = new MyQueue<Integer>(3);
	}

	@Test
	public void addTest() {
		boolean result;
		Integer first;

		result = queue.add(1);
		assertTrue("Error: It should add the Integer 1 on the index 0 of the queue.", result);

		first = queue.first();
		assertEquals("Error: The first element on the queue should be 1.", 1, (Object)first);

		result = queue.add(2);
		assertTrue("Error: It should add the Integer 2 on the index 1 of the queue.", result);

		result = queue.add(3);
		assertTrue("Error: It should add the Integer 3 on the index 2 of the queue.", result);

		result = queue.add(4);
		assertFalse("Error: It should not add the Integer 4 on the index 3 of the queue, because it does not exist.", result);

		queue.remove();
		result = queue.add(3);
		assertTrue("Error: It should add the Integer 3 on the index 2 of the queue.", result);

		result = queue.add(4);
		assertFalse("Error: It should not add the Integer 4 on the index 3 of the queue, because it does not exist.", result);

		for (int i = 0; i < 3; i++) {
			queue.remove();
		}

		first = queue.first();
		assertEquals("Error: There's no element on the queue.", null, first);

		result = queue.add(null);
		assertTrue("Error: It should add null element on index 0 of the queue", result);

		first = queue.first();
		assertEquals("Error: The first element on the queue should be null.", null, first);

		// retorna nulo quando não tem primeiro elemento na fila e retorna nulo quando o primeiro elemento é nulo

	}


	@Test
	public void removeTest() {
		Integer result;

		result = queue.remove();
		assertNull("Error: The queue should be empty.", result);
		assertEquals("Error: The queue should be empty.",true, queue.isEmpty());

		queue.add(1);
		queue.add(2);
		queue.add(3);

		result = queue.remove();
		assertEquals("Error: The first element should be 1.", (Integer)1, result);

		result = queue.remove();
		assertEquals("Error: The first element should be 2.", (Integer)2,result);

		result = queue.remove();
		assertEquals("Error: The first element should be 3.", (Integer)3, result);

		assertEquals("Error: The queue should be empty.",true, queue.isEmpty());

		queue.add(null);
		assertFalse("Error: The queue should not be empty.", queue.isEmpty());

		result = queue.remove();
		assertNull("Error: The first element should be null.", result);

	}

	@Test
	public void isEmptyTest() {
		Boolean result;

		result = queue.isEmpty();
		assertTrue("Error: the queue should be empty.", result);

		queue.add(1);
		result = queue.isEmpty();
		assertFalse("Error: the queue should not be empty.", result);

		queue.remove();

		queue.add(null);
		result = queue.isEmpty();
		assertFalse("Error: the queue should not be empty.", result);

	}

	@Test
	public void firstTest() {
		Integer result;

		result = queue.first();

		assertNull("Error: The queue is empty. Because the first element does not exist the variable 'result should be null.", result);

		queue.add(null);
		queue.add(2);

		result = queue.first();
		assertNull("Error: The first element should be null.", result);

		queue.remove();

		result = queue.first();
		assertEquals("Error: The first element should be null.", (Integer)2, result);
	}

	@Test
	public void sizeTest() {
		int result;

		result = queue.size();

		assertEquals("Error: The queue size should be 0 because it is empty.",0, (Object)result);

		for(int i = 0; i < 1000; i++){
			queue.add(1);
		}

		result = queue.size();
		assertEquals("Error: The queue size should be 3.",3, (Object)result);

		for(int i = 0; i < 3; i++){
			queue.remove();
		}

		queue.add(1);

		result = queue.size();
		assertEquals("Error: The queue size should be 1.",1, (Object)result);

	}
}