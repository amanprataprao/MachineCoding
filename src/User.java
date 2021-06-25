
public class User {
	private String userName;
	private Centre centre;
	private Vaccine preferredVaccine;
	private String gender;
	private int userId;
	
	public void setName(String name) {
		this.userName = name;		
	}
	
	public void setCentre(Centre c) {
		this.centre = c;
	}
	
	public void setPreferredVaccine(Vaccine vaccine) {
		this.preferredVaccine = vaccine;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setUserId(int id) {
		this.userId = id;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public Centre getCentre() {
		return this.centre;
	}
	
	public Vaccine getPreferredVaccine() {
		return this.preferredVaccine;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getUserId() {
		return this.userId;
	}
}
