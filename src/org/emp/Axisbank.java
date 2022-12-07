package org.emp;

public abstract class Axisbank {
// abstract methods
	public abstract void fixed();
	
	public abstract void deposit();
	
//Non abstract methods	
	public void savings() {
		System.out.println("7%");
	}
}
