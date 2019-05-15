package bEngine;

public class Bird {
	private int bagAndBirdWeight;  //1
	private int bagWeight;         //2
	private String bandNumber;     //3
	private String banders;        //4
	private String bandCombo;      //5
	private int bibWidth;          //6
	private int billDepth;         //7
	private int billLength;        //8
	private int billWidth;         //9
	private int birdWeight;        //10
	private int capLength;         //11
	private String captureSite;    //12
	private long captureTimestamp; //13
	private String image;          //14
	private String legLeftBottom;  //15
	private String legLeftTop;     //16
	private String legRightBottom; //17
	private String legRightTop;    //18
	private long logTimestamp;     //19
	private int longestSecondary;  //20
	private long netEnterTimestamp;//21
	private long netExitTimestamp; //22
	private String notes;          //23
	private long releasedTimestamp;//24
	private String rfid;           //25
	private String species;        //26
	private String suspectedSex;   //27
	private int tailLength;        //28
	private int tarsusLength;      //29
	private String tissueSample;   //30
	private String weather;        //31
	private int wingChordLength;   //32
	
	public Bird(int BAGANDBIRDWEIGHT, int BAGWEIGHT, String BANDNUMBER, String BANDERS, String BANDCOMBOS, int BIBWIDTH, int BILLDEPTH, 
			int BILLLENGTH, int BILLWIDTH, int BIRDWEIGHT, int CAPLENGTH, String CAPTURESITE, long CAPTURETIMESTAMP, String IMAGE, String LEGLEFTBOTTOM,
			String LEGLEFTTOP, String LEGRIGHTBOTTOM, String LEGRIGHTTOP, long LOGTIMESTAMP, int LONGESTSECONDARY, long NETENTERTIMESTAMP, long NETEXITTIMESTAMP,
			String NOTES, long RELEASEDTIMESTAMP, String RFID, String SPECIES, String SUSPECTEDSEX, int TAILLENGTH, int TARSUSLENGTH, String TISSUESAMPLE, String WEATHER, int WINGCHORDLENGTH) {
		this.bagAndBirdWeight = BAGANDBIRDWEIGHT;  //1
		this.bagWeight = BAGWEIGHT;                //2
		this.bandNumber = BANDNUMBER;              //3
		this.banders = BANDERS;                    //4
		this.bandCombo = BANDCOMBOS;               //5
		this.bibWidth = BIBWIDTH;                  //6
		this.billDepth = BILLDEPTH;                //7
		this.billLength = BILLLENGTH;              //8
		this.billWidth = BILLWIDTH;                //9
		this.birdWeight = BIRDWEIGHT;              //10
		this.capLength = CAPLENGTH;                //11
		this.captureSite = CAPTURESITE;            //12
		this.captureTimestamp = CAPTURETIMESTAMP;  //13
		this.image = IMAGE;                        //14
		this.legLeftBottom = LEGLEFTBOTTOM;        //15
		this.legLeftTop = LEGLEFTTOP;              //16
		this.legRightBottom = LEGRIGHTBOTTOM;      //17
		this.legRightTop = LEGRIGHTTOP;            //18
		this.logTimestamp = LOGTIMESTAMP;          //19
		this.longestSecondary = LONGESTSECONDARY;  //20
		this.netEnterTimestamp = NETENTERTIMESTAMP;//21
		this.netExitTimestamp = NETEXITTIMESTAMP;  //22
		this.notes = NOTES;                        //23
		this.releasedTimestamp = RELEASEDTIMESTAMP;//24
		this.rfid = RFID;                          //25
		this.species = SPECIES;                    //26
		this.suspectedSex = SUSPECTEDSEX;          //27
		this.tailLength = TAILLENGTH;              //28
		this.tarsusLength = TARSUSLENGTH;          //29
		this.tissueSample = TISSUESAMPLE;          //30
		this.weather = WEATHER;                    //31
		this.wingChordLength = WINGCHORDLENGTH;    //32
	}
	
