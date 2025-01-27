package com.example.hello_actuator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceImplTest {

    @Test
    public void testHello() {
        HelloService helloService = new HelloServiceImpl();
        String result = helloService.getHello();
        assertEquals("Hello World", result);
    }

}