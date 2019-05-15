package bEngine;

public class Visit {
	private String rfid;
	private String feederId;
	private long visitTimestamp;
	private int temperature;
	private int mass;
	private String bandCombo;
	
	/**
	 *Visit constructor
	 *
	 *@param RFID unique hexadecimal number, 10 hexadigits
	 *@param FEEDERID unqiue key for feeders
	 *@param VISITTIMESTAMP apoch time of when the visit happened
	 *@param TEMPERATURE temp of visit, currently not used
	 *@param MASS mass of bird, currently not used
	 *@param BANDCOMBO unique combination of colors and letters.
	 */
	public Visit(String RFID, String FEEDERID, long VISITTIMESTAMP,
			int TEMPERATURE, int MASS, String BANDCOMBO ) {
		this.rfid = RFID;
		this.feederId = FEEDERID;
		this.visitTimestamp = VISITTIMESTAMP;
		this.temperature = TEMPERATURE;
		this.mass = MASS;
		this.bandCombo = BANDCOMBO;
	}
	
	public String getRfid() {return this.rfid;}
	public String getFeederId() {return this.feederId;}
	public long getVisitTimestamp() {return this.visitTimestamp;}
	public int getTemperature() {return this.temperature;}
	public int getMass() {return this.mass;}
	public String getBandCombo() {return this.bandCombo;}
	
	public void setRfid(String val) {this.rfid = val;}
	public void setFeederId(String val) {this.feederId = val;}
	public void setVisitTimestamp(long val) {this.visitTimestamp = val;}
	public void setTemperature(int val) {this.temperature = val;}
	public void setMass(int val) {this.mass = val;}
	public void setBandCombo(String val) {this.bandCombo = val;}
}
