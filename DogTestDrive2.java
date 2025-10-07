class Dog{
	String name;
	int size;
	
	void Bark(){
		if(size>20){
			System.out.println("Woof Woof!!!");
		}
		else if(size>15){
			System.out.println("Ruff Ruff!!!");
		}
		else{
			System.out.println("Yup Yup!!");
		}
	}
}

class DogTestDrive2{
	static void main(String args[]){
		Dog dog1=new Dog();
		dog1.size=21;
		
		Dog dog2=new Dog();
		dog2.size=16;
		
		Dog dog3=new Dog();
		dog3.size=10;
		
		
		dog1.Bark();
		dog2.Bark();
		dog3.Bark();
		System.out.println("All Dogs have Done Barking");
	}
}