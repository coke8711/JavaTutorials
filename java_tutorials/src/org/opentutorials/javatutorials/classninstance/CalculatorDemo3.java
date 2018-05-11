package org.opentutorials.javatutorials.classninstance;

class Calulator3{
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}


public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		Calulator3.sum(10, 20);
		Calulator3.avg(10, 20);
		
		Calulator3.sum(20, 40);
		Calulator3.avg(20, 40);
	}
}
