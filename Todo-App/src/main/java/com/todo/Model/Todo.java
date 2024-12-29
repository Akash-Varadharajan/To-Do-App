package com.todo.Model;


import java.time.LocalDate;


public class Todo {
	
	private int id;
    private String title;
    private String email;
    private String description;
    private LocalDate targetDate;
    private String status;
    

	public Todo() {
		
	}
	
	
	
	public Todo(String title, LocalDate targetDate, String status) {
		super();
		this.title = title;
		this.targetDate = targetDate;
		this.status = status;
	}



	public Todo(String title, String email, String description, LocalDate targetDate, String status) {
		super();
		this.title = title;
		this.email = email;
		this.description = description;
		this.targetDate = targetDate;
		this.status = status;
	}
	
	
	
	
	public Todo(int id, String title, String email, String description, LocalDate targetDate, String status) {
		super();
		this.id = id;
		this.title = title;
		this.email = email;
		this.description = description;
		this.targetDate = targetDate;
		this.status = status;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    

    
	
    
    
    

}
