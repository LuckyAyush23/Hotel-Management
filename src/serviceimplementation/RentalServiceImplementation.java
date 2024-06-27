package serviceimplementation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Address;
import entity.Customer;
import service.RentalService;

public class RentalServiceImplementation implements RentalService{
	
	Scanner ip = new Scanner(System.in);
	ArrayList<Customer> l1 = new ArrayList<Customer>();
	
	{
		for(int i=101;i<=108;i++) {
			nac.put(i,null);
		}
		for(int i=201;i<=205;i++) {
			ac.put(i,null);
		}
		for(int i=301;i<=303;i++) {
			deluxe.put(i,null);
		}		
	}

	@Override
	public void info() {
		System.out.println("Rooms details");
	}
	
	void checkRooms(LinkedHashMap<Integer,Customer> m , String type) {
		   System.out.println("======"+type+"=======");
		   for(Integer roomno : m.keySet()) {
			   int c=0;
			   if(m.get(roomno)==null) {
				   System.out.print(roomno+" ");
				   c++;
			   }
			 
			   if(c==0) {
				   System.out.println("=== No Rooms Available ===");
			   }
		   }
		   System.out.println();
	}

	@Override
	public void roomsAvailable() {
	    checkRooms(nac , "Non Ac Room");
	    checkRooms(ac , "Ac Room");
	    checkRooms(deluxe , "Deluxe Room");
	}
	
	void allocate(LinkedHashMap<Integer,Customer> m,String roomType,double roomPrice) {
		System.out.println("Enter the room no");
		int roomno = ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)==null) {
			System.out.println("Enter Customer Id");
			int cid = ip.nextInt();
			System.out.println("Enter Customer Name");
			String cname = ip.next();
			System.out.println("Enter Customer Phno");
			long cphn = ip.nextLong();
			System.out.println("Enter House no");
			String houseno = ip.next();
			System.out.println("Enter Street name");
			String sname = ip.next();
			System.out.println("Enter Pincode");
		    int pcd = ip.nextInt();
    		Customer c = new Customer(cid, cname, cphn, new Address(houseno, sname, pcd), roomType, roomPrice, roomno);
		    l1.add(c);
		    m.put(roomno,c);
    		System.out.println(c.getCname()+" had been allocated for"+roomType+" roomno :");
		    System.out.println(c.getCname()+" need to pay "+roomPrice);
		}
		else {
			System.out.println("Invalid rooom");
		}
		
	}
	


	@Override
	public void checkIn() {
		System.out.println("=== check in ====");
		System.out.println("1.Non Ac\n2.Ac\n3.Deluxe");
		System.out.println("Enter the Option");
		int op = ip.nextInt();
		switch(op) {
		case 1 : allocate(nac,"Non Ac",2000);break;
		case 2 : allocate(ac,"Ac",2500);break;
		case 3 : allocate(deluxe,"Deluxe",3000);break;
		default : System.out.println(" invalid option ");
		}
	}

	
	void deallocate(LinkedHashMap<Integer,Customer> m) {
		System.out.println("Enter the room no");
		int roomno = ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)!=null) {
			Customer c = m.get(roomno);
			System.out.println("=== ThankYou visit again ===");
			m.put(roomno, null);
		}
		else {
			System.out.println("invalid roomno");
		}
	}
	@Override
	public void checkout() {
		System.out.println("=== Check out ====");
		System.out.println("1.Non Ac\n2.Ac\n3.Deluxe");
		System.out.println("Enter the Option");
		int op = ip.nextInt();
		switch(op) {
		case 1 : deallocate(nac);break;
		case 2 : deallocate(ac);break;
		case 3 : deallocate(deluxe);break;
		default : System.out.println(" invalid option ");
		}
	}

	@Override
	public void customerDetails() {
		System.out.println("===Details of Customer===");
		int c=0;
		for(Customer ele : l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("===No data found===");
		}
	}
}
