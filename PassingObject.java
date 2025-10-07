class Dog{
	int val1;
	int val2;
	
	void setValue(int x,int y){
		val1=x;
		val2=y;
	}
	
	void showValue(){
		System.out.println("Value of val1 : "+val1);
		System.out.println("Value of val2 : "+val2);
	}
}

public class PassingObject{
	public static void main(String[] args){
		Dog dog1=new Dog();
		dog1.setValue(10,20);
		System.out.println("This is Object1");
		dog1.showValue();
		
		Dog dog2=dog1;
		System.out.println("This is Object2");
		dog2.showValue();
		
		System.out.println("After calling the change");
		change(dog1);
		System.out.println("This is Object1 after change");
		dog1.showValue();
		System.out.println("This is Object2 after change");
		dog2.showValue();
	}
	
	public static void change(Dog dog){
		dog.val1=1000;
		dog.val2=2000;
	}
	
}