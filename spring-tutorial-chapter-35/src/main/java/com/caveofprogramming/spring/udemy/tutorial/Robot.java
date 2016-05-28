package com.caveofprogramming.spring.udemy.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//Google SPL Spring

@Component
public class Robot {
	
private String id = "Default robot";
private String speech = "hello...";


	public void speak() {
		System.out.println( id + " : " + speech);
	}

	@Autowired
	public void setId(@Value("#{randomText.text?.length()}") String id) {
		this.id = id;
	}

	// new java.util.Date().toString()
	// T(Math).PI - Static
	// T(Math).sin(5)
	// T(Math).sin(T(Math).PI/4)
	// T(Math).sin(T(Math).PI/4) ^ 2
	// T(Math).sin(T(Math).PI/4) ^ 2 lt 0.8
	// T(Math).sin(T(Math).PI/4) ^ 2 le 0.8
	// T(Math).sin(T(Math).PI/4) ^ 2 eq 0.8
	// T(Math).sin(T(Math).PI/4) ^ 2 eq 0.8 ? 'Yes' : 'no'
	@Autowired
	public void setSpeech(@Value("#{ T(Math).sin(T(Math).PI/4) ^ 2 eq 0.8 ? 'Yes' : 'no' }") String speech) {
		this.speech = speech;
	}
}
