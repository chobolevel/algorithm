import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public static int solution(int[] num_list) {
//    String even = "";
//    String odd = "";
//    for(int i : num_list) {
//      if(i % 2 == 0) {
//        even += String.valueOf(i);
//      } else {
//        odd += String.valueOf(i);
//      }
//    }
//    return Integer.parseInt(even) + Integer.parseInt(odd);

    String even = IntStream.of(num_list).filter((i) -> i % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining());
    String odd = IntStream.of(num_list).filter((i) -> i % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining());
    return Integer.parseInt(even) + Integer.parseInt(odd);
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    System.out.println(solution(arr));
  }

}
