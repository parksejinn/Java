package reference.service;
import reference.vo.ProductVO;

public class ProductService {

	
	// 1. Display All products' name
	public void displayAll(ProductVO[] products){
		System.out.println("============ All Products ============");
		for(ProductVO product : products ){
			System.out.println(product.getMaker() + "\t");
		}
	}
	// 2. RETURN total price
	public int totalPrice(ProductVO[] products) {
		int sum = 0;
		for(ProductVO product : products){
			sum += product.getPrice();
		}
		return sum;
	}
	
	// 3. Average price for ALL products
	public int averagePrice(ProductVO[] products){
		int count = products.length;
		int sum = totalPrice(products);
		int avg = sum / count;

		return avg;
	}
	// 4. Return products over average price
	public String getProductsOverAverage(ProductVO[] products){
		double avg = averagePrice(products);
		String result = "";
		
		for(ProductVO product : products ){
			if(product.getPrice() >= avg){
				result = result+product.getModel()+"\t"; 
			}
		}
		return result;
	}
	// 5. Print product(s) with specific maker
	public void getProductWithMaker(ProductVO[] products, String maker){
		System.out.println("============ Product With Maker ============");
		
		for(int i = 0; i < products.length; i++){
			if( products[i].getMaker().equals(maker) ){
				System.out.println("Product With Maker [" +  maker + "] : " + products[i].getMaker());
			}

		}

	}
	
	public void display(ProductVO product){
		System.out.println("- Name : " + product.getModel() + "\t- Maker : " + product.getMaker() +
				"\t -Price : " + product.getPrice());
	}
}
