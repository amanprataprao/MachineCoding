import java.util.*;
public class User {
	private String userName;
	private char gender;
	private int age;
	ArrayList<Product> products;
	public void setName(String name) {
		this.userName = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char g) {
		this.gender = g;
	}
	
	public void addProduct(Product p)
	{
		this.products.add(p);
	}
	
	public String getName() {
		return this.userName;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public ArrayList<Product> getProducts() {
		return this.products;
	}
}
