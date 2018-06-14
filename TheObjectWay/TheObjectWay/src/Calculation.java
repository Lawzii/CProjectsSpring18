// always update the values of a variable through methods (setters and getters) and only through one way to avoid data corruption
public class Calculation {

	public static void main(String[] args) {
		InputOutput calc = new InputOutput(); // this is an object
		calc.message();//message is public so it's allowed to be called on
	}

}
