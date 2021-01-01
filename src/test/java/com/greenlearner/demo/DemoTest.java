package com.greenlearner.demo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    Demo demo = new Demo();
    @Test
    void howToProtectFromCorona() {
        String expected = "Stay home, Wash Hands and Wear Mask";
        String actual = demo.howToProtectFromCorona();
        assertEquals(expected, actual);
    }

    @Test
    void currentlyInfectedPeople() {
        int Actual = demo.currentlyInfectedPeople(500);
        int expected = 60500;
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