package sec02.exam02_switch;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'c';
		
		if (grade=='a') {
				System.out.println("우수 회원입니다.");
		}
		else if (grade=='b') {
				System.out.println("일반 회원입니다.");
		}
		else {
			System.out.println("손님입니다.");
		}
	}
}

