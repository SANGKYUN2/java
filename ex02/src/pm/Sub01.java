package pm;

import java.util.*; //ArrayList;  //*;는 모든걸 import 한다는 뜻

public class Sub01 {
	
	public static void run() {
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.print("이름 목록\n");
		names.add("홍길동"); //데이터 입력
		names.add("심청이");
		names.add("라이언"); //string 이기 때문에 숫자는 안들어감
		names.add("춘식이");
		names.add("어피치");
		
		names.remove(1); //데이터 삭제 remove
		for(int i=0; i<names.size(); i++) { //ArrayList는 names.size() //데이터 전체 출력
			String name = names.get(i); //names인 바구니에서 꺼내온다.
			System.out.println(name);
		}
		
		//이름 검색
		while(true) {
			System.out.print("\n이름을 검색하세요 : ");
			String sname = s.nextLine();
			if(sname=="") {
				System.out.println("검색을 종료합니다.");
				break;
			}
			boolean find = false;
			
			for(int i=0; i<names.size(); i++) {
				String name=names.get(i);
				
				if (sname.equals(name)) {
					find=true; //name을 찾았으니까 false를 true로 바꿔준다.
					System.out.println(name + "님은 존재합니다.");
				}
			}
			if(find==false) {
				
				System.out.println("존재하지 않습니다.");
			}
		}//while
	}//메소드

}//클래스
