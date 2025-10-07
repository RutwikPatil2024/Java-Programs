public class Dog{
	String name;
	public static void main(String[] args){
		//create the Dog object
		Dog dog1=new Dog();
		dog1.name="fido";
		dog1.bark();
		
		//create the Dog array
		Dog[] myDogs=new Dog[3];
		myDogs[0]=new Dog();
		myDogs[1]=new Dog();
		myDogs[2]=dog1;
		
		myDogs[0].name="Sido";
		myDogs[1].name="Mido";
		
		int x=0;
		while(x<myDogs.length){
			System.out.println(myDogs[x].name);
			myDogs[x].bark();
			x=x+1;
		}
	}

	public void bark(){
		System.out.println("BOG BOG BOG!!!");
	}
	
	public void chaseCat(){
		System.out.println("Chaising the Cat");
	}
}