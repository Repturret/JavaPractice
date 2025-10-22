package sec01.exam03;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드이므로 선언만 함
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}
