package com.greenlearner.demo;
import org.junit.jupiter.api.Test;

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
}