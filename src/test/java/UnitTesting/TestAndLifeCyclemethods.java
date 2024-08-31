package UnitTesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

public class TestAndLifeCyclemethods {


    @BeforeAll
    static void InitAll(){
        System.out.println("Before All method \n");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("After All method \n");
    }

    @BeforeEach
    void BeforeAll(){
        System.out.println("@BeforeEach method \n");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("@AfterEach  method \n");
    }


    @Test
    void testmethodsOne(){
        System.out.println("Test method one \n");
    }


    @Test
    void testmethodsTwo(){
        System.out.println("Test method Two \n");
    }

    @Test
    void AbortedTest() {
        System.out.println("Failing the test \n");
        fail("Aborted test method  \n");
    }

    @Test @Disabled("For demo purpose")
    void DisableTest(){
        System.out.println("Test method Two \n");
    }

}
