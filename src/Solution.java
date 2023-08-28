import java.util.stream.IntStream;

public class Solution {

  public static int[] solution(int n, int k) {
    return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
  }

}
