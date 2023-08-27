import java.util.stream.IntStream;

public class Solution {

  public static int[] solution(int start_num, int end_num) {
    int[] array = IntStream.rangeClosed(start_num, end_num).toArray();
    return array;
  }

  public static void main(String[] args) {
    int[] solution = solution(3, 10);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
