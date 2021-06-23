import java.util.*;
public class MarketPlace {
	ArrayList<Product> products;
	ArrayList<User> users; 
	public void setUsers(ArrayList<User> u)
	{
		this.users = u;
	}
	public void setProducts(ArrayList<Product> p)
	{
		this.products = p;
	}
	
	public ArrayList<User> getUsers() {
		return this.users;
	}
	
	public ArrayList<Product> getProducts() {
		return this.products;
	}
}
