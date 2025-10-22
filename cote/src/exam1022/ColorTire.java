package exam1022;

public class ColorTire extends Tire {
	
	public String color;
	
	public ColorTire(String model, int maxRpm, String color) {
		super(model, maxRpm);
		this.color = color;
	}

}
