package exam1015;

public class OrderItem {
	
	Menu menuInfo;
	int quantity;
	
	
	OrderItem(Menu menuInfo, int quantity) {
		this.menuInfo = menuInfo;
		this.quantity = quantity;
	}
	
	
	public int getTotalPrice() {
		return menuInfo.price * quantity;
	}

}