	public int getBagAndBirdWeight() {return this.bagAndBirdWeight;};
	public int getBagWeight() {return this.bagWeight;}
	public String getBandNumber() {return this.bandNumber;}
	public String getBanders() {return this.banders;}
	public String getBandCombo() {return this.bandCombo;}
	public int getBibWidth() {return this.bibWidth;}
	public int getBillDepth() {return this.billDepth;}
	public int getBillLength() {return this.billLength;}
	public int getBillWidth() {return this.billWidth;}
	public int getBirdWeight() {return this.birdWeight;}
	public int getBapLength() {return this.capLength;}
	public String getCaptureSite() {return this.captureSite;}
	public long getCaptureTimestamp() {return this.captureTimestamp;}
	public String getImage() {return this.image;}
	public String getLegLeftBottom() {return this.legLeftBottom;}
	public String getLegLeftTop() {return this.legLeftTop;}
	public String getLegRightBottom() {return this.legRightBottom;}
	public String getLegRightTop() {return this.legRightTop;}
	public long getLogTimestamp() {return this.logTimestamp;}
	public int getLongestSecondary() {return this.longestSecondary;}
	public long getNetEnterTimestamp() {return this.netEnterTimestamp;}
	public long getNetExitTimestamp() {return this.netExitTimestamp;}
	public String getNotes() {return this.notes;}
	public long getReleasedTimestamp() {return this.releasedTimestamp;}
	public String getRfid() {return this.rfid;}
	public String getSpecies() {return this.species;}
	public String getSuspectedSex() {return this.suspectedSex;}
	public int getTailLength() {return this.tailLength;}
	public int getTarsusLength() {return this.tarsusLength;}
	public String getTissueSample() {return this.tissueSample;}
	public String getWeather() {return this.weather;}
	public int getWingChordLength() {return this.wingChordLength;}
	
	public void setBagAndBirdWeight(int val) {this.bagAndBirdWeight = val;}
	public void setBagWeight(int val) {this.bagWeight = val;}
	public void setBandNumber(String val) {this.bandNumber = val;}
	public void setBanders(String val) {this.banders = val;}
	public void setBandCombo(String val) {this.bandCombo = val;}
	public void setBibWidth(int val) {this.bibWidth = val;}
	public void setBillDepth(int val) {this.billDepth = val;}
	public void setBillLength(int val) {this.billLength = val;}
	public void setBillWidth(int val) {this.billWidth = val;}
	public void setBirdWeight(int val) {this.birdWeight = val;}
	public void setBapLength(int val) {this.capLength = val;}
	public void setCaptureSite(String val) {this.captureSite = val;}
	public void setCaptureTimestamp(long val) {this.captureTimestamp = val;}
	public void setImage(String val) {this.image = val;}
	public void setLegLeftBottom(String val) {this.legLeftBottom = val;}
	public void setLegLeftTop(String val) {this.legLeftTop = val;}
	public void setLegRightBottom(String val) {this.legRightBottom = val;}
	public void setLegRightTop(String val) {this.legRightTop = val;}
	public void setLogTimestamp(long val) {this.logTimestamp = val;}
	public void setLongestSecondary(int val) {this.longestSecondary = val;}
	public void setNetEnterTimestamp(long val) {this.netEnterTimestamp = val;}
	public void setNetExitTimestamp(long val) {this.netExitTimestamp = val;}
	public void setNotes(String val) {this.notes = val;}
	public void setReleasedTimestamp(long val) {this.releasedTimestamp = val;}
	public void setRfid(String val) {this.rfid = val;}
	public void setSpecies(String val) {this.species = val;}
	public void setSuspectedSex(String val) {this.suspectedSex = val;}
	public void setTailLength(int val) {this.tailLength = val;}
	public void setTarsusLength(int val) {this.tarsusLength = val;}
	public void setTissueSample(String val) {this.tissueSample = val;}
	public void setWeather(String val) {this.weather = val;}
	public void setWingChordLength(int val) {this.wingChordLength = val;}
}