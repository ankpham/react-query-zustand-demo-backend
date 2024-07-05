package com.anpham.react_query_zustand_demo_backend;

public class Todo {

	private int id;
	private String name;
	private String description;
	private Boolean isComplete;
	
	public Todo() {
		
	}
	
	
	public Todo(int id, String name, String description, Boolean isComplete) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
	
}
