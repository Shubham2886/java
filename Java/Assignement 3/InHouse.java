package Hospital;

public class InHouse extends Patient {

	private float discount;


	public InHouse(int id, int bt, int nod, float d) {
		super(id, bt, nod);
	       	discount = d;
		

	}

	public InHouse() {

	super(1221, 2, 20);
	discount =  0.05f;
	
	}

	public float getDiscount() {
	return discount;
	}

	public double getBillAmount() {
	
		
		double bill = super.getBillAmount();
		if(bill>5000){

			return bill * (1-discount);
		}
		return bill;



	}



}
