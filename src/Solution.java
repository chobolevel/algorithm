import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

  public static int solution(String myString, String pat) {
    String str = Stream.of(myString.split("")).map(s -> s.equals("A") ? "B" : "A").collect(Collectors.joining());
    return str.contains(pat) ? 1 : 0;
  }

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 3};
    System.out.println(solution("ABBAA", "AABB"));
  }

}
