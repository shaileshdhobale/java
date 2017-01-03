
public class College extends Student {
	
	String department;
	String collegeName;
	
	public College(){
		department = "";
		collegeName = "";
	}
	
	public void setDepart(String department){
		this.department = department;
	}
	
	public String getDepart(){
		return department;
	}
	
	public void setCollege(String collegeName){
		this.collegeName = collegeName;
	}
	
	public String getCollege(){
		return collegeName;
	}
	
	public double percentCalulation(int marks[]){
		int total=0;
		for (int i=0; i<marks.length; i++){
			total = total + marks[i];
		}
		return total/marks.length;
	}
}
