package exam1022;

public class Tire {
	
	public String model;
	public int maxRpm;
	public int nowRpm = 0;
	
	public Tire(String model, int maxRpm) {
		this.model = model;
		this.maxRpm = maxRpm;
	}
	
	public boolean Roll() {
		return ++nowRpm <= maxRpm;
	}

}
