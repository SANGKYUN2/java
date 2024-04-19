package am;

import java.util.Scanner;

public class Sub01 {
	
	public static void run() {
		
		Scanner scan = new Scanner(System.in);
		boolean stop = false;
		
		String[] names  = new String[100];
		int[] kors = new int[100];
		int[] engs = new int[100];
		int[] mats = new int[100];
		names[0] = "홍길동";
		kors[0] = 97;
		engs[0] = 76;
		mats[0] = 59;
		names[1] = "심청이";
		kors[1] = 86;
		engs[1] = 65;
		mats[1] = 42;
		int count = 2;
		
		System.out.println("성적 관리 프로그램");

		while(!stop) { //stop이 아닌 동안에 실행됨

			System.out.println("╭─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╮");
			System.out.println("\t1 성적 등록 | 2. 성적 출력 | 0. 프로그램 종료 ");
			System.out.println("╰─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╯");
			System.out.print("선택 > ");
			String menu = scan.nextLine();
			
			switch(menu) {
			
			case "1" :
				System.out.print("이름을 입력하세요.");
				String name = scan.nextLine();
				System.out.print("국어 점수를 입력하세요.");
				int kor = Integer.parseInt(scan.nextLine());
				System.out.print("영어 점수를 입력하세요.");
				int eng = Integer.parseInt(scan.nextLine());
				System.out.print("수학 점수를 입력하세요.");
				int mat = Integer.parseInt(scan.nextLine());
				
				names[count] = name;
				kors[count] = kor;
				engs[count] = eng;
				mats[count] = mat;  //mats[count]=Integer.parseInt(mat);
				count = count + 1;
				System.out.println(name + " 학생 등록 완료!");

				break;
				
			case "2" :
				int sum_kor = 0; int sum_eng = 0; int sum_mat = 0;
				for (int i=0; i<count; i++) {
					int tot = kors[i] + engs[i] + mats[i];
					double avg = tot/3;
					String grade = "";
					if(avg >= 90) {
						if(avg >= 95) {
							grade = "A+";
						}
						else 
							grade = "A0";
					}
					else if(avg >= 80) {
						if(avg >= 85) {
							grade = "B+";
						}
						else 
							grade = "B0";
					}
					else if(avg >= 70) {
						if(avg >= 75) {
							grade = "C+";
						}
						else 
							grade = "C0";
					}
					else if(avg >= 60) {
						if(avg >= 65) {
							grade = "D+";
						}
						else 
							grade = "D0";
					
					}
					else {
						grade = "F";
					}

					System.out.printf("%s\t%d점\t%d점\t%d점\t%d점\t%.2f점\t%s\n", 
							names[i], kors[i], engs[i], mats[i], tot, avg, grade);
					
					sum_kor = sum_kor + kors[i];
					sum_eng = sum_eng + engs[i];
					sum_mat = sum_mat + mats[i];
					
				}
					System.out.printf("\t%.2f점\t%.2f점\t%.2f점\n", 
							sum_kor/(float)count, sum_eng/(float)count, sum_mat/(float)count);

					
				
				System.out.println(count + "명 학생이 존재합니다. ");
				System.out.println("출력 완료!");
				break;
				
			case "0" :
				stop = true;
				System.out.println("프로그램을 종료합니다.");
				break;
				
			default :
				System.out.println("0~2번 메뉴를 선택하세요!");
				
			}//switch

			
		}//while

	}//메소드


}//클래스
