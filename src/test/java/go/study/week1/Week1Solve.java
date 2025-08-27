package go.study.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Week1Solve {


  @ParameterizedTest
  @CsvSource(value = {"():true", "()[]{}:true", "(]:false", "([]):true", "([)]:false", "([}}]):false"}, delimiter = ':')
  void valid_parentheses(String s, boolean expect) {
    assertEquals(ValidParentheses.isValid(s), expect);
  }
}