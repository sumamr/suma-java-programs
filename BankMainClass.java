package edubridgejavaprgms1;
class Bank
{
	float inst;
	void rateOfInterest()
	{
		System.out.println("Rate Of Interest "+inst);
	}
}
class SBI extends Bank
{
	void rateOfInterest()
	{
		inst=8;
		System.out.println("Rate Of Interest "+inst);
	}
}
class ICICI extends Bank
{
	void rateOfInterest()
	{
		inst= 9;
		System.out.println("Rate Of Interest "+inst);
	}
}


public class BankMainClass {

	public static void main(String[] args) {
		Bank ob;
		ob=new SBI();
		ob.rateOfInterest();
		ob=new ICICI();
		ob.rateOfInterest();

	}

}
