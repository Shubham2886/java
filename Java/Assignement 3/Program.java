import Hospital.Patient;
import Hospital.InHouse;
class HospitalTest{
public static void main(String[] args) {
	Patient p = new Patient(2311,1,200);
	p.setId(120);
	p.setBedType(2);
	p.setnoOfDays(20);

	System.out.printf("Your bill is:%.2f%n",p.getBillAmount());

	InHouse a = new InHouse();
	System.out.printf("Your Inhouse bill is:%.2f%n",a.getBillAmount());

	
}



}

