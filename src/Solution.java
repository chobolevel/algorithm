import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static int[] solution(int n) {
    List<Integer> result = new ArrayList<>();
    for(int i = 2; i <= n; i++) {
      while(n % i == 0) {
        result.add(i);
        n /= i;
      }
    }
    return result.stream().mapToInt(i -> i).distinct().toArray();
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    int[] solution = solution(12);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
