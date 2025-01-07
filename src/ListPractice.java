import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> emptyList = new ArrayList<>();
    System.out.println(emptyList);

    // Add 3 elements to the list (OK to do one-by-one)
    emptyList.add("Good");
    emptyList.add("Morning");
    emptyList.add("world");
    System.out.println(emptyList);

    // Print the element at index 1
    System.out.println(emptyList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    emptyList.set(1, "Afternoon");
    System.out.println(emptyList);

    // Insert a new element at index 0 (the length of the list will change)
    emptyList.add(0, "Very");
    System.out.println(emptyList);

    // Check whether the list contains a certain string
    System.out.println(emptyList.contains("Good"));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < emptyList.size(); i++) {
      System.out.println(i + " - " + emptyList.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(emptyList);
    System.out.println(emptyList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String value : emptyList) {
      System.out.println(value);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}