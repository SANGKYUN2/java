package juso;

public class Juso { //자바빈(VO = Value Object)
	
	//필드
	private int no;
	private String name;
	private String phone;
	private String address;

	//생성자
	public Juso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juso(int no, String name, String phone, String address) {
	super();
	this.no = no;
	this.name = name;
	this.phone = phone;
	this.address = address;
	}

	//메소드
	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "주소 관리 프로그램 [ 번호 = " + no + ", 이름 = " + name + ", 전화 = " + phone + ", 주소 = " + address + " ]";
	}

}
