import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

  public static int solution(String s) {
    String[] split = s.split(" ");
    int result = 0;
    for(int i = 0; i < split.length; i++) {
      if(!split[i].equals("Z")) {
        result += Integer.parseInt(split[i]);
      } else {
        result -= Integer.parseInt(split[i - 1]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    System.out.println(solution("10 Z 20 Z 1"));
  }

}
