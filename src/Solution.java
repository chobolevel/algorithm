import java.util.stream.IntStream;

public class Solution {

  public static int solution(int[] num_list) {
    if(num_list.length > 10) {
      return IntStream.of(num_list).sum();
    } else {
      return IntStream.of(num_list).reduce((acc, cur) -> acc * cur).getAsInt();
    }
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5};
    System.out.println(solution(arr));
  }

}
