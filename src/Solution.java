import java.util.stream.IntStream;

public class Solution {

  public static int solution(int n) {
    boolean isEven = n % 2 == 0;
    if(isEven) {
      return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
    } else {
      return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).sum();
    }
  }

  public static void main(String[] args) {
    System.out.println(solution(10));
  }

}
