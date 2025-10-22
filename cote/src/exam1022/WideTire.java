package exam1022;

public class WideTire extends Tire {
	
	public int width;
	
	public WideTire(String model, int maxRpm, int width) {
		super(model, maxRpm);
		this.width = width;
	}

}
