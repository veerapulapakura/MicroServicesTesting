package com.greenlearner.demo;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)

class DemoTest {
    Demo demo = new Demo();
    @Test
    void howToProtectFromCorona() {
        String expected = "Stay home, Wash Hands and Wear Mask";
        String actual = demo.howToProtectFromCorona();
        System.out.println("First test running ");
        assertEquals(expected, actual);
    }
    @Tag("cat1")
    @DisplayName("This is the method to find the total values of infected people")
    @Test
    //@Timeout(value=1000, unit= TimeUnit.MILLISECONDS)
    void currentlyInfectedPeople() {
        int Actual = demo.currentlyInfectedPeople(500);
        int expected = 60500;
        System.out.println("Second test running");
        assertEquals(expected, Actual, "Expected and Actual are not matching");
    }

    @BeforeAll
    static void beforeAllMethof(){
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }

}