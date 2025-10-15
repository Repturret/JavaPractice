package exam1015;

public abstract class Pizza {
	
	public String name;
	int[] price = {0, 0, 0};
	public String size;
	
	
	public void cook() {
		System.out.println(name + " " + size + "사이즈를 조리합니다.");
		System.out.println(name + " " + size + "사이즈가 완성되었습니다.");
	}
	
	public void serve() {
		System.out.println(name + " " + size + "사이즈를 드립니다. 가격은 "
						   + (size == "S" ? price[0] : (size == "M" ? price[1] : price[2])) 
						   + "원입니다.");	
	}

}
