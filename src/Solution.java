public class Solution {

  public static int solution(int a, int b) {
    String s1 = String.valueOf(a);
    String s2 = String.valueOf(b);
    return Integer.parseInt(s1 + s2) >= Integer.parseInt(s2 + s1) ? Integer.parseInt(s1 + s2) : Integer.parseInt(s2 + s1);
  }

  public static void main(String[] args) {
    System.out.println(solution(89, 8));
  }

}
