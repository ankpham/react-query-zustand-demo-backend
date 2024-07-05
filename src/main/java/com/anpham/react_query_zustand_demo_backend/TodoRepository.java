package com.anpham.react_query_zustand_demo_backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
	
	private static List<Todo> todos = new ArrayList<>();;
	
	static {
		todos.add(new Todo(0, "Clean Room", "Dust shelves, vacuum carpet", false));
		todos.add(new Todo(1, "Roach Extermination", "Use duster, spray, IGR pads", false));
		todos.add(new Todo(2, "Coding", "Fix translation rerender", true));
		todos.add(new Todo(3, "Coding", "Learn react-query and Zustand", false));		
		todos.add(new Todo(4, "Sports", "Play Tennis and swim in the morning", false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}

	public Todo findById(int id) {
		
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
}
