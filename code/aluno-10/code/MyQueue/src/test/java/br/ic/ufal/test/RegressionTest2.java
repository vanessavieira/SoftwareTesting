import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("hi!");
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.element();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        java.lang.String str11 = queue_str1.dequeue();
        boolean b13 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b11 = queue_str1.enqueue("");
        java.lang.String str12 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 0);
        queue_str1.printf();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("hi!");
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.element();
        java.lang.String str15 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        br.ufal.ic.myQueue.Queue<java.lang.CharSequence> queue_charSequence1 = new br.ufal.ic.myQueue.Queue<java.lang.CharSequence>(1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.element();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.enqueue("");
        boolean b12 = queue_str1.isEmpty();
        boolean b14 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("");
        java.lang.String str14 = queue_str1.dequeue();
        java.lang.String str15 = queue_str1.element();
        java.lang.String str16 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b14 = queue_str1.enqueue("");
        java.lang.String str15 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b11 = queue_str1.enqueue("");
        java.lang.String str12 = queue_str1.element();
        boolean b14 = queue_str1.enqueue("hi!");
        boolean b15 = queue_str1.isEmpty();
        java.lang.String str16 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.element();
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        boolean b8 = queue_str1.enqueue("");
        boolean b10 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b13 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b15 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str14 = queue_str1.element();
        java.lang.String str15 = queue_str1.dequeue();
        boolean b16 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str18 = queue_str1.dequeue();
        java.lang.String str19 = queue_str1.dequeue();
        java.lang.String str20 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b8 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b11 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        queue_str1.printf();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.element();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b14 = queue_str1.enqueue("hi!");
        java.lang.String str15 = queue_str1.dequeue();
        boolean b16 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        queue_str1.printf();
        boolean b13 = queue_str1.enqueue("");
        boolean b15 = queue_str1.enqueue("");
        java.lang.String str16 = queue_str1.element();
        boolean b17 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.enqueue("");
        java.lang.String str9 = queue_str1.element();
        boolean b11 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        queue_str1.printf();
        boolean b12 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        boolean b16 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 10);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("");
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("");
        boolean b8 = queue_str1.enqueue("");
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.element();
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        boolean b12 = queue_str1.enqueue("");
        java.lang.String str13 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str16 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        boolean b5 = queue_str1.isEmpty();
        boolean b6 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        boolean b14 = queue_str1.enqueue("");
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        boolean b14 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str18 = queue_str1.element();
        queue_str1.printf();
        boolean b20 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b10 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 100);
        boolean b2 = queue_str1.isEmpty();
        boolean b3 = queue_str1.isEmpty();
        java.lang.String str4 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b11 = queue_str1.enqueue("");
        java.lang.String str12 = queue_str1.dequeue();
        boolean b13 = queue_str1.isEmpty();
        boolean b15 = queue_str1.enqueue("");
        boolean b17 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        boolean b8 = queue_str1.enqueue("");
        boolean b10 = queue_str1.enqueue("hi!");
        java.lang.String str11 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) -1);
        java.lang.String str2 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.element();
        boolean b15 = queue_str1.enqueue("hi!");
        boolean b17 = queue_str1.enqueue("");
        java.lang.String str18 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.enqueue("");
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        java.lang.String str11 = queue_str1.dequeue();
        java.lang.String str12 = queue_str1.element();
        boolean b13 = queue_str1.isEmpty();
        java.lang.String str14 = queue_str1.dequeue();
        boolean b15 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b8 = queue_str1.enqueue("hi!");
        java.lang.String str9 = queue_str1.element();
        boolean b11 = queue_str1.enqueue("hi!");
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("hi!");
        java.lang.String str10 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        boolean b6 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("");
        boolean b11 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str13 = queue_str1.dequeue();
        java.lang.String str14 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        br.ufal.ic.myQueue.Queue<java.lang.CharSequence> queue_charSequence1 = new br.ufal.ic.myQueue.Queue<java.lang.CharSequence>((int) (short) 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b14 = queue_str1.enqueue("hi!");
        java.lang.String str15 = queue_str1.dequeue();
        java.lang.String str16 = queue_str1.dequeue();
        boolean b17 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str19 = queue_str1.element();
        boolean b20 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("hi!");
        boolean b14 = queue_str1.isEmpty();
        java.lang.String str15 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str17 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        boolean b14 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b16 = queue_str1.isEmpty();
        java.lang.String str17 = queue_str1.dequeue();
        java.lang.String str18 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("");
        boolean b13 = queue_str1.enqueue("");
        boolean b15 = queue_str1.enqueue("");
        java.lang.String str16 = queue_str1.element();
        boolean b17 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        boolean b14 = queue_str1.isEmpty();
        java.lang.String str15 = queue_str1.dequeue();
        boolean b16 = queue_str1.isEmpty();
        java.lang.String str17 = queue_str1.element();
        boolean b19 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        queue_str1.printf();
        boolean b12 = queue_str1.enqueue("hi!");
        java.lang.String str13 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("");
        java.lang.String str9 = queue_str1.element();
        boolean b11 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str13 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.dequeue();
        java.lang.String str11 = queue_str1.element();
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.enqueue("");
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        boolean b14 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str17 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str19 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        boolean b8 = queue_str1.enqueue("hi!");
        java.lang.String str9 = queue_str1.dequeue();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.dequeue();
        boolean b12 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b9 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        boolean b13 = queue_str1.isEmpty();
        boolean b14 = queue_str1.isEmpty();
        boolean b16 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str9 = queue_str1.dequeue();
        java.lang.String str10 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str12 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        boolean b14 = queue_str1.enqueue("hi!");
        java.lang.String str15 = queue_str1.element();
        java.lang.String str16 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("hi!");
        java.lang.String str11 = queue_str1.dequeue();
        boolean b12 = queue_str1.isEmpty();
        java.lang.String str13 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        boolean b3 = queue_str1.isEmpty();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("hi!");
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        boolean b8 = queue_str1.enqueue("");
        boolean b10 = queue_str1.enqueue("");
        java.lang.String str11 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.element();
        java.lang.String str14 = queue_str1.dequeue();
        boolean b16 = queue_str1.enqueue("");
        java.lang.String str17 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b10 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.dequeue();
        java.lang.String str11 = queue_str1.dequeue();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.dequeue();
        java.lang.String str14 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b11 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        boolean b12 = queue_str1.enqueue("");
        boolean b13 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("");
        java.lang.String str5 = queue_str1.element();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b12 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b10 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b10 = queue_str1.enqueue("");
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str13 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str4 = queue_str1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.element();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b12 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b14 = queue_str1.isEmpty();
        java.lang.String str15 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b14 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.dequeue();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.dequeue();
        boolean b8 = queue_str1.enqueue("");
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.element();
        boolean b15 = queue_str1.enqueue("hi!");
        boolean b17 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str19 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("");
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b8 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str10 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str1 = new br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>>((int) (short) -1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b10 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b13 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        boolean b8 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b12 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        boolean b12 = queue_str1.enqueue("hi!");
        java.lang.String str13 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("");
        java.lang.String str14 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b6 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str16 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 1);
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b6 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b8 = queue_str1.enqueue("hi!");
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("hi!");
        boolean b14 = queue_str1.enqueue("hi!");
        boolean b16 = queue_str1.enqueue("");
        java.lang.String str17 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 1);
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        boolean b4 = queue_str1.enqueue("");
        boolean b6 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str13 = queue_str1.dequeue();
        java.lang.String str14 = queue_str1.dequeue();
        java.lang.String str15 = queue_str1.element();
        boolean b17 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("");
        boolean b8 = queue_str1.enqueue("");
        boolean b10 = queue_str1.enqueue("hi!");
        java.lang.String str11 = queue_str1.element();
        boolean b13 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b10 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 100);
        java.lang.String str2 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        boolean b12 = queue_str1.enqueue("");
        java.lang.String str13 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b16 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b19 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b12 = queue_str1.isEmpty();
        java.lang.String str13 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.enqueue("");
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.element();
        java.lang.String str15 = queue_str1.dequeue();
        java.lang.String str16 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b10 = queue_str1.enqueue("");
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) -1);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 1);
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.element();
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        boolean b9 = queue_str1.enqueue("hi!");
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.element();
        boolean b15 = queue_str1.enqueue("hi!");
        boolean b17 = queue_str1.enqueue("");
        boolean b19 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(1);
        queue_str1.printf();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        boolean b11 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str13 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        java.lang.String str11 = queue_str1.element();
        boolean b12 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        boolean b14 = queue_str1.isEmpty();
        java.lang.String str15 = queue_str1.element();
        java.lang.String str16 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str12 = queue_str1.dequeue();
        boolean b13 = queue_str1.isEmpty();
        java.lang.String str14 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        boolean b14 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b17 = queue_str1.enqueue("");
        java.lang.String str18 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b8 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        br.ufal.ic.myQueue.Queue<java.io.Serializable> queue_serializable1 = new br.ufal.ic.myQueue.Queue<java.io.Serializable>(100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str15 = queue_str1.dequeue();
        boolean b17 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        boolean b12 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b14 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        boolean b12 = queue_str1.enqueue("hi!");
        java.lang.String str13 = queue_str1.element();
        queue_str1.printf();
        boolean b15 = queue_str1.isEmpty();
        boolean b17 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        queue_str1.printf();
        queue_str1.printf();
        queue_str1.printf();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        boolean b12 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b15 = queue_str1.enqueue("");
        boolean b17 = queue_str1.enqueue("");
        java.lang.String str18 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        boolean b12 = queue_str1.isEmpty();
        boolean b14 = queue_str1.enqueue("hi!");
        java.lang.String str15 = queue_str1.element();
        java.lang.String str16 = queue_str1.element();
        boolean b17 = queue_str1.isEmpty();
        boolean b18 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        boolean b7 = queue_str1.enqueue("hi!");
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b9 = queue_str1.enqueue("hi!");
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.enqueue("");
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.dequeue();
        java.lang.String str14 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.dequeue();
        java.lang.String str12 = queue_str1.element();
        boolean b13 = queue_str1.isEmpty();
        java.lang.String str14 = queue_str1.element();
        boolean b15 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("");
        java.lang.String str14 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b11 = queue_str1.enqueue("hi!");
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.dequeue();
        java.lang.String str14 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.dequeue();
        java.lang.String str11 = queue_str1.dequeue();
        java.lang.String str12 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str14 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.dequeue();
        boolean b13 = queue_str1.enqueue("");
        boolean b14 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b16 = queue_str1.isEmpty();
        boolean b17 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str6 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) ' ');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b3 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        boolean b12 = queue_str1.enqueue("hi!");
        java.lang.String str13 = queue_str1.element();
        boolean b15 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b12 = queue_str1.isEmpty();
        boolean b13 = queue_str1.isEmpty();
        java.lang.String str14 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("");
        boolean b11 = queue_str1.enqueue("");
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        boolean b9 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b12 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.element();
        java.lang.String str15 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b12 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.dequeue();
        boolean b14 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 1);
        java.lang.String str2 = queue_str1.dequeue();
        java.lang.String str3 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str13 = queue_str1.dequeue();
        boolean b14 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        boolean b9 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str9 = queue_str1.dequeue();
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        boolean b13 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        queue_str1.printf();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        boolean b12 = queue_str1.enqueue("hi!");
        java.lang.String str13 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        boolean b12 = queue_str1.isEmpty();
        boolean b13 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str13 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str1 = new br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b11 = queue_str1.enqueue("hi!");
        java.lang.String str12 = queue_str1.element();
        boolean b14 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        boolean b14 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b16 = queue_str1.isEmpty();
        java.lang.String str17 = queue_str1.element();
        java.lang.String str18 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("");
        java.lang.String str9 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b12 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str13 = queue_str1.element();
        java.lang.String str14 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("");
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 10);
        queue_str1.printf();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("");
        java.lang.String str7 = queue_str1.element();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.dequeue();
        boolean b5 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b3 = queue_str1.isEmpty();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.element();
        boolean b12 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.element();
        java.lang.String str10 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("");
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.element();
        boolean b13 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b11 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b7 = queue_str1.enqueue("");
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        boolean b14 = queue_str1.isEmpty();
        java.lang.String str15 = queue_str1.element();
        boolean b16 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str1 = new br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(1);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        boolean b10 = queue_str1.isEmpty();
        boolean b12 = queue_str1.enqueue("hi!");
        boolean b14 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        boolean b12 = queue_str1.enqueue("");
        boolean b14 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str16 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        boolean b20 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str6 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str1 = new br.ufal.ic.myQueue.Queue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        boolean b14 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b7 = queue_str1.isEmpty();
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        boolean b13 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b14 = queue_str1.enqueue("hi!");
        java.lang.String str15 = queue_str1.dequeue();
        java.lang.String str16 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        boolean b8 = queue_str1.isEmpty();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        boolean b5 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.dequeue();
        boolean b13 = queue_str1.enqueue("");
        boolean b14 = queue_str1.isEmpty();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.element();
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        java.lang.String str13 = queue_str1.dequeue();
        java.lang.String str14 = queue_str1.dequeue();
        boolean b16 = queue_str1.enqueue("hi!");
        java.lang.String str17 = queue_str1.element();
        boolean b18 = queue_str1.isEmpty();
        boolean b20 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        java.lang.String str11 = queue_str1.element();
        boolean b12 = queue_str1.isEmpty();
        boolean b13 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        boolean b7 = queue_str1.enqueue("hi!");
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.isEmpty();
        boolean b12 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str10 = queue_str1.element();
        boolean b11 = queue_str1.isEmpty();
        boolean b12 = queue_str1.isEmpty();
        java.lang.String str13 = queue_str1.element();
        boolean b15 = queue_str1.enqueue("hi!");
        boolean b16 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.enqueue("");
        java.lang.String str10 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b12 = queue_str1.isEmpty();
        boolean b14 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("");
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        boolean b9 = queue_str1.enqueue("hi!");
        java.lang.String str10 = queue_str1.element();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 1);
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("");
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b13 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str15 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("");
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("");
        java.lang.String str5 = queue_str1.element();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("");
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        boolean b11 = queue_str1.enqueue("");
        java.lang.String str12 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.dequeue();
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.element();
        boolean b5 = queue_str1.isEmpty();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        boolean b12 = queue_str1.enqueue("");
        java.lang.String str13 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("");
        boolean b12 = queue_str1.enqueue("");
        boolean b13 = queue_str1.isEmpty();
        boolean b15 = queue_str1.enqueue("hi!");
        java.lang.String str16 = queue_str1.dequeue();
        boolean b17 = queue_str1.isEmpty();
        boolean b19 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        java.lang.String str12 = queue_str1.dequeue();
        boolean b14 = queue_str1.enqueue("hi!");
        java.lang.String str15 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        java.lang.String str13 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b16 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b5 = queue_str1.enqueue("");
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        java.lang.String str9 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b10 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 0);
        queue_str1.printf();
        queue_str1.printf();
        boolean b5 = queue_str1.enqueue("");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("");
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.element();
        java.lang.String str4 = queue_str1.dequeue();
        java.lang.String str5 = queue_str1.element();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.dequeue();
        boolean b5 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.isEmpty();
        boolean b8 = queue_str1.enqueue("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        java.lang.String str8 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.dequeue();
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) -1);
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b6 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("");
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b8 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b12 = queue_str1.isEmpty();
        java.lang.String str13 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        boolean b8 = queue_str1.isEmpty();
        boolean b10 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.dequeue();
        java.lang.String str13 = queue_str1.element();
        boolean b15 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        boolean b9 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        boolean b3 = queue_str1.enqueue("");
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        boolean b7 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        boolean b11 = queue_str1.isEmpty();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.element();
        java.lang.String str15 = queue_str1.dequeue();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("");
        boolean b13 = queue_str1.enqueue("");
        boolean b15 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.dequeue();
        boolean b8 = queue_str1.enqueue("");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        queue_str1.printf();
        java.lang.String str3 = queue_str1.dequeue();
        java.lang.String str4 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        java.lang.String str3 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.element();
        boolean b7 = queue_str1.enqueue("hi!");
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (short) 0);
        queue_str1.printf();
        boolean b3 = queue_str1.isEmpty();
        java.lang.String str4 = queue_str1.dequeue();
        boolean b5 = queue_str1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        boolean b9 = queue_str1.isEmpty();
        java.lang.String str10 = queue_str1.dequeue();
        boolean b12 = queue_str1.enqueue("");
        java.lang.String str13 = queue_str1.element();
        queue_str1.printf();
        boolean b16 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b4 = queue_str1.enqueue("hi!");
        boolean b6 = queue_str1.enqueue("hi!");
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        boolean b10 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b13 = queue_str1.enqueue("hi!");
        java.lang.String str14 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.dequeue();
        java.lang.String str6 = queue_str1.element();
        boolean b8 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        boolean b6 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        java.lang.String str8 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        queue_str1.printf();
        boolean b8 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        queue_str1.printf();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        boolean b8 = queue_str1.enqueue("");
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 100);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b4 = queue_str1.isEmpty();
        boolean b5 = queue_str1.isEmpty();
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.element();
        boolean b12 = queue_str1.isEmpty();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        queue_str1.printf();
        java.lang.String str3 = queue_str1.element();
        queue_str1.printf();
        boolean b6 = queue_str1.enqueue("");
        java.lang.String str7 = queue_str1.element();
        boolean b9 = queue_str1.enqueue("hi!");
        boolean b11 = queue_str1.enqueue("hi!");
        boolean b13 = queue_str1.enqueue("");
        java.lang.String str14 = queue_str1.element();
        boolean b15 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.element();
        java.lang.String str8 = queue_str1.element();
        queue_str1.printf();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.dequeue();
        boolean b13 = queue_str1.enqueue("");
        boolean b14 = queue_str1.isEmpty();
        boolean b16 = queue_str1.enqueue("hi!");
        boolean b18 = queue_str1.enqueue("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>(0);
        java.lang.String str2 = queue_str1.element();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        boolean b6 = queue_str1.enqueue("hi!");
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        boolean b9 = queue_str1.isEmpty();
        boolean b11 = queue_str1.enqueue("");
        boolean b13 = queue_str1.enqueue("");
        boolean b15 = queue_str1.enqueue("");
        boolean b16 = queue_str1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) 0);
        boolean b3 = queue_str1.enqueue("hi!");
        boolean b5 = queue_str1.enqueue("");
        boolean b6 = queue_str1.isEmpty();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.element();
        java.lang.String str9 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b2 = queue_str1.isEmpty();
        java.lang.String str3 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        queue_str1.printf();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        java.lang.String str3 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b4 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        boolean b7 = queue_str1.enqueue("");
        boolean b9 = queue_str1.enqueue("hi!");
        queue_str1.printf();
        queue_str1.printf();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) (byte) -1);
        boolean b3 = queue_str1.enqueue("hi!");
        java.lang.String str4 = queue_str1.element();
        java.lang.String str5 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        boolean b9 = queue_str1.isEmpty();
        boolean b10 = queue_str1.isEmpty();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) 'a');
        java.lang.String str2 = queue_str1.dequeue();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.element();
        java.lang.String str6 = queue_str1.element();
        java.lang.String str7 = queue_str1.dequeue();
        java.lang.String str8 = queue_str1.dequeue();
        java.lang.String str9 = queue_str1.dequeue();
        queue_str1.printf();
        java.lang.String str11 = queue_str1.element();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        br.ufal.ic.myQueue.Queue<java.lang.String> queue_str1 = new br.ufal.ic.myQueue.Queue<java.lang.String>((int) '#');
        java.lang.String str2 = queue_str1.element();
        boolean b3 = queue_str1.isEmpty();
        boolean b4 = queue_str1.isEmpty();
        java.lang.String str5 = queue_str1.dequeue();
        boolean b6 = queue_str1.isEmpty();
        boolean b7 = queue_str1.isEmpty();
        java.lang.String str8 = queue_str1.element();
        boolean b10 = queue_str1.enqueue("");
        boolean b11 = queue_str1.isEmpty();
        java.lang.String str12 = queue_str1.element();
        queue_str1.printf();
        java.lang.String str14 = queue_str1.element();
        java.lang.String str15 = queue_str1.dequeue();
        java.lang.String str16 = queue_str1.element();
        java.lang.String str17 = queue_str1.element();
        java.lang.String str18 = queue_str1.dequeue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }
}

