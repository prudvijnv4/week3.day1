package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("1 TB");
	}
	
	public static void main(String[] args) {
		
	Desktop sys = new Desktop();
	sys.desktopSize();
	sys.computerMode();
	System.out.println(sys);
	}

	
}
