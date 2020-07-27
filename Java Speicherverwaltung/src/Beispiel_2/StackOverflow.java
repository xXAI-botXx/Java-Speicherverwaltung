package Beispiel_2;

public class StackOverflow {
	
	public void sagHallo() {
		System.out.println("Hallo");
		netteGeste();
	}
	
	public void netteGeste() {
		System.out.println("*Wink*Wink*");
		sagHallo();
	}
	
	public static void main(String[] args) {
		StackOverflow overflow = new StackOverflow();
		overflow.sagHallo();
	}
}
