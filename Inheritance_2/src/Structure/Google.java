package Structure;
import Human.*;

public class Google extends Employee implements Organization {
	
	int numEmployees;
	String nameOfOrganization;
	@Override
	public Integer getNumberOfEmployees() {
		return numEmployees;
	}

	@Override
	public String getNameOfOrganization() {
		return nameOfOrganization;
	}

	@Override
	public void setNumberOfEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@Override
	public void setNameOfOrganization(String nameOfOrganization) {
		this.nameOfOrganization = nameOfOrganization;
	}
	
	public static void main(String args[]){
		Google anEmployee = new Google();
		anEmployee.setName("Shailesh Dhoable");
		anEmployee.setSex("Male");
		anEmployee.setNameOfOrganization("Google");
		System.out.println("Name : " + anEmployee.getName());
		System.out.println("Sex : " + anEmployee.getSex());
		System.out.println("Organization : " + anEmployee.getNameOfOrganization());

	}
	

}
