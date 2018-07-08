package com.example.demo.controller;

public class DummyModel {

	long id;
	String name;
	
	public DummyModel(long id, String name) {
		this.id = id;
		this.name=name;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
