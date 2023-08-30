public class Solution {

  public static String[] solution(String my_str, int n) {
    int cnt = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
    String[] result = new String[cnt];
    for(int i = 0; i < cnt; i++) {
      int begin = i * n;
      int end = ((begin + n) > my_str.length()) ? my_str.length() : (begin + n);
      result[i] = my_str.substring(begin, end);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    String[] result = solution("abc1Addfggg4556b", 6);
    for(String s : result) {
      System.out.println(s);
    }
  }

}
