package pkgRetailReview;

import java.util.ArrayList;
import java.util.Scanner;



public class RetailReview {
	
	
	

	Product electronics[];
	Reviewer customers[];
	ArrayList reviews;
	Scanner keyboard;
	static short reviewnum;
	int selreviewer;
	
	/****************************************Constructor**********************************************/
	
	RetailReview(){
		electronics = new Product[5];
		customers = new Reviewer[10];
		reviews = new ArrayList<Review>();
		keyboard = new Scanner(System.in);
		reviewnum = 1000;
		selreviewer = -1;
	}
	
	/****************************************End Constructor**********************************************/
	
	
	/****************************************Load Data**********************************************/
	void loadData() {
		
		short year = 2014, rid = 1000;
		String entreview = "";
		
		
		electronics[0] = new Product(1,"Inspiron","Dell",500f,"Laptop",(short) 2014);
		customers[0] = new Reviewer((short)1, "Test Customer", (short)11014, "ThisShouldBeHashed");
		reviews.add(new Review((short) 1, "11-2-2020", (short) 1, (short) 3, "Just alright",299998814)) ;
			
		}
		
	/****************************************END Load Data**********************************************/

		
	
	//login
	boolean login() {
		String entid = "", entpass = "";
		int numattempts = 0;
		
		while(numattempts < 3) {
			System.out.println("Enter ID:");
			entid = keyboard.next();
			int rid = Integer.parseInt(entid);
			System.out.print("Enter Pass:");
			entpass = keyboard.next();
			
			for(int i = 0; i < 3; i++) {
				if(rid == customers[i].getRid() && entpass.equals(customers[i].getRpwd())) {
					selreviewer = i;
					return true;
				}
			}
			System.out.println("Invalid Username or Password");
			numattempts++;
		}
		return false;
		
	}
	
	//public Review(short rnum, String rdate, short rid, short rating, String rdesc, int prodnum)
	void createReview() {
		short entrating = 0;
		String entreview = "";
		int selproduct = 0;
		displayProducts();
		System.out.println("Please choose a product to review (1-5)");
		selproduct = keyboard.nextShort();
		System.out.println("Enter a review description:");
		entreview = keyboard.next();
		reviewnum++;
		reviews.add(new Review(reviewnum, "2/25/22", (short) customers[selreviewer].getRid() , entrating, entreview, electronics[selproduct - 1].getUpc())) ;
		
	}
	//review
	void review(int reviewId) {
		
	}
	//display
	void displayProducts() {
		System.out.println("We have the following products");
		
		for(int i = 0; i < electronics.length; i++) {
			System.out.println((i+1) + ": " + electronics[i].getManufactorer() +" " + electronics[i].getpName());
			
		}
		
	}

}

