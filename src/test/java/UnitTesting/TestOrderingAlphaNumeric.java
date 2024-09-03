package UnitTesting;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(Alphanumeric.class)
public class TestOrderingAlphaNumeric {
    @Test
    void ACtringCompare1(){
        String ExpectedName ="Veera";
        String ActualName = "Veera";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Tast 1 completed");
    }

    @Test()
    void BAtringCompare12(){
        String ExpectedName ="Kumar";
        String ActualName = "Kumar";
        assertEquals(ExpectedName,ActualName);
        System.out.println("Tast 2 completed");
    }
}
