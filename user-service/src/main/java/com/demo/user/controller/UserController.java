
package com.demo.user.controller;

import com.demo.user.dto.ApiResponse;
import com.demo.user.dto.ServiceResponse;
import com.demo.user.dto.UserTodoResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

 private final RestTemplate restTemplate;

 public UserController(RestTemplate restTemplate) {
  this.restTemplate = restTemplate;
 }

 @GetMapping("/hello")
 public ServiceResponse helloUser() {
  return new ServiceResponse("user-service", "hello-user");
 }

 @GetMapping("/call-todo")
 public UserTodoResponse callTodoService() {

  ServiceResponse todoResponse =
          restTemplate.getForObject(
                  "http://todo-service/todos/hello",
                  ServiceResponse.class
          );

  return new UserTodoResponse(
          "user-service",
          "response from todo-service",
          todoResponse
  );
 }
}
