package juso;

import java.io.*;
import java.util.*;

public class JusoDAO { //DAO : Data Access Object
	File file = new File("c:/data/java/ex05/juso.txt");
	
	//매출 삭제
	public void delete(int code) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			String lines = "";
			while ((line=reader.readLine()) != null) { //한줄씩 읽어오는 동안에 null이 아니면 출력
				String[] items = line.split(",");
				if(code!=Integer.parseInt(items[0])) {
					//System.out.println(line);
					lines = lines + line + "\n";

				}
			}
			FileWriter writer = new FileWriter(file, false);
			writer.write(lines);
			writer.close();
		}
		catch (Exception e) {
			System.out.println("매출삭제 : " + e.toString());
		}
	}
	
	//주소 등록
	public void insert(Juso juso) {
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write(juso.getNo() + "," + juso.getName() + "," + juso.getPhone() + "," + juso.getAddress() + "\n");
			writer.close();
		}
		catch (Exception e) {
			System.out.println("주소등록 : " + e.toString());
		}
	}
	
	//이름 조회
	public Juso read(String name) { //주소라는 클래스 객체를 리턴
		Juso juso = new Juso();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = ""; 
			while ((line=reader.readLine()) != null) {
//				String[] items= new String[6];
				String[] items = line.split(",");
				if(items[1].equals(name) || items[0].equals(name)) {
					juso.setNo(Integer.parseInt(items[0]));
					juso.setName(items[1]);
					juso.setPhone(items[2]);
					juso.setAddress(items[3]);
				}
			}
			
		}
		catch (Exception e) {
			System.out.println("이름조회 : " + e.toString());
		}
		return juso;
		
	}

	//주소 목록
	public ArrayList<Juso> list() {
		ArrayList<Juso> array = new ArrayList<Juso>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line=reader.readLine()) != null) {
				String[] items = line.split(","); 
				
				Juso juso = new Juso();
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setPhone(items[2]);
				juso.setAddress(items[3]);
				
				array.add(juso);
				
			}
		}
		
		catch (Exception e) {
			System.out.println("주소목록 : " + e.toString());
		}
		return array;
		
	}//method
}//class
