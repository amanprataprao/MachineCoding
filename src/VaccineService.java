import java.util.*;
public class VaccineService {
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Centre> centres = new ArrayList<Centre>();
	
	public void addUser(User u) {
		users.add(u);
		System.out.println("User added");
	}
	
	public void addCentre(Centre c) {
		centres.add(c);
		System.out.println("Centre added");
	}
	
	public void getCentres(String userName) {
		ArrayList<User> u;
		Vaccine prefVaccine = null;
		for(int i = 0; i<users.size(); i++)
		{
			if(users.get(i).getUserName().equals(userName))
			{
				prefVaccine = users.get(i).getPreferredVaccine();
				break;
			}
		}
		//Collections.sort(centres, new Comparator)
		for(int i = 0; i<centres.size(); i++)
		{
			System.out.print(centres.get(i).getCentreId() + " ");
			int vaccineSize = 0;
			ArrayList<Vaccine> vaccinesAtCentre = centres.get(i).getVaccines();
			//System.out.println("size = " + vaccinesAtCentre.size());
			for(int j = 0; j<vaccinesAtCentre.size(); j++)
			{
				Vaccine v = vaccinesAtCentre.get(j);
				if(v.getVaccineName().equals(prefVaccine.getVaccineName()))
					vaccineSize++;
			}
			System.out.println(vaccineSize + " ");
		}
		
	}
	
	public boolean bookSlot(String user, String centre) {
		System.out.print("User" + user);
		boolean possible = false;
		User u = null;
		Centre c;
		for(int i = 0; i<users.size(); i++)
		{
			if(user.equals(users.get(i).getUserName()))
			{
				u = users.get(i);
				break;
			}
		}
		Vaccine prefVaccine = u.getPreferredVaccine();
		System.out.println(" pref: "+prefVaccine.getVaccineName());
		for(int i = 0; i<centres.size(); i++)
		{
			int flag = 0;
			c = centres.get(i);
			if(!c.getCentreId().equals(centre))
				continue;
			ArrayList<Vaccine> vc = c.getVaccines();
			for(int j = 0; j<vc.size(); j++)
			{
				if(prefVaccine.getVaccineName().equals(vc.get(j).getVaccineName()))
				{
					possible = true;
					flag = 1;
					u.setCentre(c);
					vc.remove(j);
					break;
				}
			}
			if(flag == 1)
				break;
		}
		return possible;
	}
	
	public void getStats() {
		for(int j = 0; j<centres.size(); j++)
		{
			Centre c = centres.get(j);
			System.out.println(c.getCentreId()+":");
			int covaxSize = 0, coviSize = 0;
			for(int i = 0; i<c.getVaccines().size(); i++)
			{
				Vaccine v = c.getVaccines().get(i);
				String name = v.getVaccineName();
				if(name.equals("Covax"))
				{
					covaxSize++;
				}
				else if(name.equals("Covishield"))
				{
					coviSize++;
				}
			}
			System.out.println("Covax :" + covaxSize +" Covishield : " + coviSize);
			ArrayList<User> u = c.getUsersAtCentre();
			if(u!=null)
			{
				for(int i = 0; i<u.size(); i++)
				{
					String uName = u.get(i).getUserName();
					System.out.println(uName);
				}
			}
		}
	}
}
