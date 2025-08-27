package go.study.week1;

import java.util.Arrays;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    int first = 0;
    int last = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        if (sum == target) {
          first = i;
          last = j;
          break;
        }
      }
    }
    return new int[]{first, last};
  }

  public static void main(String[] args) {
    int[] ints = twoSum(new int[]{3, 2, 4}, 6);
    System.out.println(Arrays.toString(ints));
  }
}
