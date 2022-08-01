package com.demoqa;

import org.junit.jupiter.api.*;


public class ExampleJunit5test {
    //данная метка распространяется на все тесты в классе
    @BeforeAll
    static void configure() {
        System.out.println("This is @Beforeall");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("This is @Afterall");
    }

    @BeforeEach
    void beforetest(){
        System.out.println(" This is @Beforeeach");

    }

    @AfterEach
    void aftertest(){
        System.out.println(" This is @Aftereach");

    }

    @Test
    void FirstTest0() {
        Assertions.assertTrue(3>2);
        System.out.println("  This is test0");
            }
    @Test
    void FirstTest1() {
        Assertions.assertTrue(4>2);
        System.out.println("  This is test1");
    }

}

