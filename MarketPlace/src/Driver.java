import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketService s = new MarketService();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String line = sc.nextLine();
			if(line.equals("exit"))
				break;
			String command[] = line.split("::");
			if(command[0].equals("add_product"))
			{
				s.addProduct(command);
			}
			else if(command[0].equals("add_user"))
			{
				s.addUser(command);
			}
			else if(command[0].equals("select_product"))
			{
				s.selectProduct(command);
			}
		}
		sc.close();
	}

}
