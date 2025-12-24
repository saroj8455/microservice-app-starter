package com.demo.user.dto;

import java.time.LocalDateTime;

public class UserTodoResponse {

    private String service;
    private String message;
    private LocalDateTime timestamp;
    private ServiceResponse data;

    public UserTodoResponse(String service, String message, ServiceResponse data) {
        this.service = service;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.data = data;
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

    public ServiceResponse getData() {
        return data;
    }
}

