import java.util.*;
public class Centre {
	ArrayList<Vaccine> vaccineAtCentre;
	//private int centreId;
	//private int vaccineQuantity;
	private String centreId;
	ArrayList<User> users;
	
	public void setVaccine(ArrayList<Vaccine> vaccine) {
		this.vaccineAtCentre = vaccine;
	}
	
	public void setCentreId(String id) {
		this.centreId = id;
	}
	
	
	public void addUserAtCentre(User u) {
		this.users.add(u);
	}
	
	public ArrayList<Vaccine> getVaccines() {
		return this.vaccineAtCentre;
	}
	
	public String getCentreId() {
		return this.centreId;
	}
	
	public ArrayList<User> getUsersAtCentre() {
		return this.users;
	}
}
