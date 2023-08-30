public class Solution {

  public static int solution(String my_string) {
    // 3 + 4 - 1
    String[] split = my_string.split(" ");
    int result = Integer.parseInt(split[0]);
    for(int i = 1; i < split.length - 1; i += 2) {
      if(split[i].equals("+")) {
        result += Integer.parseInt(split[i + 1]);
      } else {
        result -= Integer.parseInt(split[i + 1]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    System.out.println(solution("50000 + 23414"));
  }

}
