package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		if (true && true) {
			System.out.println(1);
		}
		
		if (true && false) {
			System.out.println(1);
		}
		
		if (false && true) {
			System.out.println(1);
		}
		
		if (false && false) {
			System.out.println(1);
		}
	}

}