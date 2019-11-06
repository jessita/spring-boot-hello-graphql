package com.example.helloworld;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class GreetingQuery implements GraphQLQueryResolver {
     public String getGreeting(){
        return "Hello world";
    }
}
