package sec07.exam03_constructor_overloading;

import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		System.out.print("3개의 정수를 입력하세요");
		int n1,n2,n3,min,max;
		
		Scanner sc= new Scanner(System.in);
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		
		if (n1>n2) {
			if (n1>n3) {
				max=n1;
			}
			else {
				max=n3;
			}
		}
		if (n2>n1) {
			if (n2>n3) {
				max=n2;
			}
			else {
				max=n3;
			}
		}
		if (n3>n1) {
			if (n3>n2) {
				max=n3;
			}
			else {
				max=n2;
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}


