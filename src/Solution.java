public class Solution {

  public static String solution(String my_string, int n) {
    int begin = my_string.length() - n;
    return my_string.substring(begin);
  }

  public static void main(String[] args) {
    System.out.println(solution("ProgrammerS123", 11));
  }

}
