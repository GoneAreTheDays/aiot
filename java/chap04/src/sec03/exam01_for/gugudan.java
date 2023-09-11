package sec03.exam01_for;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dan=2; dan<=9; dan++) {
			System.out.print("["+dan+"단]"+"\t");
		}
		System.out.println();
		for(int m=1; m<=9; m++) {
		
			for(int n=2; n<=9; n++) {
			System.out.print(n+"*"+m+"="+(m*n)+"\t");		
			}	
			System.out.println();
		}
	}

}
