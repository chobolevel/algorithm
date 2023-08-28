public class Solution {

  public static String solution(String rny_string) {
    String result = "";
    for(String s : rny_string.split("")) {
      if(s.equals("m")) {
        result += "rn";
      } else {
        result += s;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {58, 44, 27, 10, 100};
    System.out.println(solution("masterpiece"));
  }

}
