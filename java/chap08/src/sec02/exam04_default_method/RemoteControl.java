package sec02.exam04_default_method;

public interface RemoteControl {
	// ���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// �߻� �޼ҵ�
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
