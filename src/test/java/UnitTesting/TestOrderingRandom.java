package UnitTesting;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.Random.class)
public class TestOrderingRandom {
    @Test
    void StringCompare(){
        String ExpectedName ="Veera";
        String ActualName = "Veera";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Tast 1 completed");
    }

    @Test()
    void StringCompare2(){
        String ExpectedName ="Kumar";
        String ActualName = "Kumar";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Tast 2 completed");
    }
}
