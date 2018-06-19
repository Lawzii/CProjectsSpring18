
public class Animal {
	private String name;
	private int age;
	
	//contstuctors
	// this is so every animal will have a name
	Animal (String name){ 
		this.name = name; 
	}
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	//end constructors
	
	public String sound () {
		return "Animal Sound";	
}

	//setter and getter retrieved by right click > source > setter and getter
	//for name
	public String getName() { 
		return name;
	}
	
	public void setName(String name) { // name represents local name and this.name represents instance name (from private String)
		this.name = name;
	}
	//end name
	
	//for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//end age
	
	//overwriting is taking a method that exists from inheritance an changing its behavior
	public String toString() {
		return "Animal object with the name " + getName();
	}

}
