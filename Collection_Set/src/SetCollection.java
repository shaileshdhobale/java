import java.util.*;

public class SetCollection {
	public static void main(String args[]) { 
		int count[] = {34, 22, 10, 60, 30, 22, 10, 22};
		// duplicates are not allowed

		HashSet<Integer> hset = new HashSet<Integer>(); // No guarantee of order of iteration
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>(); // order in which they are inserted
		TreeSet<Integer> tset = new TreeSet<Integer>(); // in ascending order
		
		try {
			for(int i = 0; i < count.length; i++) {
				hset.add(count[i]);
				lhset.add(count[i]);
				tset.add(count[i]);
			}
			System.out.println("HashSet : " + hset);
			System.out.println("LinkedHashSet : " + lhset);
			System.out.println("TreeSet : " + tset);
		}
		catch(Exception e) {}
	}
}
