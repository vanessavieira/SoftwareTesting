import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

/**
 * Created by vanessa.vieira on 08/08/17.
 */
public class AssertTestArrayList {

    public ArrayList<Integer> list;

    @Before
    public void setUp() {
        this.list = new ArrayList<Integer>();
    }

    @After
    public void tearDown() {
        this.list = null;
    }

    @Test
    public void addElementTest() {

        int result;

        Assert.assertTrue(list.add(1));
        Assert.assertFalse("The list is actually empty.", list.isEmpty());
        Assert.assertEquals("The expected size is 1.",1, list.size());
        Assert.assertTrue(list.add(2));
        Assert.assertEquals("The expected size is 2.",2, list.size());

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 of the list is 1.",1, result);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 of the list is 2.",2, result);

        try {
            Assert.assertTrue(list.add(null));

            result = list.get(2);

            Assert.assertEquals("The expected element on index 2 of the list is null.",null, result);
            Assert.fail("Didn't cached null pointer exception");

        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

    @Test
    public void addElementOnIndexTest() {
        int result;

        list.add(0, 1);

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 of the list is 1.",1, result);

        list.add(1, 2);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 of the list is 2.", 2, result);
        Assert.assertEquals("The expected size is 2.", 2, list.size());

        list.add(0, 1);

        Assert.assertEquals("The expected size is now 3.", 3, list.size());

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 of the list is now 1.", 1, result);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 of the list is now 1", 1, result);

        result = list.get(2);

        Assert.assertEquals("The expected element on index 2 of the list is 2.", 2, result);


        try {
            list.add(-1, 0);

            Assert.fail("Didn't cached out of bounds exception.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            list.add(5, 6);

            Assert.fail("Didn't cached out of bounds exception.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

    @Test
    public void clearListTest() {
        int result;

        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(2));
        Assert.assertTrue(list.add(3));
        Assert.assertEquals("The expected size of the list is 3.", 3, list.size());

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 of the list is 1", 1, result);

        list.clear();

        Assert.assertEquals("The expected size of the list is now 0.", 0, list.size());

        try {
            result = list.get(1);

            Assert.fail("Didn't cached index out of bounds exeption.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    @Test
    public void containsElementTest() {
        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(8903));
        Assert.assertTrue(list.add(3));

        Assert.assertTrue(list.contains(8903));
        Assert.assertFalse(list.contains(4));

    }

    @Test
    public void getElementByIndexTest() {
        int result;

        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(2));
        Assert.assertTrue(list.add(3));
        Assert.assertTrue(list.add(null));

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 of the list is 1.", 1, result);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 of the list is 2.", 2, result);

        result = list.get(2);

        Assert.assertEquals("The expected element on index 2 of the list is 3.", 3, result);

        try {
            result = list.get(3);

            Assert.fail("Didn't cached null pointer exception.");

        } catch (NullPointerException e) {
            System.out.println(e);

        }

        try {
            result = list.get(-1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            result = list.get(56);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

    @Test
    public void isItReallyEmptyTest() {
        Assert.assertTrue("The list is actually empty.", list.isEmpty());

        list.add(1);

        Assert.assertFalse("The list is not empty.",list.isEmpty());

        list.clear();

        list.add(null);

        Assert.assertFalse("The list has one element and it is null.", list.isEmpty());
    }

    @Test
    public void removeElementByIndexTest() {
        int result;

        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(2));
        Assert.assertTrue(list.add(3));
        Assert.assertEquals("The expected size of the list is 3.", 3, list.size());

        list.remove(1);

        Assert.assertEquals("The expected size of the list is now 2.", 2, list.size());

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 is 1.", 1, result);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 is 3.", 3, result);

        try {
            list.remove(-1);

            Assert.fail("Didn't cached index out of bounds exception.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            list.remove(3);

            Assert.fail("Didn't cached index out of bounds exception.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    @Test
    public void removeElementTest() {
        Integer obj;
        int result;

        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(1));
        Assert.assertTrue(list.add(2));
        Assert.assertTrue(list.add(3));

        obj = new Integer(5);

        Assert.assertFalse(list.remove(obj));

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 is 1.", 1, result);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 is 1.", 1, result);

        result = list.get(2);

        Assert.assertEquals("The expected element on index 2 is 2.", 2, result);

        result = list.get(3);

        Assert.assertEquals("The expected element on index 3 is 3.", 3, result);

        obj = 1;

        Assert.assertTrue(list.remove(obj));

        result = list.get(0);

        Assert.assertEquals("The expected element on index 0 is 1.", 1, result);

        result = list.get(1);

        Assert.assertEquals("The expected element on index 1 is 2.", 2, result);

        result = list.get(2);

        Assert.assertEquals("The expected element on index 2 is 3.", 3, result);

    }

    @Test
    public void sizeOfListTest() {
        Assert.assertEquals("The expected list size is 0.", 0, list.size());
        Assert.assertTrue(list.add(1));
        Assert.assertEquals("The expected list size is 1.", 1, list.size());

        list.clear();

        Assert.assertTrue(list.add(null));
        Assert.assertEquals("The expected list size is still 1.", 1, list.size());
    }


}
