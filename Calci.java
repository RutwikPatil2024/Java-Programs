import java.util.Scanner;

public class Calci{
	public static void main(String[] args){
		System.out.println("Welcome to My Calculator");
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.print("Enter the number1 (Enter 0 to Quite): ");
			float num1=scanner.nextFloat();
			if(num1==0) break;
			System.out.print("Enter (+,-,*,/): ");
			String operator=scanner.next();
			System.out.print("Enter the number2 : ");
			float num2=scanner.nextFloat();
			
			if(operator.equals("+")){
				float ans=num1+num2;
				System.out.println(num1+" + "+num2+" = "+ans);
			}else if(operator.equals("-")){
				float ans=num1-num2;
				System.out.println(num1+" - "+num2+" = "+ans);
			}
			else if(operator.equals("*")){
				float ans=num1*num2;
				System.out.println(num1+" * "+num2+" = "+ans);
			}
			else if(operator.equals("/")){
				float ans=num1/num2;
				System.out.println(num1+" / "+num2+" = "+ans);
			}
			else{
				System.out.println("Invalid Operator");
			}
			System.out.println();
		}
		System.out.println("Thankyou Visit Again");
	}
}