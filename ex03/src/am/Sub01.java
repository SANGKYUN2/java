package am;

import java.util.*;

public class Sub01 {	
	
	public static void run() {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> kors = new ArrayList<>();
		ArrayList<Integer> engs = new ArrayList<>();
		ArrayList<Integer> mats = new ArrayList<>();
		
		names.add("라이언");
		kors.add(96);
		engs.add(85);
		mats.add(74);
		names.add("춘식이");
		kors.add(69);
		engs.add(78);
		mats.add(87);
		
		boolean run = true;
		
		while (run) {
		
			System.out.println("\n╭──────────────────────────────────────────────────────╮");
			System.out.println("  1. 성적 등록 | 2. 성적 목록 | 3. 성적 조회 | 4. 성적 삭제 | 0. 종료");
			System.out.println("╰──────────────────────────────────────────────────────╯");
			System.out.print("메뉴를 선택하세요. ➤ ");
			
			String menu = s.nextLine();
			
			System.out.println("");
			
			switch (menu) {
			
			case "1":
				
				System.out.print("이름을 입력하세요. ➤ ");
				names.add(s.nextLine());
				
				System.out.print("국어 성적을 입력하세요. ➤ ");
				kors.add(Integer.parseInt(s.nextLine()));
				
				System.out.print("영어 성적을 입력하세요. ➤ ");
				engs.add(Integer.parseInt(s.nextLine()));
				
				System.out.print("수학 성적을 입력하세요. ➤ ");
				mats.add(Integer.parseInt(s.nextLine()));
				
				System.out.print("이름과 성적이 등록되었습니다.\n");
				
				break;
				
			case "2":
				int sum_kor = 0;
				int sum_eng = 0;
				int sum_mat = 0;
				for(int i=0; i<names.size(); i++) {
					int total = kors.get(i) + engs.get(i) + mats.get(i);
					double avg = total/3;
					
					System.out.printf("이름 : %s | 국어 성적 : %d점 | 영어 성적 : %d점 | 수학 성적 : %d점\n",names.get(i), kors.get(i), engs.get(i), mats.get(i), total, avg);
					
					sum_kor = sum_kor + kors.get(i);
					sum_eng = sum_eng + engs.get(i);
					sum_mat = sum_mat + mats.get(i);
				}
				
				System.out.println("\n╭──────────────────────────────────────────────────────────╮");
				System.out.printf("  국어 성적 합계 : %d점 | 영어 성적 합계 : %d점 | 수학 성적 합계 : %d점\n"
						, sum_kor, sum_eng, sum_mat);
				System.out.println("╰──────────────────────────────────────────────────────────╯");
				
				System.out.println("╭────────────────────────────────────────────────────────────────╮");
				System.out.printf("  국어 성적 평균 : %.2f점 | 영어 성적 평균 : %.2f점 | 수학 성적 평균 : %.2f점\n"
						, sum_kor/(double)names.size(), sum_eng/(double)names.size(), sum_mat/(double)names.size());
				System.out.println("╰────────────────────────────────────────────────────────────────╯");
				
				System.out.println(names.size() + "명 성적이 존재합니다.");
				break;
				
			case "3":
				System.out.print("검색할 이름을 입력하세요 ➤ ");
				String sname = s.nextLine();
				if(sname=="") break;
				boolean find = false;
				for(int i=0; i<names.size(); i++) {
					if(names.get(i).equals(sname)) {
						System.out.printf(sname + "님의 국어 성적은 %d점 입니다.\n", kors.get(i));
						System.out.printf(sname + "님의 영어 성적은 %d점 입니다.\n", engs.get(i));
						System.out.printf(sname + "님의 수학 성적은 %d점 입니다.\n", mats.get(i));
						int total = kors.get(i) + engs.get(i) + mats.get(i);
						System.out.printf(sname + "님의 총합 성적은 %d점 입니다.\n", total);
						System.out.printf(sname + "님의 평균 성적은 %.2f점 입니다.\n",total/3.);
						find = true;
					}
				}
				if(!find) {
					System.out.println(sname + "님은 존재하지 않습니다.");
				}
					
				break;
				
			case "4":
				while (true) {
					System.out.print("어떤 사람의 성적을 삭제하시겠습니까? ");

					String rname = s.nextLine();
					boolean delete = false;
					if(rname=="") break;
					for(int i=0; i<names.size(); i++) {
						if(names.get(i).equals(rname)) {
							System.out.printf(rname + "님의 국어 성적은 %d점 입니다.\n", kors.get(i));
							System.out.printf(rname + "님의 영어 성적은 %d점 입니다.\n", engs.get(i));
							System.out.printf(rname + "님의 수학 성적은 %d점 입니다.\n", mats.get(i));
							int total = kors.get(i) + engs.get(i) + mats.get(i);
							System.out.printf(rname + "님의 총합 성적은 %d점 입니다.\n", total);
							System.out.printf(rname + "님의 평균 성적은 %.2f점 입니다.\n",total/3.);
							delete = true;
								System.out.print("삭제하시겠습니까?? (예/아니요) ");
								String answer = s.nextLine();
								if (answer.equals("예")) {
									names.remove(i);
									kors.remove(i);
									engs.remove(i);
									mats.remove(i);
									System.out.println(rname + "님의 성적을 삭제하셨습니다.\n");
									if (answer.equals("아니요")) {
										break;
									}
//								else (rname.equals(rname)) {
//									System.out.print("입력을 종료합니다.\n");
//									break;
								}
								else {
									System.out.println("삭제를 취소하였습니다.\n");
								}
								
							}
						}
						if(!delete) {
							System.out.println(rname + "님이 존재하지 않습니다.\n");
						}
	
					}
						
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("0~4번 메뉴를 선택하세요.");
				break;
					
			
			
			}//switch
			
		}//while

	}//method

}//class
