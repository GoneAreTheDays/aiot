package sec02.exam02_constant_field;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
