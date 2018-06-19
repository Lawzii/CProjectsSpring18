
public class zoo {

	public static void main(String[] args) {
		
		Animal myAnimal = new Animal("Yogi"); // creates the Animal(); constructor
		
		
		String myName = myAnimal.getName();
		System.out.println(myName);
		myAnimal.setName("Winnie the Pooh");
		System.out.println(myAnimal.getName());
		System.out.println(myAnimal.toString()); //default toString points to class name and its memory location
		
		Addition calc = new Addition();
		System.out.println(calc.sum(5,  4));
		
	}

}
