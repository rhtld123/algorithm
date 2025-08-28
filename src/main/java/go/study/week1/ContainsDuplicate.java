package go.study.week1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> integers = new HashSet<>();
    for (int num : nums) {
      if (!integers.add(num)) {
        return true;
      }
    }
    return false;
  }
}
