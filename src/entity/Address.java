package entity;

public class Address {
       private String houseno;
       private String streetno;
       private int pincode;
       
      
       
	public Address(String houseno, String streetno, int pincode) {
		super();
		this.houseno = houseno;
		this.streetno = streetno;
		this.pincode = pincode;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
       
       
}
