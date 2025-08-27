package go.study.week1;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> map = Map.ofEntries(
        Map.entry('(', ')'),
        Map.entry('{', '}'),
        Map.entry('[', ']')
    );
    for (int i = 0; i < s.length(); i++) {
      char target = s.charAt(i);
      if (map.containsKey(target)) {
        stack.push(target);
        continue;
      }

      if (stack.isEmpty()) {
        stack.push(target);
        continue;
      }

      Character pop = stack.pop();
      if (!map.containsKey(pop)) {
        stack.push(target);
        continue;
      }

      Character value = map.get(pop);
      if (value != target) {
        stack.push(pop);
        stack.push(target);
      }
    }
    return stack.isEmpty();
  }
}
