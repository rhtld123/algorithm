package go.study.week1;

import static go.study.week1.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Week1Solve {

  @Test
  void two_sum() {
    assertArrayEquals(twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
  }

  @ParameterizedTest
  @CsvSource(value = {"():true", "()[]{}:true", "(]:false", "([]):true", "([)]:false", "([}}]):false"}, delimiter = ':')
  void valid_parentheses(String s, boolean expect) {
    assertEquals(ValidParentheses.isValid(s), expect);
  }

  @Test
  void contains_duplicate() {
    assertEquals(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}), true);
    assertEquals(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}), false);
    assertEquals(ContainsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}), true);
  }
}