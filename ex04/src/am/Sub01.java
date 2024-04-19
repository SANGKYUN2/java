package am;

import java.util.*;

public class Sub01 {
	public static void run() {
      boolean run=true;
      ArrayList<Car> cars = new ArrayList<>();
      Scanner s=new Scanner(System.in);
      Car car = new Car (1, "현대", "그랜저", "검정", 20000, "2020-03");
      cars.add(car);
      car = new Car (2, "제네시스", "GV80", "회색", 70000, "2024-12");
      cars.add(car);
      car = new Car (3, "기아", "K7", "파랑", 120000, "2021-07");
      cars.add(car);
      
      while(run) {
    	 System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
         System.out.println("| 1. 차량등록 | 2. 차량조회 | 3. 차량목록 | 4. 차량삭제 | 0. 종료 |");
         System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
         System.out.print("메뉴를 선택하세요. -> ");
         String menu=s.nextLine();
         
         switch(menu) {
         
         case "1":
        	 car = new Car();
        	 Car last = cars.get(cars.size()-1);
        	 int next = last.getNo() + 1;
        	 car.setNo(next);
        	 System.out.print("\n차량 번호" + car.getNo());
        	 
        	 System.out.print("\n회사를 입력하세요. -> ");
        	 String company = s.nextLine();
        	 car.setCompany(company);
        	 
        	 System.out.print("모델을 입력하세요. -> ");
        	 String model = s.nextLine();
        	 car.setModel(model);
        	 
        	 System.out.print("색상를 입력하세요. -> ");
        	 String color = s.nextLine();
        	 car.setColor(color);
        	 
        	 System.out.print("주행 거리를 입력하세요. -> ");
        	 int distance = Integer.parseInt(s.nextLine());
        	 car.setDistance(distance);
        	 
        	 System.out.print("년식을 입력하세요. -> ");
        	 String Date = s.nextLine();
        	 car.setDate(Date);
        	 
        	 cars.add(car);
        	 System.out.print(car.toString() + "\n" + "차량이 등록 되었습니다.\n");
        	 System.out.println("등록된 차량 데이터 : " + cars.size());
        	 
            break;
            
         case "2":
        	 while (true) {
        		 System.out.print("\n번호를 입력하세요. -> ");
            	 String sno = s.nextLine();
            	 if(sno=="") break;
            	 boolean find = false;
            	 for (Car c:cars) {
            		 if(Integer.parseInt(sno)==c.getNo()) {
            			 System.out.println(c.toString());
            			 find = true;
            		 }
            	 }
            	 if (find==false) {
            		 System.out.println(sno + "번 차량 번호가 존재하지 않습니다.");
            	 }
        		 
        	 }//while
            break;
            
         case "3":
        	 for(Car c:cars) {
        		 System.out.printf("\n번호 : %d\n회사 : %s\n모델 : %s\n색상 : %s\n주행 거리 : %d\n년식 : %s\n", 
        				 c.getNo(), c.getCompany(), c.getModel(), c.getColor(), c.getDistance(), c.getDate());
        	 }
        	 System.out.println("\n등록된 차량 데이터 : " + cars.size());            
        	 
        	break;
            
         case "4":
        	 System.out.println("\n삭제할 번호를 입력하세요 -> ");
        	 String rno = s.nextLine();
        	 boolean delete = false;
        	 for(Car c:cars) {
        		 if (Integer.parseInt(rno)==c.getNo()) {
        			 System.out.println("삭제하시겠습니까?");
        		 }
        	 }
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
//        	 System.out.print("\n삭제할 번호를 입력하세요. -> ");
//        	 String rno = s.nextLine();
//        	 if(rno=="") break;
//        	 boolean delete = false;
//        	 for (Car c:cars) {
//        		 if(Integer.parseInt(rno)==c.getNo()) {
//        			 System.out.println(c.toString());
//        			 delete = true;
//        			 System.out.print("삭제하시겠습니까?? (예/아니요) -> ");
//						String answer = s.nextLine();
//						if(answer.equals("예")) {
//							cars.remove(c);
//							System.out.println(rno + "차량의 데이터가 삭제 되었습니다!");
//							break;
//						}
//						else {
//							System.out.println(rno + "차량의 데이터가 삭제 취소 되었습니다!");
//						}
//					}
//				}
//				if(delete==false)
//					System.out.println(rno + "차량은 존재하지 않습니다.");
//				break;
//            
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

//ArrayList<Car> cars = new ArrayList<>();
//
//
//
//Car car1 = new Car("기아", "K7");
//car1.setColor("흰색");
//car1.setDistance(100000);
//car1.setDate("2022-07");
//cars.add(car1);
//for(Car car:cars) { //cars에서 한개씩 가져와서 car에 저장
//	System.out.printf("\n%s\n%s\n%s\n%,d\n%s\n", 
//			car.getCompany(), car.getModel(), car.getColor(), car.getDistance(), car.getDate());
//	System.out.println("");
//}


//		Car car1 = new Car(); //새로운 객체를 만들어서 car1에 저장
//		car1.company = "현대";
//		car1.model = "그랜저";
//		car1.color = "검정";
//		car1.distance = 60000;
//		car1.date = "2021-06";
//		cars.add(car1);
//		
//		car1 = new Car(); //새로운 객체를 만들어서 car1에 저장
//		car1.company = "제네시스";
//		car1.model = "GV80";
//		car1.color = "회색";
//		car1.distance = 90000;
//		car1.date = "2024-12";
//		car1.model = "람보르기니";
//		cars.add(car1);
		
//		Car car2 = new Car(); //새로운 객체를 만들어서 car2에 저장
//		
//		car2.company = "기아";
//		car2.model = "모닝";
//		car2.color = "라임";
//		car2.distance = 20000;
//		car2.date = "2024-12";
//		
//		car2.print();
		
