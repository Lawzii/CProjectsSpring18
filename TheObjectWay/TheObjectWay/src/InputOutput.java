import java.util.Scanner;

public class InputOutput {
	//specific to only InputOutpuc bc private. 
	private Scanner input = new Scanner (System.in);
	private int val1, val2;
	private double dVal1, dVal2;
	private int selection;
	Calculator myCalc = new Calculator ();
	Scientific sci = new Calculator();
	private int value;
	
	public void message () { // this will retrieve user input to be stored in val1 and val2
		System.out.println("Please enter your first value");
		val1 = input.nextInt();
		System.out.println("Please enter your second value");
		val2 = input.nextInt();
		choice();
	}
	
	public void choice() { // this will save the choice for the switch statement
		System.out.println("Please choose from the menu");
		System.out.println("1. Sum, 2. Subtract, 3. Multiply");
		selection = input.nextInt();
		runChoice ();
	}
	
	public void runChoice() { // using whatever choice the user input, the matching switch statement will run
		switch(selection){
		case 1: 
			value = myCalc.sum(val1,  val2);
			break;
		case 2: 
			value = myCalc.subtract(val1, val2);
			break;
		case 3:
			value = myCalc.multiply(val1, val2);
			break;
		case 4: 
			value = sci.cosine(dVal2);
			break;
		}
		getValue();
	}
	
	public void getValue() {
		System.out.println("Your answer is " +value);
		}
	}


