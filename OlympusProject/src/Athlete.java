
public class Athlete extends Olympian implements Running, Swimming { //implement as many by seperating with commas

	double aTime;
	char aMedal;
	
	public Athlete(String name, String event, String country){
		super(name, event, country);
	}

	@Override
	public void time(double var) {
		aTime = var;
	}

	@Override
	public void medal(char var) {
		aMedal = var;
	}

	@Override
	public String eventType() {
		return "100 Meter Dash";
	}

	@Override
	public double currentRecord() {
		return 42.7;
	}

	@Override
	public int competitors() {
		return 5;
	}

	@Override
	public String swimEvent() {
		return "Freestyle 200m";
	}

	@Override
	public double swimmingRecord() {
		return 57.9;
	}

	@Override
	public int swimmingCompetitors() {
		return 8;
	}
	
	public double getTime() {
		return aTime;
	}
	
	public String getMedal() {
		if (aMedal == 'G') { 
			return "Gold";
		} else if (aMedal == 'S') {
			return "Silver";
		} else if (aMedal == 'B') {
			return "Bronze";
		}else {
			return "None";
		}
	}
	
	
	
	
	
}
	

