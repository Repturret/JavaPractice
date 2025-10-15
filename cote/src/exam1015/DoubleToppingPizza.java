package exam1015;

public class DoubleToppingPizza extends Pizza {
	
	public String topping1;
	public String topping2;
	
	DoubleToppingPizza() {
		this("M", "", "");
	}
	
	DoubleToppingPizza(String size, String topping1, String topping2) {
		this.size = size;
		name = "치즈피자";
		this.topping1 = topping1;
		this.topping2 = topping2;
		price[0] = 17000; price[1] = 19000; price[2] = 21000;
	}
	
	@Override
	public void cook() {
		System.out.println(topping1 + "를 추가합니다.");
		System.out.println(topping2 + "를 추가합니다.");
		super.cook();
	}
	
	@Override
	public void serve() {
		System.out.println(topping1 + "(와)과 " + topping2 + "(을)를 넣은 " 
						   + name + " " + size + "사이즈를 드립니다. 가격은 "
						   + (size == "S" ? price[0] : (size == "M" ? price[1] : price[2])) 
						   + "원입니다.");	
	}

}
