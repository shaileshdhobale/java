import java.util.*;

public class MapCollection {

   public static void main(String args[]) {

      /* This is how to declare HashMap */
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
      TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
      LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
      /*Adding elements to HashMap*/
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Gaurav");
      hmap.put(7, "Singh");
      hmap.put(49, "Shailesh");
      hmap.put(3, "Suraj");
      hmap.put(4, "Suraj");
      hmap.put(4, "Suraj");
      
      tmap.put(12, "Chaitanya");
      tmap.put(2, "Gaurav");
      tmap.put(7, "Singh");
      tmap.put(49, "Shailesh");
      tmap.put(3, "Suraj");
      tmap.put(4, "Suraj");
      tmap.put(4, "Suraj");
      
      lmap.put(12, "Chaitanya");
      lmap.put(2, "Gaurav");
      lmap.put(7, "Singh");
      lmap.put(49, "Shailesh");
      lmap.put(3, "Suraj");
      lmap.put(4, "Suraj");
      lmap.put(4, "Suraj");
      
      //Display content using Iterator
      Set set = hmap.entrySet();
      Set set2 = tmap.entrySet();
      Set set3 = lmap.entrySet();
      Iterator iterator = set.iterator();
      Iterator iterator2 = set2.iterator();
      Iterator iterator3 = set3.iterator();
      System.out.println("=============HaspMap==============");
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue() + "\n");
      }
      System.out.println("=============TreeMap==============");
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("key is: "+ mentry2.getKey() + " & Value is: " + mentry2.getValue() + "\n");
      }
      System.out.println("=============LinkMap==============");
      while(iterator3.hasNext()) {
          Map.Entry mentry3 = (Map.Entry)iterator3.next();
          System.out.print("key is: "+ mentry3.getKey() + " & Value is: " + mentry3.getValue() + "\n");
       }
   }
}