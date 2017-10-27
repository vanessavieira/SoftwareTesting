import br.ufal.ic.atividades.teste.BooleanArrayAsList;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/*
*
* Author Vanessa Vieira
*
* */


public class BooleanArrayAsListTest {

    BooleanArrayAsList booleanArrayAsList, booleanArrayAsList1, booleanArrayAsList2;

    @Before
    public void setUp() {
        System.out.println("Set up BooleanArrayAsListTest");

        boolean[] trueFalseTrueArray = {true, false, true};
        boolean[] trueTrueArray = {true, true};
        boolean[] empty = {};

        booleanArrayAsList = new BooleanArrayAsList(trueFalseTrueArray, 0, trueFalseTrueArray.length);
        booleanArrayAsList1 = new BooleanArrayAsList(trueTrueArray, 0, trueTrueArray.length);
        booleanArrayAsList2 = new BooleanArrayAsList(empty, 0, empty.length);
    }

    @After
    public void tearDown() {
        System.out.println("Tear down BooleanArrayAsListTest\n\n");
    }

    @Test
    public void sizeTest() {

        System.out.println("Testing method size():");

        assertEquals("The expected size is 3.",3,booleanArrayAsList.size());
        assertEquals("The expected size is 2.",2,booleanArrayAsList1.size());
        assertEquals("The expected size is 0.",0,booleanArrayAsList2.size());
    }

    @Test
    public void isEmptyTest() {

        System.out.println("Testing method isEmpty():");


        assertFalse("The list is not empty.", booleanArrayAsList.isEmpty());
        assertFalse("The list is not empty.", booleanArrayAsList1.isEmpty());

        assertEquals("The expected size is 0.",0,booleanArrayAsList2.size());

        // possível bug encontrado:
        assertTrue("The list is empty (size 0) - should return true.", booleanArrayAsList2.isEmpty());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getTest() {

        System.out.println("Testing method get():");

        assertEquals("The expected element on index 0 is true.", true, booleanArrayAsList.get(0));
        assertEquals("The expected element on index 1 is false.", false, booleanArrayAsList.get(1));
        assertEquals("The expected element on index 2 is true.", true, booleanArrayAsList.get(2));

        assertEquals("The expected element on index 0 is true.", true, booleanArrayAsList1.get(0));
        assertEquals("The expected element on index 1 is true.", true, booleanArrayAsList1.get(1));

        assertNull("The list is empty. IndexOutOfBounds exception expected.", booleanArrayAsList2.get(1));
    }

    @Test
    public void containsTest() {

        System.out.println("Testing method contains():");

        assertEquals("Contains true element.", true, booleanArrayAsList.contains(true));
        assertEquals("Contains false element.", true, booleanArrayAsList.contains(false));

        assertEquals("Contains true element.", true, booleanArrayAsList1.contains(true));
        assertNotEquals("It does not contain false element.", true, booleanArrayAsList1.contains(false));

        assertFalse("It does not contain true element.",booleanArrayAsList2.contains(true));
        assertFalse("It does not contain false element.",booleanArrayAsList2.contains(false));
    }

    @Test
    public void indexOfTest() {

        System.out.println("Testing method indexOf():");

        assertEquals("The first index of a true element is 0", 0, booleanArrayAsList.indexOf(true));
        assertEquals("The first index of a false element is 1", 1, booleanArrayAsList.indexOf(false));

        assertEquals("The first index of a true element is 0", 0, booleanArrayAsList1.indexOf(true));

        assertEquals("Returns -1 when the element is not found.", -1, booleanArrayAsList2.indexOf(true));
    }

    @Test
    public void lastIndexOfTest() {

        System.out.println("Testing method lastIndexOf():");

        assertEquals("The last index of a true element is 2", 2, booleanArrayAsList.lastIndexOf(true));
        assertEquals("The last index of a false element is 1", 1, booleanArrayAsList.lastIndexOf(false));

        assertEquals("The last index of a true element is 1", 1, booleanArrayAsList1.lastIndexOf(true));

        assertEquals("Returns -1 when the element is not found.", -1, booleanArrayAsList2.lastIndexOf(true));
    }

    @Test
    public void setTest() {

        System.out.println("Testing method set():");

        boolean setTestVar;
        assertThat("The old value was true.", true, is(booleanArrayAsList1.set(1, false)));
        assertThat("The old value was false.", false, is(booleanArrayAsList1.set(1, true)));

        try {
            setTestVar = booleanArrayAsList2.set(0, true);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    @Test (expected = UnsupportedOperationException.class)
    public void subListTest() {

        System.out.println("Testing method subList():");

        booleanArrayAsList.subList(0, 2);
    }

    @Test
    public void equalsTest() {

        System.out.println("Testing method equals():");

        boolean[] list = {true, false, true};
        boolean[] list1 = {true, false};

        BooleanArrayAsList booleanListTest = new BooleanArrayAsList(list, 0, list.length);
        BooleanArrayAsList booleanListTest1 = new BooleanArrayAsList(list1, 0, list1.length);


        assertThat("The lists are equals.", true, is(booleanArrayAsList.equals(booleanListTest)));
        assertThat("The lists are equals.", false, is(booleanArrayAsList1.equals(booleanListTest1)));

        assertFalse("The objects are not equals.", booleanArrayAsList2.equals(false));
    }

    @Test
    public void hashCodeTest() {

        System.out.println("Testing method hashCode():");

        assertEquals("The expected hash code for this list is 1252360.", 1252360, booleanArrayAsList.hashCode());
        assertEquals("The expected hash code for this list is 40353.", 40353, booleanArrayAsList1.hashCode());
        assertEquals("The expected hash code for this list is 1.", 1, booleanArrayAsList2.hashCode());
    }

    @Test
    public void toStringTest() {

        System.out.println("Testing method toString():");

        assertThat("The strings are equals.","[true, false, true]" , is(booleanArrayAsList.toString()));
        assertThat("The strings are equals.","[true, true]" , is(booleanArrayAsList1.toString()));

        try {
            booleanArrayAsList2.toString();

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
