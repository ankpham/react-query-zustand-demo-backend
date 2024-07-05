package com.anpham.react_query_zustand_demo_backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {
	
	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("/find-all")
	public List<Todo> retrieveAllTodos() {
		return todoRepository.findAll();
	}
	

	@PostMapping("/find-by-id")
	public Todo retrieveTodoById(@RequestBody TodoRequest request) {
		return todoRepository.findById(request.getId());
	}
}
