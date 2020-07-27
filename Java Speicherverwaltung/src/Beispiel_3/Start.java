package Beispiel_3;

public class Start {

	public Start(int alter, String name) {
		Dog dog1= new Dog(alter, name);
		Dog dog2 = new Dog();
		Dog dog3 = new Dog(0, "Emilia");
		
		dog1 = null;	//dog1 = X
		
		dog2 = dog3;	//dog2 = X
	}
	
	public static void main(String[] args) {
		new Start(3, "Jim");	
		//dog3 = X
	}
}
