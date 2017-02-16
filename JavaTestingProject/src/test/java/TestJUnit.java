import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by student on 16.02.2017.
 */
public class TestJUnit {

    @Test
    public void testOK(){

        assertEquals(1,1);

        System.out.print("TestOK done! ");
    }

    @Test
    public void testOK2(){

        assertEquals(1,4);

        System.out.print("TestOK2 done! ");
    }

    @Test
    public void testOK3(){

        assertNotNull(null);

        System.out.print("TestOK3 done! ");
    }

    @Test
    public void testOK4(){

        assertFalse(3>6);

        assertTrue(3>6);
        System.out.print("TestOK4 done! ");
    }

}
