public class Solution {

  public static String solution(String myString) {
    String result = "";
    for(String s : myString.split("")) {
      if(s.equals(s.toLowerCase())) {
        result += s;
      } else {
        result += s.toLowerCase();
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    System.out.println(solution("aBcDeFg"));
  }

}
