package go.study.week1;

public class ValidPalindrome {

  public static boolean isPalindrome(String s) {
    String convert = s.trim().toLowerCase();
    int maxLength = convert.length() - 1;
    int left = 0;
    int right = maxLength;
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    while (true) {
      if (left > maxLength && right < 0) {
        break;
      }

      if (left <= maxLength) {
        char lc = convert.charAt(left);
        if (Character.isAlphabetic(lc) || Character.isDigit(lc)) {
          sb1.append(lc);
        }
      }

      if (right >= 0) {
        char rc = convert.charAt(right);
        if (Character.isAlphabetic(rc) || Character.isDigit(rc)) {
          sb2.append(rc);
        }
      }

      left++;
      right--;
    }

    String s1 = sb1.toString();
    String s2 = sb2.toString();
    return s1.equals(s2);
  }
}
