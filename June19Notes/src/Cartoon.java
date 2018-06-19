
public class Cartoon {
	private String name;
	private int age;
	
	Cartoon(String name){
		this.name = name;
	}
	
	Cartoon (String name, int age) {
		this.name = name ; 
		this.age = age; 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String slogan () {
		return "I can go the distance" ;
	}

	public String toString() {
		return  getName() + " " + slogan() + " "+ getAge();
}
	
public static void main(String[] args) {
		
		Cartoon myCartoon = new Cartoon("Hercules");

		System.out.println(myCartoon.toString());

}
}