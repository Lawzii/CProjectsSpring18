package interfaceEx;

public class MyBar extends Bar {

	
	@Override
	public double costOfBeverage(Drink k) {
		double price;
		
		if (k.type() == 'W') {
			price = 10.00;
		} else if ( k.type() == 'R') {
			price = 20.00;
		} else {
			price = 15.00;
		}
		
		if (k.year() < 1980) {
			price += 9.85;
		} else if (k.year() < 1990) {
			price += 5.75;
		} else {
			price += 0.0;
		}
		
		return price;
	}

}
