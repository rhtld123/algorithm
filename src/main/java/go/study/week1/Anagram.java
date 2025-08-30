package go.study.week1;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

  public static boolean isAnagram(String s, String t) {
    Map<Character, Integer> sMap = new HashMap<>();
    //init
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      sMap.merge(c, 1, Integer::sum);
    }

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      Integer count = sMap.get(c);
      if (count == null) {
        return false;
      }

      if (count - 1 == 0) {
        sMap.remove(c);
      } else {
        sMap.put(c, count - 1);
      }
    }
    return sMap.isEmpty();
  }
}
