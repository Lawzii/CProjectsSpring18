import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 72 ;
		double money = 54.87 ;
		float percentage = .25f ;
		char letter = 'B' ;
		
		System.out.println("My age is " + age ); //println includes \n 
		System.out.println("new line");
		System.out.print("The money is " + money); //use just 'print' for no newline. 
		System.out.print(" and the percentage is " + percentage + "\n");
		System.out.printf("My age is really %d \n", age) ;
		
		
		Scanner input = new Scanner (System.in); //standard library does not incl. scanner, be sure to import.
		System.out.println("Please enter your age. ");
		age  = input.nextInt(); // age will contain the input value
		System.out.println("The new age is "+ age);
		
		
		
		
	}

}
