package com.endPointTech.springContext.objectInjection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	public int id;
	private String name;
	private String address;
	private boolean active;
	private Laptop laptop;
	
	public void init() {
		System.out.println(this.name+" bean created.");
	}
	public void destroy() {
		System.out.println(this.name+" bean destroyed.");
	}

}
