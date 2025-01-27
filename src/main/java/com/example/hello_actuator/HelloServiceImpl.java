package com.example.hello_actuator;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHello() { return "Hello World"; }

}
