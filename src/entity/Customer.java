package entity;

public class Customer {
    
	private int cid;
	private String cname;
	private long cphn;
	private Address a;
	private String roomType;
	private double price;
	private int roomno;
	
	

	public Customer(int cid, String cname, long cphn, Address a, String roomType, double price, int roomno) {
		
		this.cid = cid;
		this.cname = cname;
		this.cphn = cphn;
		this.a = a;
		this.roomType = roomType;
		this.price = price;
		this.roomno = roomno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCphn() {
		return cphn;
	}
	public void setCphn(long cphn) {
		this.cphn = cphn;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	
	
	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphn=" + cphn + ", a=" + a + ", roomType=" + roomType
				+ ", price=" + price + ", roomno=" + roomno + "]";
	}

	   
	
	
}
