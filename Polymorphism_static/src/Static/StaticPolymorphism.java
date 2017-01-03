package Static;

public class StaticPolymorphism {
	public static void main(String args[]) {
		StaticPolyChild object = new StaticPolyChild();
		
		System.out.println("add(int a) : " + object.add(5)); // add(int a)
		System.out.println("add(int a, int b) : " + object.add(5, 15)); // add(int a, int b)
		System.out.println("add (double a, int b) : "  + object.add(5.45, 6)); //add (double a, int b)
		System.out.println("add(int a, int b, int c) : " + object.add(5, 10, 20)); //add(int a, int b, int c)
		System.out.println("add(double a, double b) : " + object.add(6.0, 8.5)); //add(double a, double b)
	}
}
