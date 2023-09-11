package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1~100 ������ ��		
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0, inNum =0;
		
		System.out.println("1부터 100사이의 숫자를 입력하세요.");
		
		do {
			
			inNum = sc.nextInt();
			if (inNum > ran )
				System.out.println("작은 수를 입력하세요.");
			else if (inNum < ran)
				System.out.println("큰 수를 입력하세요.");
			cnt++;			
		} while (ran != inNum);
		
		System.out.println(cnt+"번에 맞쳤습니다.");
		
		sc.close();

	}

}
