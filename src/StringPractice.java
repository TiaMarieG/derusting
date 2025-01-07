import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
      String fiveCharString = "Dragon";

    // Find the length of the string
      System.out.println(fiveCharString.length());

    // Concatenate (add) two strings together and reassign the result
      String concNewString = fiveCharString + " Heart";
      System.out.println(concNewString);

    // Find the value of the character at index 3
      System.out.println(concNewString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
      System.out.println(concNewString.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
      for (int i = 0; i < concNewString.length(); i++) {
        System.out.println(concNewString.charAt(i));
      }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();
    System.out.println(stringList);

    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Chewed");
    stringList.add("In");
    stringList.add("Self-Defense");
    stringList.add("But");
    stringList.add("Never");
    stringList.add("Swallowed");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", stringList);
    System.out.println(joinedString);

    // Check whether two strings are equal
    String stringOne = "Draco";
    String stringTwo = "Bowen";

    if (stringOne.equals(stringTwo)) {
      System.out.println("Equal Strings");
    } 
    else {
      System.out.println("Unequal Strings");
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
