package am;

import java.util.*;

public class Sub03 {
	public static void run() { //void 메소드를 실행할때 리턴할 값이 없다.
		
		ArrayList<Score> scores = new ArrayList<>();
		
		Score s1 = new Score("라이언", 94, 64, 87);
		Score s2 = new Score("춘식이", 84, 74, 57);
		Score s3 = new Score("어피치", 96, 93, 67);
		
		scores.add(s1);
		scores.add(s2);
		scores.add(s3);
		
		for(Score s:scores) { //scores에 있는걸 s에 넣는것
			s.print();
		}
		
	}

}
