package pm;

import java.io.*;
import java.util.*;

import am.Juso;

public class Sub02 {
	static Scanner s = new Scanner(System.in);
	
	public static void read() { //주소 조회
		File file = new File("c://data/java/address.txt"); //File 생성
		System.out.println("***************주소조회***************");
		System.out.print("조회할 이름 -> ");
		String sname = s.nextLine();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file)); //file을 읽어옴 
			String line="";
			String[] items = new String[4]; 
			boolean find = false;
			while((line=reader.readLine()) != null) { //리더에 있는 내용을 한줄씩 읽어라, line에 넣음 내용이 없을때는 null, null이 아닐때까지 반복
				items=line.split(","); //항목당 쪼개기 위해 split 이라는걸 씀
				if(sname.equals(items[1])) { //이름이 같을 때 출력
					System.out.println("번호 : " + items[0]);
					System.out.println("주소 : " + items[3]);
					System.out.println("전화 : " + items[2]);
					find = true;
					
				}
			}
			if(!find) System.out.println(sname + "이(가) 존재하지 않습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void insert() { //주소 등록
		System.out.println("***************주소등록***************");
		File file = new File("c://data/java/address.txt");
		Scanner s = new Scanner(System.in);
		
		try {
			FileWriter writer = new FileWriter(file, true); //파일 초기화 file, false
			Juso juso = new Juso();
			
			System.out.print("번호 -> ");
			juso.setNo(Integer.parseInt(s.nextLine()));
			System.out.print("이름 -> ");
			juso.setName(s.nextLine());
			System.out.print("전화 -> ");
			juso.setPhone(s.nextLine());
			System.out.print("주소 -> ");
			juso.setAddress(s.nextLine());
			writer.write(juso.getNo() + "," + juso.getName() + "," + juso.getPhone() + "," + juso.getAddress() + "\n");
			
			writer.flush(); //버퍼에 있는 내용을 클리어
			writer.close(); //위에 내용을 닫음(?)
			System.out.println("등록완료!");
			run(); //목록 출력

		} 
		
		catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
	
	public static void run() { //주소 목록
		File file = new File("c://data/java/address.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			String[] items = new String[4];
			while ((line=reader.readLine()) != null) {
				items=line.split(",");
				Juso juso = new Juso();
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setPhone(items[2]);
				juso.setAddress(items[3]);
				System.out.printf("%d\t%s\t%s\t%s\n", juso.getNo(), juso.getName(), juso.getPhone(), juso.getAddress());
				
				
//				System.out.println(line);
//				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}
		}
		catch(Exception e) {
			//System.out.println("오류 : " + e.toString());
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
