package proj;

import java.util.ArrayList;
import java.util.Scanner;
//import currentDateTime checker to check if holidays are coming up
public class Product {
	 String name;
	 int expDate;
	 int quant;
	 double value;

	/*static ArrayList<String> inv = new ArrayList<>();
	static ArrayList<String> inv1 = new ArrayList<>();*/
	Product(String name, int expDate, int quant, int value) {
		this.name = name;
		this.expDate = expDate;
		this.quant = quant;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		String date = String.valueOf(expDate);
		return date;
	}
	public String toString() {
		String e = getName() + " " + getDate();
		return e;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> arr = new ArrayList<>();
		int fin = 0;
		while(fin ==0){
			System.out.println("Would you like to add an item? (1)");
			System.out.println("Would you like to remove an item? (2)");
			System.out.println("Would you like to see the inventory? (3)");
			int t = sc.nextInt();
		switch(t){
			case 1: 
				System.out.println("enter product name: ");
				String q = sc.next();
				System.out.println("enter product expiration Date: ");
				int w = sc.nextInt();
				System.out.println("enter product quantity: ");
				int e = sc.nextInt();
				System.out.println("enter product Value (After tax): ");
				int r = sc.nextInt();
				Product p1 = new Product(q, w, e, r);
				arr.add(p1);
				System.out.println("Succesfully added item: "+p1);
				break;
			case 2: 
				System.out.println("What item would you like to remove? ");
				String rem = sc.next();
				if(arr.contains(rem)) {
					int ind = arr.indexOf(rem);
					arr.remove(ind);
				}
				else {
					System.out.println("The item does not exist");
				}
				break;
			case 3:
				System.out.println(arr);
				break;		
		}
		System.out.println("Would you like to preferom another action? (Y/N) ");
		String end = sc.next();
		if(end == "Y")
			fin = 0;
		else;
			fin = 1;
		}
		System.out.println("finished");
		/*String q = Integer.toString(expDate);
		String w = Integer.toString(quant);
		String e = Integer.toString(value);
		inv.add(q);
		inv.add(w);
		inv.add(e);
		inv.add(name);
		inv1.addAll(inv);*/
		sc.close();
	}
}
