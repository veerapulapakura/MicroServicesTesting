package UnitTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.IntStream;

public class ParameteriedTesting {

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"abc","def","frg"})
    void Testcase1(String arg){
        System.out.println("The values are "  + arg);

    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"abc","def","frg"})
    @EmptySource
    void Testcase2(String arg){
        System.out.println("Empty Source"  + arg);

    }

    @Test
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"abc","def","frg"})
    @EmptySource
    void Testcase3(String arg){
        System.out.println("Null Source "  + arg);

    }

    @Test
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"abc","def","frg"})
    @EmptySource
    void Testcase5(String arg){
        System.out.println("Null pointer exception and Empty source "  + arg);

    }


    @Test @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void Testcase6(int arg){
        System.out.println("Parameterizing int values are "  + arg);
    }

    @Test @ParameterizedTest
    @MethodSource("intRange")
    void Testcase7 (int arg){
        //System.out.println("Method Source Explanation");
        System.out.println("Method Source Explanation are \n"  + arg);
    }

    static IntStream intRange(){
        return IntStream.range(10,40);

    }
}
