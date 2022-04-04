import java.util.*;
class Product{
	int pcode;
	String name;
	int price;

	Product(){
		pcode=123;
		name="Pen";
		price=10;
	}

	Product(int pcode,String name,int price){
		this.pcode=pcode;
		this.name=name;
		this.price=price;
	}

	void display(){
		System.out.println("Pcode = "+pcode+"\nName = "+name+"\nPrice = "+price);
	}

}
class ProductCompare_1{
	public static void main(String args[]){
		Product p1=new Product();
		Product p2=new Product(234,"Book",48);

		System.out.println("First Product");
		p1.display();

		System.out.println("Second Product");
		p2.display();

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the third product's productcode,product price");
		int pcode=s.nextInt();
		int price=s.nextInt();

		System.out.println("Third Product");

		Product p3=new Product(pcode,"Pencil",price);
		p3.display();

		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("Product with Lowest price = "+p1.name+"-"+p1.price);
		}
		else if(p2.price<p1.price && p2.price<p3.price){
			System.out.println("Product with Lowest price = "+p2.name+"-"+p2.price);
		}
		else{
			System.out.println("Product with Lowest price = "+p3.name+"-"+p3.price);
		}
		
		
			
	}
}




		 