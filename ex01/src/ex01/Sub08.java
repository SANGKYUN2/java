package ex01;

public class Sub08 {
	public static void run() {
//		int[] scores = new int[] {30, 70, 40, 55, 77, 99, 66, 88};
//		for(int i=0; i<scores.length; i=i+1) {
//			System.out.println(scores[i]);
//		}
		
		//배열
		int[] no = new int[] {1, 2, 3};
		String[] name = new String[] {"홍길동", "심청이", "강감찬"};
		String[] juso = new String[] {"인천", "서울", "부산"};
		for(int i = 0; i<no.length; i=i+1) {
			System.out.println(no[i] + "\t" + name[i] + "\t" + juso[i]);
			System.out.println("-------------------------------------");
		}
		
		int[] kor = new int[] {90, 88, 92};
		int[] eng = new int[] {86, 92, 76};
		int[] mat = new int[] {99, 87, 56};
		for(int i = 0; i<no.length; i=i+1) {
			int tot = kor[i] + eng[i] + mat[i];
			double avg = tot/3.;
			String grade ="";
			if (avg >= 90) {
				if (avg >= 95) {
					grade = "A+";
				}
				else {
					grade = "A0";
				}
			}
			else if (avg >= 80) {
				if (avg >= 85) {
					grade = "B+";
				}
				else {
					grade = "B0";
				}
				
			}
			else if (avg >= 70) {
				if (avg >= 75) {
					grade = "C+";
				}
				else {
					grade = "C0";
				}
				
			}
			else if (avg >= 60) {
				if (avg >= 65) {
					grade = "D+";
				}
				else {
					grade = "D0";
				}
				
			}
			else {
				grade = "F";
			}
			//System.out.println(no[i] + "\t" + name[i] + "\t" + tot + "\t" + avg);
			System.out.printf("%d\t%s\t%d\t%.3f\t%s", no[i], name[i], tot, avg, grade);
			System.out.println("");
		}

	}

}
