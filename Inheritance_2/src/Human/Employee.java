package Human;

import java.util.Date;

public class Employee extends Person {

	String name;
	String gender;
	Date birthdate;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSex() {
		return gender;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setSex(String sex) {
		gender = sex;
	}
}
