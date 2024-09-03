package UnitTesting;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderByOrder {
    @Test
    @Order(4)
    void ACtringCompare12(){
        String ExpectedName ="Veera";
        String ActualName = "Veera";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Test order 4 completed");
    }

    @Test()
    @Order(3)
    void BAtringCompare13(){
        String ExpectedName ="Kumar";
        String ActualName = "Kumar";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Test order 3  completed");
    }

    @Test()
    @Order(2)
    void BAtringCompare14(){
        String ExpectedName ="Kumar";
        String ActualName = "Kumar";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Test order 2  completed");
    }


    @Test()
    @Order(5)
    void BAtringCompare15(){
        String ExpectedName ="Kumar";
        String ActualName = "Kumar";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Test order 5  completed");
    }


    @Test()
    @Order(1)
    void BAtringCompare16(){
        String ExpectedName ="Kumar";
        String ActualName = "Kumar";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Test order 1  completed");
    }

}
