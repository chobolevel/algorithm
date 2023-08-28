import java.util.Arrays;

public class Solution {

  public static int[] solution(int[] num_list, int n) {
    return Arrays.copyOfRange(num_list, 0, n);
  }

  public static void main(String[] args) {
    int[] arr = {5, 2, 1, 7, 5};
    int[] result = solution(arr, 3);
    for(int i : result) {
      System.out.println(i);
    }
  }

}
