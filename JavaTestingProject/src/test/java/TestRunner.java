/**
 * Created by student on 16.02.2017.
 */

import org.junit.runner.JUnitCore; // core where test run
import org.junit.runner.Result; // print result and explain
import org.junit.runner.notification.*; // messages

public class TestRunner {

    //main
    //static -only in one instance
    public static void main(String[] args){


        Result test_result = JUnitCore.runClasses(TestJUnit.class); //collection

        // collection
        /*
       for (type element : List ){

           // iteration


       }
       */
        // Failure => test_result.getFailures()

        for (Failure test_notOK : test_result.getFailures())
        {
           System.out.print(test_notOK.toString()); // convert to text
        }


        System.out.print("Hello Test Junoir!!!");

    }
}
