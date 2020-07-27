package Beispiel_3;

public class Dog {

	private int alter;
	private String name;
	
	public Dog(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}
	
	public Dog() {
		alter = (int)(Math.random()*16);
		name = "Bello";
	}
	
	public void woof() {
		System.out.println("Name: "+name+"\nAlter: "+alter);
	}
}
