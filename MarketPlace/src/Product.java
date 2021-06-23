import java.util.*;
public class Product {
	private String productName;
	private double productPrice;
	private double productRating;
	private int productQuantity;
	
	public void setProductName(String name) {
		this.productName = name;
	}
	public void setProductPrice(double price) {
		this.productPrice = price;
	}
	public void setProductRating(double rating) {
		this.productRating = rating;
	}
	public void setProductQuantity(int quantity) {
		this.productQuantity = quantity;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}
	
	public double getProductRating() {
		return this.productRating;
	}
	
	public int getProductQuantity() {
		return this.productQuantity;
	}
}
