package bEngine;

public class Feeder {
	private int battery;
	private String id;
	private String fullName;
	private int lastContact;
	
	/**
	 * Constructor for Feeder
	 * 
	 * @param BATTERY battery indicator
	 * @param ID id of the feeder used for database field
	 * @param FULLNAME human spelling for ID
	 * @param LASTCONTACT when the feeder was last seen
	 */
	public Feeder(int BATTERY, String ID, String FULLNAME, int LASTCONTACT) {
		this.battery = BATTERY;
		this.id = ID;
		this.fullName = FULLNAME;
		this.lastContact = LASTCONTACT;
	}
	
	public int getBattery() {return this.battery;}
	public String getId() {return this.id;}
	public String getFullName() {return this.fullName;}
	public int getLastContact() {return this.lastContact;}
	
	public void setBattery(int val) {this.battery = val;}
	public void setId(String val) {this.id = val;}
	public void setFullName(String val) {this.fullName = val;}
	public void setLastContact(int val) {this.lastContact = val;}
}
