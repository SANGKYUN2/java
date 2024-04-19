package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		
		while(true) {
			System.out.print("숫자를 입력하세요. : ");
			String num = s.nextLine();
			
			if(num=="") {
				System.out.print("입력을 종료합니다.\n");
				break;
			}
			else {
				nums.add(Integer.parseInt(num));
			
			}
		}
		//데이터 갯수, 수 합계, 수 평균 출력
		
		System.out.printf("\n데이터 갯수 : %d개\n", nums.size());
		int sum = 0;
		double avg = 0;
		for(int i=0; i<nums.size(); i++) {
			sum = sum + nums.get(i);
			avg = sum / (float)nums.size();
		}
		System.out.printf("입력한 숫자의 합계 : %d\n", sum);
		System.out.printf("입력한 숫자의 평균 : %.2f\n", avg);
		
	}
}
