package com.example.diamondstore.request;

public class AuthenticationRequest {
    private String username;
    private String password;

    // Need a default constructor for JSON Parsing
    public AuthenticationRequest() {}

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}