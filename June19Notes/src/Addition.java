
public class Addition {
	// example of method overloading, java differentiates between method by the arguments required
	//overloaded methods are not allowed to have matching arguments
	public int sum (int a, int b) {
		return a +b;	
	}
	
	public double sum (double a, double b) {
		return a + b;
	}
	
	public int sum (int a, int b, int c) {
		return a + b + c;
	}
}
