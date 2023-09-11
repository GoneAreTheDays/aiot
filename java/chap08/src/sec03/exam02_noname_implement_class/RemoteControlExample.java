package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /*���๮*/ }	
			public void turnOff() { /*���๮*/ }
			public void setVolume(int volume) { /*���๮*/ }
		};
	}
}

public class Cat implements Soundable {
	@Override 
	public String sound() {
		return "야옹";
	}
	
}
