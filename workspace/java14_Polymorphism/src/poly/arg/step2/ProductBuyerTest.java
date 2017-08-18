package poly.arg.step2;

//--------- Test : Main ----------------------- //
public class ProductBuyerTest {

	public static void main(String[] args) {
		Product tv = new TV();
		Product com = new Computer();
		Product audio_1 = new Audio();
		Product audio_2 = new Audio();
		
		ProductBuyer buy = new ProductBuyer();
		
		tv.setpNumber(111);
		com.setpNumber(222);
		audio_1.setpNumber(333);
		audio_2.setpNumber(444);
		
		buy.buyProduct(tv);
		buy.buyProduct(com);
		buy.buyProduct(audio_1);
		buy.buyProduct(audio_2);
		
		buy.summary();
		System.out.println();
		
		buy.refund(audio_1);
		buy.summary();
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
	int pos = 1;
	public void buyProduct(Product product){
		 if(product.price >= money){
			 System.out.println("Cannot Buy !");
			 return;
		 } else {
			 items[index++] = product;
		 }
	}
	
	public void refund(Product p){
		for(int i = 0; i < items.length; i++){
			if(p.getpNumber() == items[i].getpNumber()){
				for(int j = i; j < items.length-1; j++)
					items[j] = items[j+1];
				break;
			}
		}
	}
	
	public void summary() {
		int sum = 0;
		for(int i = 0; i < index; i++){
			if(items[i] == null) break;
			System.out.println("Item : " + items[i].toString() );
			sum+= items[i].price;
		}
		System.out.println("Sum = " + sum);
	}
}



