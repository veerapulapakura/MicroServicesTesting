package UnitTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Unittest1 {
    
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
