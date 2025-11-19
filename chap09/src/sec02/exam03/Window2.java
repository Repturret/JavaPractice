package sec02.exam03;

public class Window2 {
	
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = () -> System.out.println("전화를 겁니다.");
	
	Window2() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(() -> System.out.println("메세지를 보냅니다."));
	}

}
