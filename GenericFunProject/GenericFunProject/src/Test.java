import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Bear bear = new Bear();
		Car car = new Car();
		GenericFun gf = new GenericFun();

	String answer = gf.playGenerics(animal);
		System.out.println(answer);

		answer = gf.playGenerics(bear);
		System.out.println(answer);

		//answer = gf.playGenerics(car); <--- gives and error because it has been limited and isn't in the animal inheritance tree

		ArrayList<Integer> myIntList = new ArrayList<Integer>();
		ArrayList<Double> myDoubleList = new ArrayList<Double>();
		ArrayList<String> myStringList = new ArrayList<String>();


		for (int i = 0; i < 5 ; i++){
			myIntList.add(i);
		}

		for (int i = 0; i < 5 ; i++){
			myDoubleList.add(i * 3.2);
		}

		myStringList.add("Va");
		myStringList.add("le");
		myStringList.add("nc");
		myStringList.add("ia");

	gf.useWildcard(myIntList);
	gf.useWildcard(myDoubleList);
	//gf.useWildcard(myStringList); <-- error because it does not extend Number data type

	}

}
