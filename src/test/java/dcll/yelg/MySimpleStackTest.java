package dcll.yelg;

import junit.framework.TestCase;

/**
 * Created by HP on 19/02/2016.
 */

//reponse à l'éxigence #3
public class MySimpleStackTest extends TestCase {

    public void testPop() throws Exception {
        MySimpleStack  stack=new MySimpleStack();


        assertEquals(null,stack.pop());
    }

    public void testIsEmpty() throws Exception {
        MySimpleStack  stack=new MySimpleStack();
        assertTrue(stack.isEmpty());


    }

    public void testGetSize() throws Exception {
        MySimpleStack  stack=new MySimpleStack();
        assertEquals(0,stack.getSize());


    }

    public void testPush() throws Exception {
        MySimpleStack  stack=new MySimpleStack();

    }

    public void testPeek() throws Exception {
        MySimpleStack  stack=new MySimpleStack();

        assertEquals(null,stack.peek());

    }
}