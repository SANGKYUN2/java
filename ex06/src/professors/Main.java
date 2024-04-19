package professors;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	      boolean run = true;
	      Scanner scanner = new Scanner(System.in);
	      ProDAO dao = new ProDAO();
	      while(run) {
	         System.out.println("\n=========================================");
	         System.out.println("1.등록 | 2.조회 | 3.목록 | 4.삭제 | 5.수정 | 0.종료");
	         System.out.println("=========================================");
	         System.out.print("선택 > ");
	         String menu= scanner.nextLine();
	         switch(menu) {
	            case "1" : //등록
	            	ProVO vo = new ProVO();
	            	int code = dao.getcode();
	            	System.out.println("교수 코드 > " + code);
	            	vo.setPcode(String.valueOf(code));
//	            	String pcode = scanner.nextLine();
//	            	if(pcode=="") {
//	            		System.out.println("등록을 취소합니다.");
//	            		break;
//	            	}
//	            	vo.setPcode(pcode);
	            	
	            	System.out.print("교수 이름 > ");
	            	String pname = scanner.nextLine();
	            	if(pname=="") {
	            		System.out.println("등록을 취소합니다.");
	            		break;
	            	}
	            	vo.setPname(pname);
	            	
	            	System.out.print("교수 부서 > ");
	            	String dept = scanner.nextLine();
	            	if(dept=="") {
	            		System.out.println("등록을 취소합니다.");
	            		break;
	            	}
	            	vo.setDept(dept);
	            	
	            	System.out.print("교수 날짜 > ");
	            	String hiredate = scanner.nextLine();
	            	if(hiredate=="") {
	            		System.out.println("등록을 취소합니다.");
	            		break;
	            	}
	            	vo.setHiredate(hiredate);
	            	
	            	System.out.print("교수 직위 > ");
	            	String title = scanner.nextLine();
	            	if(title=="") {
	            		System.out.println("등록을 취소합니다.");
	            		break;
	            	}
	            	vo.setTitle(title);
	            	
	            	System.out.print("교수 급여 > ");
	            	String salary = scanner.nextLine();
	            	if(salary.equals("")) {
	            		System.out.println("등록을 취소합니다.");
	            		break;
	            	}
	            	try {
	            		int salary1 = Integer.parseInt(salary);
		            	vo.setSalary(salary1);
	            	}
	            	
	            	catch (Exception e) {
	            		System.out.println("금여 :" + e.toString());
	            	}
	            	
	           
	            	
	            	dao.insert(vo);
	            	System.out.println("교수등록 완료");
	               break;
	            case "2" : //조회
	            	while(true) {
		            	System.out.print("교수 번호 -> ");
		            	String code2 = scanner.nextLine();
		            	if(code2=="") {
		            		System.out.println("조회를 취소합니다.");
		            		break;
		            	}
		            	ProVO vo2 = dao.read(code2);
		            	if(vo2.getPcode() == null) {
		            		System.out.println(code2 + "번 교수가 없습니다.");
		            	}
		            	else {
		            		System.out.println(vo2.toString());
		            	}
	            	}
	            	break;
	            case "3" : //목록
	            	for(ProVO v:dao.list()) {
	            		String date = "미등록";
	            		if (v.getHiredate() != null) {
	            			date = v.getHiredate().substring(0, 10);
	            		}
	            		
	            		String dept1 = "미등록";
	            		if(v.getDept() != null) {
	            			dept1 = v.getDept();
	            		}
	            		
	            		String title1 = "미등록";
	            		if(v.getTitle() != null) {
	            			title1 = v.getTitle();
	            		}
	            		System.out.printf("%s\t%s\t%s\t%s\t%-10s\t%,10d원\n",
	            				v.getPcode(), v.getPname(), dept1, title1, date, v.getSalary());
	            	}
	               break;
	            case "4" : //삭제
	            	System.out.print("삭제할 교수 번호 -> ");
	            	String code4 = scanner.nextLine();
	            	ProVO vo4 = dao.read(code4);
	            	if(vo4.getPcode()==null) {
	            		System.out.println(code4 + "번 교수가 존재하지 않습니다.");
	            	}
	            	else {
	            		System.out.println(vo4.toString());
	            		System.out.print(vo4.getPname() + " 교수를 삭제하실래요(y)?");
	            		String sel = scanner.nextLine();
	            		if(sel.equals("Y") || sel.equals("y")) {
	            			dao.delete(code4);
	            			System.out.println("삭제완료");
	            		}
	            		else {
	            			System.out.println("삭제취소");
	            		}
	            	}
	               break;
	            case "5" : //수정
	            	System.out.print("수정할 교수 번호 -> ");
	            	String code5 = scanner.nextLine();
	            	ProVO vo5 = dao.read(code5); //수정 전값

	            	
	            	if(vo5.getPcode()==null) {
	            		System.out.println(code5 + "번 교수가 존재하지 않습니다.");
	            	}
	            	else {
	            		System.out.print("교수 이름 : " + vo5.getPname() + " > ");
	            		String pname5 = scanner.nextLine();
	            		if(!pname5.equals("")) {
	            			vo5.setPname(pname5);
	            		}
	            		System.out.print("교수 학과 : " + vo5.getDept() + " > ");
	            		String dept5 = scanner.nextLine();
	            		if(!dept5.equals("")) {
	            			vo5.setDept(dept5);
	            		}
	            		System.out.print("교수 직급 : " + vo5.getTitle() + " > ");
	            		String title5 = scanner.nextLine();
	            		if(!title5.equals("")) {
	            			vo5.setTitle(title5);
	            		}
	            		System.out.println(vo5.toString());
	            		System.out.println("수정하실래요(y)?");
	            		String sel = scanner.nextLine();
	            		if(sel.equals("Y") || sel.equals("y")) {
	            			dao.update(vo5);
	            			System.out.println("수정완료");
	            		}
	            		else {
	            			System.out.println("수정취소");
	            		}
	            	}
		           break;
	            case "0" :
	               System.out.println("프로그램을 종료합니다.");
	               run = false;
	               break;
	            default:
	               System.out.println("0~5 메뉴를 입력하세요!");
	               break;
	         }//switch   
	      }//while
	   }//method
}

