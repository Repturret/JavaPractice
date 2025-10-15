package exam1015;

public class CheesePizza extends Pizza {
	
	CheesePizza() {
		this("M");
	}
	
	CheesePizza(String size) {
		this.size = size;
		name = "치즈피자";
		price[0] = 15000; price[1] = 17000; price[2] = 19000;
	}
	
}
