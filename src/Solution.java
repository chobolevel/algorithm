import java.util.Arrays;

public class Solution {

  public static int[] solution(int[] arr) {
    return Arrays.stream(arr).map((i) -> {
      int n = i;
      if(i >= 50 && i % 2 == 0) {
        n = i / 2;
      } else if(i < 50 && i % 2 != 0) {
        n = i * 2;
      }
      System.out.println(n);
      return n;
    }).toArray();
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 100, 99, 98};
    solution(arr);
//    for(int i : arr) {
//      System.out.println(i);
//    }
  }

}
