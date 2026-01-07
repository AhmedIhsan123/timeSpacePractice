import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n) where n = length of array
  // Space Complexity: O(1)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n) where n = length of the matrix array
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n) where n = the size of the array
  // Space Complexity: O(1)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(1)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    // Iterate through the array to populate map
    for (int num : nums) {
      if (frequencyMap.containsKey(num)) {
        // Number found in map, tally 1
        frequencyMap.put(num, frequencyMap.get(num) + 1);
      } else {
        // No number found, create an entry for one with the value of 0
        frequencyMap.put(num, 1);
      }
    }

    // Variables to store max key and value pairs
    int maxFrequency = Integer.MIN_VALUE;
    int keyMaxFrequency = 0;
    // Check max frequency
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      // Store the key and value of each entry
      Integer key = entry.getKey();
      Integer value = entry.getValue();

      // Mark as max only if its greater than current max
      if (value > maxFrequency) {
        keyMaxFrequency = key;
        maxFrequency = value;
      }
    }

    // in O(n) time. n = nums.size()
    return keyMaxFrequency;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // we want to keep track of the most common number and how many times we seen it
    int mostCommon = nums[0];
    int maxCount = 0;

    // for each number in the array
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      // count how many times it appears
      for(int j = 0; j < nums.length; j++) {
        // if we found it, increment count
        if(nums[j] == nums[i]) {
          count++;
        }
      }

      // we want to update mostCommon but only if we found a number >
      if(count > maxCount){
        maxCount = count;
        mostCommon = nums[i];
      }
    }
    // after checking all numbers we just return the most common one
    return mostCommon;
  }
}