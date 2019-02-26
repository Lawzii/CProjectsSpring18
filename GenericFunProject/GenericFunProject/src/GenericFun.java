import java.util.ArrayList;

public class GenericFun<V> {
	
	public <T extends Animal > String playGenerics(T var, V var2){

		return var.sound();
	}
	
	///cannot bound with super (lowerbound)
	//when using extend that's to find whats below/extended from
	//when using super that's to look for whats above (ie. parents), but you cannot set the lower bound
	/*public <T super Bear> String morePlayGenerics(T var){
		return "some String";
	}
	*/

	
	public void useWildcard(ArrayList<? extends Number> list){  // ? is a wildcard and is read as 'anything'
		for(Number i: list){
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
