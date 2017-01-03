package Dynamic;

class Bank{  
	int getRateOfInterest(){
		return 10;
	}  
}  
  
class SBI extends Bank{  
	int getRateOfInterest(){
		return 8;
	}  
}  
  
class ICICI extends Bank{  
	int getRateOfInterest(){
		return 7;
	}  
}  
class AXIS extends Bank{  
	int getRateOfInterest(){
		return 9;
	}  
}  
  
class DynamicPolymorphism{  
	public static void main(String args[]){  
		Bank b1 = new SBI();  
		Bank b2 = new ICICI();  
		Bank b3 = new AXIS();  
		Bank b4 = new Bank();
		System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest()); // SBI
		System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest()); // ICIC
		System.out.println("AXIS Rate of Interest: " + b3.getRateOfInterest()); // AXIS
		System.out.println("Bank Rate of Interest: " + b4.getRateOfInterest()); //Bank class
	}  
}  