package com.revature.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* Stereotype annotation - Annotation above a class definition that
 * indicates that it is a bean Spring can manage
 * 
 * Autowiring styles:
 * 1. Field injection - Not recommended, bad practice
 * 2. Setter Injection - Good, calls setter method to inject
 * 3. Constructor Injection - Good, injects using constructor args
 * 4. Interface Injection - Not supported by Spring
 * 
 */
@Component
public class A {
	/*
	 * Field injection - poor practice
	 */
//	@Autowired
	private B b;

//	@Value("${EM_ROLE}")
	private String myString;

	public B getB() {
		return b;
	}

//	@Autowired // - setter injection
	public void setB(B b) {
		System.out.println("A Setting b");
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "A [b=" + b + ", myString=" + myString + "]";
	}

	@Autowired
	public A(B b, @Value("${EM_ROLE}") String myString) {
		super();
		System.out.println("A Constructor with args");
		this.b = b;
		this.myString = myString;
	}

	public A() {
		super();
		System.out.println("A Constructing without B");
	}

	public String getMyString() {
		return myString;
	}

//	@Value("${EM_ROLE}")
	public void setMyString(String myString) {
		this.myString = myString;
	}

}
