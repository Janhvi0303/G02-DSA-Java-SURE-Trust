package Practice_Examples;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("------Calculator------\n");
		char ch=' ';
		do{
			System.out.println("Enter the first Number ");
			int num1=sc.nextInt();
			
			System.out.println("Enter the second number ");
			int num2=sc.nextInt();
			
			System.out.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n"
					+ "Enter choice");
			int choice=sc.nextInt();
			int result=0;
			switch(choice){
			case 1: 
				result=num1+num2;
				break;
			case 2:
				result=num1-num2;
				break;
			case 3:
				result=num1*num2;
				break;
			case 4:
				if(num2==0){
					System.out.println("Not divisible by zero");
				}
				result=num1/num2;
				break;
			default:
				System.out.println("Invalid choice ");
				continue;
			}
			System.out.println("Result is "+result);
			System.out.println("Do you want to continue (Type 'X' or  'x' to exit)");
			ch=sc.next().charAt(0);
			
				
		}while(ch!='X' && ch!='x');

	}

}
