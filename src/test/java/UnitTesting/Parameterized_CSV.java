package UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterized_CSV {

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "11,22,33",
            "11,10,21"
    })
    public void Testcase1(int num1, int num2, int Expected){
        System.out.println("Test case 1, CSV  Source Example");
        Assertions.assertEquals(num1+num2,Expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csvfile.csv",numLinesToSkip = 0)
    public void Testcase2(int num1, int num2, int Expected){
        System.out.println("Test case 2, CSV file data");
        Assertions.assertEquals(num1+num2,Expected);
    }
}
