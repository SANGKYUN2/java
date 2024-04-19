package am;

public class Juso { //자바빈(VO)
	//필드(속성)
	private int no;
	private String name;
	private String phone;
	private String address;
	
	public Juso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juso(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	
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
		return "주소 관리 프로그램 [ 이름 = " + name + ", 번호 = " + phone + ", 주소 = " + address + " ]";
	}
	
	

}
