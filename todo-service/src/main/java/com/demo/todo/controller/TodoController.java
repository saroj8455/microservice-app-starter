
package com.demo.todo.controller;

import com.demo.todo.dto.ServiceResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/todos")
public class TodoController {

 @GetMapping("/hello")
 public ServiceResponse helloTodo() {
  return new ServiceResponse("todo-service", "hello-todo");
 }
}
