package Hospital;

public class Patient {

	private int patientId;
	private int bedType;
	private int noOfDays;
	//string patientName;

	public Patient(int id, int bt, int nod) {
	patientId = id;
	bedType = bt;
	noOfDays = nod;
	//patientName = pn;
	}
	public Patient() {
		this(100,2,20);
	}

	public int getId() {
	return patientId;
	}

	public void setId(int id) {
	patientId = id;
	}

	public int getBedType() {
	return bedType;
	}

	public void setBedType(int bt) {
		bedType = bt;
	}
	public int getnoOfDays() {
		return noOfDays;
	}
	public void setnoOfDays(int nod) {
	noOfDays = nod;
	}
	
	/*
	public string[] getPatientName() {
		return patientname;
	}
	
	public void setPatientName(string pn) {
	patientname = pn;
	}
	*/
	public int bedTypee() {
		int i;

		switch(bedType) {
		case 1: 
			i = 500;
			break;
		case 2:
			i = 350;
			break;
		default:
			i = 200;
		}
		return i;

	}
	public double getBillAmount() {
		int i = bedTypee();
		int amount = noOfDays * i;
		return amount;

	}

	

};
