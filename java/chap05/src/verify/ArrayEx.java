package verify;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] s = new int[8][9]; // 8�� 9��

		// ������ ���η� ���ٷ� ���
		for (int dan = 0; dan <= 7; dan++) { // ��
			System.out.println("[" + (dan + 2) + "��]");
			for (int i = 0; i <= 8; i++) { // ��
				s[dan][i] = (dan + 2) * (i + 1);

				System.out.println((dan + 2) + "*" + (i + 1) + "=" + s[dan][i]);
			}
			System.out.println("");
		}
		
		
		// Ȯ�� for���� �̿�
		System.out.println("*** 향상된 for문을 이용 ***");
		int dan = 2;
		int num;
		for (int[] i: s) {
			System.out.println("[" + dan + "단]");
			num = 1;
			for(int j: i) {
				//s[dan-2][num-1] = dan * num;
				System.out.println(dan+"*"+num+"="+j);
				num++;
			}
			System.out.println("");
			dan++;
		}

	}

}
