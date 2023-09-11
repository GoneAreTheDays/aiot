package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();	// abstract method
		rc.setMute(true);	// default method
		
		rc = new Audio();
		rc.turnOn();	// abstract method
		rc.setMute(true);	// default method
	}
}
