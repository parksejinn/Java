package poly.arg.step2;

//--------- Test : Main ----------------------- //
public class ProductBuyerTest {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		ProductBuyer buyer = new ProductBuyer();
		

	}

}

// --------- Product : Super ----------------- //
class Product{
	int price;
	int bonusPoint;
	int pNumber;
	
	// Initial Price !
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price * 0.1);
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
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

class Audio extends Product {
	Audio(){
		super(80);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
} // Audio


//--------- ProductBuyer : Service ---------- //
class ProductBuyer{
	int money = 1000;
	int bonusPoint = 0;
	Product[] items = new Product[10];
	int index = 0;
	
	public void buyProduct(Product product){
		 if(product.price >= money){
			 System.out.println("Cannot Buy !");
			 return;
		 } else {
			 items[index] = product;
			 index++;
		 }
	}
	
}



