public class Solution {

  public static String solution(String[] arr) {
    String result = "";
    for(String s : arr) {
      result += s;
    }
    return result;
  }

  public static void main(String[] args) {
    String[] arr = {"a", "b", "c"};
    System.out.println(solution(arr));
  }

}
