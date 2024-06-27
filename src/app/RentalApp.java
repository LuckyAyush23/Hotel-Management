package app;

import java.util.Scanner;

import service.RentalService;
import serviceimplementation.RentalServiceImplementation;

public class RentalApp {
        
	public static void main(String[] args) {
		System.out.println("==== Welcome to Room Rental Service ====");
		Scanner ip = new Scanner(System.in);
		RentalService r1 = new RentalServiceImplementation();
		while(true) {
			System.out.println("===== Menu ======");
			System.out.println("1.Info\n2.Rooms Available\n3.CheckIn\n4.CheckOut\n5.CustomerDetails\n6.Exit");
			System.out.println("Enter any Option");
			int op = ip.nextInt();
			
			switch(op) {
			case 1 : r1.info();break;
			case 2 : r1.roomsAvailable();break;
			case 3 : r1.checkIn();break;
			case 4 : r1.checkout();break;
			case 5 : r1.customerDetails();break;
			case 6 : System.out.println("==== Thank you Visit Again ===");
			         System.exit(0); 
			default : System.out.println("Invalid Option");
			
			}
		}
		
	}
}
