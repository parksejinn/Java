package poly.arg.step1;

//--------- Test : Main ----------------------- //
public class ProductBuyerTest {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		ProductBuyer buyer = new ProductBuyer();
		
		buyer.buyComputer(com);
		buyer.buyTV(tv);
		System.out.println("Balance : " + buyer.money);
		System.out.println("Bonus : " + buyer.bonusPoint);
	}

}

// --------- Product : Super ----------------- //
class Product{
	int price;
	int bonusPoint;
	
	// Initial Price !
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price * 0.1);
	}
} // Product Class

// --------- Product : TV & Computer ---------- //
class TV extends Product {
	TV(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
} // TV

class Computer extends Product {
	Computer(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
} // Computer

//--------- ProductBuyer : Service ---------- //
class ProductBuyer{
	int money = 1000;
	int bonusPoint = 0;
	public void buyTV(TV tv){
		if(tv.price <= this.money){
			this.money -= tv.price;
			this.bonusPoint += tv.bonusPoint;
		} else {
			System.out.println("Cannot buy the product !");
			return;
		}
		
		System.out.println("TV Price : " + tv.price + "\nTV Bonus Point : " + tv.bonusPoint);
	}
	
	public void buyComputer(Computer com){
		if(com.price <= this.money){
			this.money -= com.price;
			this.bonusPoint += com.bonusPoint;
		} else {
			System.out.println("Cannot buy the product !");
			return;
		}
		
		System.out.println("Computer Price : " + com.price + "\nComputer Bonus Point : " + com.bonusPoint);
	}
	
}



