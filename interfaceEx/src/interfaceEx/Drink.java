package interfaceEx;

import java.util.Random;

public class Drink implements wine {

	@Override
	public char type() {
		
		Random r = new Random();
		int num = r.nextInt(4);
		
		if (num == 0) {
		return 'W';
		} else if (num == 1) {
		return 'R';
		}else { 
		return 'O';
		}
	}

	@Override
	public int year() {
		
		Random r = new Random();
		int num = r.nextInt(4);
		
		if (num == 0) {
		return 1979;
		} else if (num == 1) {
		return 1985;
		}else { 
		return 2000;
		}
	}

	@Override
	public String location() {
		
		Random r = new Random();
		int num = r.nextInt(4);
		
		if (num == 0) {
		return "California";
		} else if (num == 1) {
		return "Italy";
		}else { 
		return "New Zealand";
		}
	}

}
