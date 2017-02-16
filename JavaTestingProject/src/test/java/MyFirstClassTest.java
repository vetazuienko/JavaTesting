import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 16.02.2017.
 */
public class MyFirstClassTest {

    private MyFirstClass test_class;
    @Before
    public void InitTest(){

        System.out.print("Runnig before all test");
        test_class=new MyFirstClass();

    }

    @BeforeClass //run before only one
    public static void InitTestOnence(){

        System.out.print("Run one time");
        //test_class=new MyFirstClass();

    }

    @Test
    public void sum() throws Exception {

        // arrange

        int first_number=1;
        int second_number=2;

        int expected_result=3;

        // act
        int real_result=test_class.sum(first_number,second_number);


        // assert

        assertEquals(expected_result,real_result);
        System.out.print("Done");

    }

    @Test
    public void mult() throws Exception {


        // arrange

        double first_number=1;
        double second_number=2;

        double expected_result=2;

        // act
        double real_result=test_class.mult(first_number,second_number);


        // assert

        assertEquals(expected_result,real_result,0.00001);

        System.out.print("Mult test finished");

    }

    @Test
    public void repeat(){



        assertEquals(test_class.repeat("Hello"),"Hello");
        assertNotNull(test_class.repeat("Hello"));
        assertNotNull(test_class.repeat("Hello"),"Hello");

    }

}