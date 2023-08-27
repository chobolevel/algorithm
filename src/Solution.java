import java.util.stream.IntStream;

public class Solution {

  public static int[] solution(int start, int end_num) {
    return IntStream.rangeClosed(-start, -end_num).map(i -> -i).toArray();
  }

  public static void main(String[] args) {
    int[] solution = solution(10, 3);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
