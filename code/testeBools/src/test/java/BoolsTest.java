import br.ufal.ic.atividades.teste.Bools;
import br.ufal.ic.atividades.teste.BooleanArrayAsList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/*
*
* Author Vanessa Vieira
*
* */

public class BoolsTest {

    private static final boolean[] empty = {};
    private static final boolean[] falseArray = {false};
    private static final boolean[] trueArray = {true};
    private static final boolean[] falseFalseArray = {false, false};
    private static final boolean[] trueTrueArray = {true, true};
    private static final boolean[] falseTrueArray = {false, true};

    @Before
    public void setUp() {
        System.out.println("Set up BoolsTest.");
    }

    @After
    public void tearDown() {
        System.out.println("Tear down BoolsTest.\n\n");
    }

    @Test
    public void compareTest() {
        System.out.println("Testing method compare(boolean a, boolean b):");

        assertEquals("The expected return is false.",1, Bools.compare(true, false));
        assertEquals("The expected return is true.",0, Bools.compare(true, true));
        assertEquals("The expected return is false.",0,Bools.compare(false, false));
    }

    @Test
    public void containsTest() {
        System.out.println("Testing method contains(boolean [] array, boolean target):");

        assertFalse("The expected return is false.", Bools.contains(empty, false));
        assertFalse("The expected return is false.", Bools.contains(falseArray, true));
        assertTrue("The expected return is true.",Bools.contains(falseArray, false));
        assertTrue("The expected return is true.",Bools.contains(falseTrueArray, false));
        assertTrue("The expected return is true.",Bools.contains(falseTrueArray, true));
    }

    @Test
    public void indexOfTest() {
        System.out.println("Testing method indexOf(boolean [] array, boolean target):");

        assertNotNull(empty);
        assertNotNull(falseArray);
        assertNotNull(falseFalseArray);
        assertNotNull(falseTrueArray);
        assertNotNull(trueArray);

        assertEquals("The index does not exist.", -1, Bools.indexOf(empty, false));
        assertEquals("The index does not exist.", -1, Bools.indexOf(falseArray, true));
        assertEquals("The index is 1.", 1, Bools.indexOf(falseTrueArray, true));
        assertEquals("The index is 0.", 0, Bools.indexOf(trueArray, true));
        assertEquals("The index is 0.", 0, Bools.indexOf(falseFalseArray, false));
    }

    @Test
    public void lastIndexOfTest() {
        System.out.println("Testing method lastIndexOf(boolean [] array, boolean target):");

        assertEquals("The index does not exist.", -1, Bools.lastIndexOf(empty, false));
        assertEquals("The index does not exist.", -1, Bools.lastIndexOf(falseArray, true));
        assertEquals("The index does not exist.", -1, Bools.lastIndexOf(falseFalseArray, true));
        assertEquals("The index is 1.", 1, Bools.lastIndexOf(falseTrueArray, true));
        assertEquals("The index is 0.", 0, Bools.lastIndexOf(trueArray, true));
        assertEquals("The index is 1.", 1, Bools.lastIndexOf(trueTrueArray, true));
        assertEquals("The index is 1.", 1, Bools.lastIndexOf(falseFalseArray, false));
    }

    @Test
    public void concatTest() {
        System.out.println("Testing method concat(boolean [] array...):");


        assertThat("The arrays are the same.", new boolean[]{true, true, true}, is(Bools.concat(trueArray, trueTrueArray)));
        assertThat("The arrays are the same.", new boolean[]{}, is(Bools.concat()));
        assertThat("The arrays are the same.", new boolean[]{}, is(Bools.concat(empty, empty, empty)));
        assertThat("The arrays are the same.", new boolean[]{true, false}, is(Bools.concat(trueArray, falseArray)));
        assertThat("The arrays are the same.", new boolean[]{false, true}, is(Bools.concat(falseArray, trueArray)));

        assertNotSame("should not be the same.", empty, Bools.concat(empty));
        assertNotSame("should not be the same.", true, Bools.concat(trueArray));
        assertNotSame("should not be the same.", false, Bools.concat(falseArray));
    }

    @Test
    public void toArrayTest() {
        System.out.println("Testing method toArray(Collection<Boolean> collection):");

        boolean[] booleanArray = new boolean[2];
        BooleanArrayAsList booleanArrayAsList = new BooleanArrayAsList(booleanArray, 0, (-1));


        try {
            Bools.toArray(booleanArrayAsList);
            fail("Didnt catched IllegalArgumentException.");

        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }

        boolean[] booleanArray1 = new boolean[2];
        BooleanArrayAsList booleanArrayAsList1 = new BooleanArrayAsList(booleanArray1, 3, 3);

        try {
            Bools.toArray(booleanArrayAsList1);
            fail("Didn't catched ArrayIndexOutOfBoundsException.");

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    @Test
    public void asListTest() {

        System.out.println("Testing method asList(boolean... backingArray):");

        boolean[] booleanArray = new boolean[0];
        boolean[] booleanArray0 = {true, false};

        List<Boolean> list = Bools.asList(booleanArray);
        List<Boolean> list0 = Bools.asList(booleanArray0);

        assertTrue("The list is empty.",list.isEmpty());
        assertFalse("The list is not empty.",list0.isEmpty());

        try {
            Bools.asList((boolean[]) null);
            fail("Didn't catched NullPointerException.");

        } catch(NullPointerException e) {
            System.out.println(e);
        }
    }

    @Test
    public void countTrueTest() {

        System.out.println("Testing method countTrue(boolean... values):");

        assertEquals("The number of true elements is 2.", 2, Bools.countTrue(trueTrueArray));
        assertEquals("The number of true elements is 0.", 0, Bools.countTrue(empty));
        assertEquals("The number of true elements is 0.", 0, Bools.countTrue(falseArray));
        assertEquals("The number of true elements is 1.", 1, Bools.countTrue(trueArray));
    }

    @Test (expected = NullPointerException.class)
    public void checkNotNull() {

        System.out.println("Testing method checkNotNull(T reference, Object errorMessage):");

        assertEquals("The reference is true.",true, Bools.checkNotNull(true));
        assertEquals("The reference is false.", false, Bools.checkNotNull(false));
        assertEquals("The reference is the empty array.",empty, Bools.checkNotNull(empty));
        assertEquals("The reference is trueTrueArray.",trueTrueArray, Bools.checkNotNull(trueTrueArray));


        Bools.checkNotNull(null);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void checkElementIndex() {

        System.out.println("Testing method checkElementIndex(ind index, int size, String desc):");

        assertEquals("The index is 0.",0,Bools.checkElementIndex(0, 20, "Não entendi essa string"));
        assertEquals("The index does not exist.",21,Bools.checkElementIndex(21, 20, "Não entendi essa string"));
        assertEquals("The index does not exist.",-1,Bools.checkElementIndex(-1, 20, "Não entendi essa string"));
    }

}
