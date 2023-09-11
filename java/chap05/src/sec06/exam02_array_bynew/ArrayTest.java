package sec06.exam02_array_bynew;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
		int[] s = new int[5];
		
		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<s.length; i++ ) {
			s[i]=sc.nextInt();
		}
		max=min=s[0];
		for (int i=0; i<s.length; i++ ) {
			max=max>s[i] ? max:s[i];
			min=min<s[i] ? min:s[i];
		}
		System.out.println("최대값은" +max);
		System.out.println("최소값은" +min);
	}

}
