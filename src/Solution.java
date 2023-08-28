import java.util.stream.IntStream;

public class Solution {

  public static int[] solution(int[] num_list) {
    return IntStream.of(num_list).sorted().skip(5).toArray();
  }

  public static void main(String[] args) {
    int[] arr = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
    int[] solution = solution(arr);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
