
public class TestStudentCollege extends College {
	public static void main(String args[]){
		College studentEntry = new College();
		studentEntry.setName("Shailesh");
		studentEntry.setStandard("MCA 1st");
		int[] marks = {60, 80, 60};
		studentEntry.setMarks(marks);
		studentEntry.setDepart("Computer Science");
		studentEntry.setCollege("PVG");
		double percent = studentEntry.percentCalulation(marks);
		System.out.println("Name : " + studentEntry.getName());
		System.out.println("Standard : " + studentEntry.standard);
		System.out.println("Percentage : " + percent);
		System.out.println("Department : " + studentEntry.department);
		System.out.println("College Name : " + studentEntry.collegeName);
	}
}
