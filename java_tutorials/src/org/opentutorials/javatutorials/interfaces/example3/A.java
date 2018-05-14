package org.opentutorials.javatutorials.interfaces.example3;

interface I1 {
	public void x();
}

interface I2 {
	public void y();
}

class A implements I1, I2 {
	public void x() {}
	public void y() {}
}
