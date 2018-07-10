
public class Olympics {

	public static void main(String[] args) {

		Athlete athlete= new Athlete("Gowan Alyssa", "Running and Swimming", "USA");
		
		athlete.medal('G');
		athlete.time(97.8);
		
		System.out.println(athlete.getEvent() + " " + athlete.getMedal() + " " + athlete.getTime());
		
	
	
	
	}

}
