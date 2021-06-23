import java.util.*;
public class MarketService {
	ArrayList<Product> products = new ArrayList<Product>();
	ArrayList<User> users = new ArrayList<User>();
	public void addUser(String[] command) {
		String name = command[1];
		char gender = command[2].charAt(0);
		int age = Integer.parseInt(command[3]);
		User u = new User();
		u.setAge(age);
		u.setGender(gender);
		u.setName(name);
		users.add(u);
	}
	
	public void addProduct(String[] command) {
		String userName = command[1];
		String productName = command[2];
		double productPrice = Double.parseDouble(command[3]);
		double productRating = Double.parseDouble(command[4]);
		int productQuantity = Integer.parseInt(command[5]);
		
		Product p = new Product();
		p.setProductName(productName);
		p.setProductPrice(productPrice);
		p.setProductRating(productRating);
		p.setProductQuantity(productQuantity);
		
		products.add(p);
		
		for(int i = 0; i<users.size(); i++)
		{
			User u = users.get(i);
			String name = u.getName();
			if(name == userName)
			{
				u.addProduct(p);
			}
		}
	}
	
	public void selectProduct(String[] command) {
		String productName = command[2];
		String strategy = command[3];
		if(strategy.equals("Best Price"))
		{
			findProductByPrice(productName);
		}
		else if(strategy.equals("Best Rating"))
		{
			findProductByRating(productName);
		}
	}
	
	private void findProductByRating(String name)
	{
		String bestProduct = "";
		double bestRating = -1;
		double bestPrice = 999999999;
		for(int i = 0; i<products.size(); i++)
		{
			String productName = products.get(i).getProductName();
			double productRating = products.get(i).getProductRating();
			double productPrice = products.get(i).getProductPrice();
			if(productName == name && productRating>bestRating)
			{
				bestProduct = productName;
				bestPrice = productPrice;
				bestRating = productRating;
			}
			else if(productName == name && productRating==bestRating)
			{
				if(productPrice<=bestPrice)
				{
					bestProduct = productName;
					bestPrice = productPrice;
				}
			}
		}
		System.out.println("Best product is " + bestProduct);
	}
	
	private void findProductByPrice(String name)
	{
		String bestProduct = "";
		double bestRating = -1;
		double bestPrice = 999999999;
		for(int i = 0; i<products.size(); i++)
		{
			String productName = products.get(i).getProductName();
			double productRating = products.get(i).getProductRating();
			double productPrice = products.get(i).getProductPrice();
			if(productName == name && productPrice<bestPrice)
			{
				bestProduct = productName;
				bestPrice = productPrice;
				bestRating = productRating;
			}
			else if(productName == name && productPrice==bestPrice)
			{
				if(productRating>=bestRating)
				{
					bestProduct = productName;
					bestRating = productRating;
				}
			}
		}
		System.out.println("Best product is " + bestProduct);
	}
}
