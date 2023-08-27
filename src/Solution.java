import java.util.Map;
import java.util.function.BiFunction;

public class Solution {

  public static int solution(String ineq, String eq, int n, int m) {
    Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
      ">=", (a, b) -> a >= b,
      "<=", (a, b) -> a <= b,
      ">!", (a, b) -> a > b,
      "<!", (a, b) -> a < b
    );

    return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
  }

  public static void main(String[] args) {
    System.out.println(solution(">", "!", 41, 78));
  }

}
