package exam1015;

public class PepperoniPizza extends Pizza {
	
	public String toppings;
	
	PepperoniPizza() {
		this("M");
	}
	
	PepperoniPizza(String size) {
		this.size = size;
		name = "페퍼로니피자";
		price[0] = 16000; price[1] = 18000; price[2] = 20000;
		toppings = "페퍼로니";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "를 추가합니다.");
		super.cook();
	}

}
