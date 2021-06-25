import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		VaccineService v = new VaccineService();
		int userId = 1;
		while(true) {
			String line = sc.nextLine();
			if(line.equals("exit"))
				break;
			else if(line.startsWith("User"))
			{
				String command[] = line.split(" - ");
				String userName = command[0];
				int uId = userId;
				userId++;
				Vaccine vaccine = new Vaccine();
				vaccine.setVaccineName(command[1]);
				User u = new User();
				u.setPreferredVaccine(vaccine);
				u.setName(userName);
				u.setUserId(uId);
				v.addUser(u);
			}
			else if(line.startsWith("Cent"))
			{
				String command[] = line.split(" - ");
				String centreId = command[0];
				String vaccine1 = command[1];
				String vaccine2 = "Covax";
				int vaccine1Quant, vaccine2Quant = 0;
				if(command.length>3)
				{
					String temp[] = command[2].split(", ");
					vaccine1Quant = Integer.parseInt(temp[0]);
					//System.out.println(vaccine1Quant);
					//System.out.println(temp[1]);
					//String temp2[] = temp[1].split(",");
					/*for(int i = 0; i<command.length; i++)
					{
						System.out.println(command[i]);
					}*/
					vaccine2Quant = Integer.parseInt(command[command.length-1]);
					//vaccine2 = temp[1];
				}
				else
				{
					vaccine1Quant = Integer.parseInt(command[2]);
				}
				//System.out.println("vaccine1 = " + vaccine1Quant + "vaccine2 = "+ vaccine2Quant);
				Centre c = new Centre();
				ArrayList<Vaccine> vaccine = new ArrayList<Vaccine>();
				for(int i = 0; i<vaccine1Quant; i++)
				{
					Vaccine vc = new Vaccine();
					vc.setVaccineName(vaccine1);
					vaccine.add(vc);
				}
				for(int i = 0; i<vaccine2Quant; i++)
				{
					Vaccine vc = new Vaccine();
					vc.setVaccineName(vaccine2);
					vaccine.add(vc);
				}
				
				c.setCentreId(centreId);
				c.setVaccine(vaccine);
				
				v.addCentre(c);
			}
			else if(line.startsWith("getCentres"))
			{
				
				String command[] = line.split(" ");
				//String temp[] = command[1].split(")");
				String user = command[1];
				v.getCentres(user);
			}
			else if(line.startsWith("book"))
			{
				String command[] = line.split(" ");
				String temp[] = command[1].split(",");
				String user = temp[0];
				//String temp2[] = temp[1].split(")");
				String centre = temp[1];
				boolean value = v.bookSlot(user, centre);
				System.out.println(value);
			}
			else if(line.startsWith("getStats"))
			{
				v.getStats();
			}
			else
			{
				System.out.println("Enter input in a proper format!");
			}
		}
		sc.close();
	}

}
