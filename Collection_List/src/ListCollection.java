import java.util.*;


public class ListCollection {
	public static void main(String args[]) { 
		int count[] = {34, 22, 10, 60, 30, 22, 10, 22};
		// duplicates values are allowed

		ArrayList<Integer> aList = new ArrayList<Integer>(); 
		LinkedList<Integer> lList = new LinkedList<Integer>();
		Vector<Integer> vec = new Vector<Integer>(); 
		
		try {
			for(int i = 0; i < count.length; i++) {
				aList.add(count[i]);
				lList.add(count[i]);
				vec.addElement(count[i]);
			}
			System.out.println("ArrayList : " + aList);
			System.out.println("LinkedList : " + lList);
			System.out.println("Vector : " + vec);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
