package pm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		      boolean run=true;
		      Scanner scan=new Scanner(System.in);
		      
		      while(run) {
		         System.out.println("--------------------------------------------");
		         System.out.println("1.주소등록|2.주소조회|3.주소목록|4.주소삭제|0.종료");
		         System.out.println("--------------------------------------------");
		         System.out.print("선택>");
		         String menu=scan.nextLine();
		         switch(menu) {
		         case "1":
		        	 Sub02.insert();
		            break;
		         case "2":
		        	 Sub02.read();
		            break;
		         case "3":
		        	 Sub02.run();
		            break;
		         case "4":
		            break;
		         case "0":
		            System.out.println("프로그램을 종료합니다.");
		            run=false;
		            break;
		         default:
		            System.out.println("0~4메뉴를 선택하세요!");
		         }
		      }//while
		   }//run
	}


