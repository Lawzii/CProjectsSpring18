
public abstract class Olympian {

	
	private String name;
	private String event;
	private String Slogan = "Go for the gold!";
	private String country;
	
	public Olympian(String name, String event, String country) {
		super();
		this.name = name;
		this.event = event;
		this.country = country;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSlogan() {
		return Slogan;
	} 
	
	//Time for finishing event
	public abstract void time (double var);
	
	//medal finish
	public abstract void medal(char var);
	
	
	
	
	
	
	
	
	
	
	
	
}
