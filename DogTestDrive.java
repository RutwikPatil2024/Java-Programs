class Dog{
	String name;
	String breed;
	int size;
	
	void Display(){
		System.out.println("Name : "+name);
		System.out.println("Breed : "+breed);
		System.out.println("Size : "+size);
	}
	
	void Bark(){
		System.out.println("Buff Buff");
	}
}

public class DogTestDrive{
	public static void main(String[] args){
		Dog d=new Dog();
		d.name="Labby";
		d.breed="male";
		d.size=20;
		
		d.Display();
		d.Bark();
	}
}