import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> stringHash = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    stringHash.add("Pop");
    stringHash.add("A");
    stringHash.add("Poppler");

    System.out.println(stringHash);

    // Check whether the Set contains a given String
    System.out.println(stringHash.contains("Poppler"));

    // Remove an element from the Set
    stringHash.remove("A");
    System.out.println(stringHash);

    // Get the size of the Set
    System.out.println(stringHash.size());

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String value : stringHash) {
      System.out.println(value);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
