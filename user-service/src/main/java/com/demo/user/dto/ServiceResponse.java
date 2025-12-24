package com.demo.user.dto;


import java.time.LocalDateTime;

public class ServiceResponse {

    private String service;
    private String message;
    private LocalDateTime timestamp;

//    // Required by Jackson
//    public ServiceResponse() {
//    }

    // ✅ ADD THIS
    public ServiceResponse(String service, String message) {
        this.service = service;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getService() {
        return service;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}


