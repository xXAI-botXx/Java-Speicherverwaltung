package Beispiel_1;

public class Start {

	public Start(int alter, String name) {
		Dog dog1= new Dog(alter, name);
		Dog dog2 = new Dog();
		
		dog1.woof();
		System.out.println("\n\n");
		dog2.woof();
	}
	
	public static void main(String[] args) {
		new Start(3, "Jim");
	}
}
