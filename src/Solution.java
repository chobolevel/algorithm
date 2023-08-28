public class Solution {

  public static int solution(int n, String control) {
    String[] controlArr = control.split("");
    for(String s : controlArr) {
      switch (s) {
        case "w" -> n++;
        case "s" -> n--;
        case "d" -> n += 10;
        case "a" -> n -= 10;
      }
    }
    return n;
  }

  public static void main(String[] args) {
    System.out.println(solution(0, "wsdawsdassw"));
  }

}
