package com.example.studyone.pattern.filter;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authentication request: " + request);
    }
}
