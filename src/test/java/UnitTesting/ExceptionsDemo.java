package UnitTesting;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class ExceptionsDemo {

    @DisplayName("This is to tell nested Example")
    @Nested
    class nestedEx{
        @Test @DisplayName("This is RuntimeException scenario")
        public void calculator(){
            int num1 = 1100;
            int num2 = 2030;
            if(num1 < 300 || num2< 300)
                throw new RuntimeException("Number is less than -100");
        }

        //@Test
        public void calculator2(){
            int num1 = -100;
            int num2 = -200;
            if(num1 < 300 || num2< 30)
                throw new RuntimeException("Number is less than 30");
            //Assertions.assertThrows("Number is less than -100");

        }


        @Test @DisplayName("This is to tell the funtion name")
        @RepeatedTest(12)
        public void calculatorAdd(){
            int num1 = 1100;
            int num2 = 2030;
            int sum = num1+num2;
            System.out.println("Sum of the 2 numbers  is " + sum);
            Assertions.assertEquals(sum,3130);

        }
    }



    @Test @DisplayName("This is to tell the multiplication funtion name")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void calculatorMultiply(){
        int num1 = 1100;
        int num2 = 2030;
        int sum = num1+num2;
        System.out.println("Multiply  of the 2 numbers  is " + sum);
        Assertions.assertEquals(sum,3130);
    }


    @Test @DisplayName("This is to demo assertion  libraies")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void assertionLibraries(){
        int num1 = 1100;
        int num2 = 2030;
        int sum = num1+num2;
        System.out.println("Assertions ");
        System.out.println("Multiply  of the 2 numbers  is " + sum);
        Assertions.assertNotNull(sum);
        String name = "Veera";
        Assertions.assertTrue(name.equals("Veera"));
    }

    @Test @DisplayName("This is to demo AssertAll")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void assertionAll(){
        int num1 = 1100;
        int num2 = 2030;
        int sum = num1+num2;
        System.out.println("Assertions  all");
        Assertions.assertAll("Assert all test cases",
                ()->assertEquals(123,123),
                ()->assertEquals(123,123));
    }
}


