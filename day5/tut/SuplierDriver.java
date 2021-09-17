package day5.tut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Supplier{
	
	String supplierName;
	String supplierId;
	String GST;
	
	List<Product> listOfProduct = new ArrayList<>();
	
	Double getSupplierDetails(Scanner in) {
	
		Double TotalCost=0.0;
		System.out.println("Enter the Supplier Name");
		this.supplierName = in.next();
		System.out.println("Enter the Supplier ID");
		this.supplierId = in.next();
		System.out.println("Enter the Supplier GST");
		this.GST = in.next();
		System.out.println("Do you wish to add product..");
		String choice= in.next();
		while(choice.equals("yes") |  choice.equals("YES") |choice.equals("y")| choice.equals("Y")) {
			Product p = new Product();
			p= p.getItemDetails();
			this.listOfProduct.add(p);
			int index= listOfProduct.indexOf(p);
			TotalCost+=this.purchaseItems(in, index);
			System.out.println("Do you wish to proceed with next Product..");
			choice = in.next();
		}	
		return TotalCost;
	}
	
	Double purchaseItems(Scanner in, int index) {	
	
		System.out.println("Enter the No. of Items Purchased");
		int count = in.nextInt();
		return calculateCost(count,this.listOfProduct.get(index));
	}
	
	Double calculateCost(int count, Product p) {
		Double cost = count* p.pricePerItem;
		return cost;
	}
	
}
class Product{
	String producName;
	String itemId;
	Double pricePerItem;
	
	Product getItemDetails() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Product Name");
		this.producName = in.next();
		System.out.println("Enter the Product ID");
		this.itemId = in.next();
		System.out.println("Enter the Price per Item");
		this.pricePerItem = in.nextDouble();
		
		return this;
	}
}

public class SuplierDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Supplier s1= new Supplier();
		System.out.println("Cost : " + s1.getSupplierDetails(in));

	}

}
