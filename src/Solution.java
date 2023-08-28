import java.util.stream.Stream;

public class Solution {

  public static int solution(String my_string, String is_prefix) {
    String[] prefixArr = new String[my_string.length()];
    for(int i = 0; i < my_string.length(); i++) {
      prefixArr[i] = my_string.substring(0, i);
    }
    long count = Stream.of(prefixArr).filter((prefix) -> prefix.equals(is_prefix)).count();
    return count > 0 ? 1 : 0;
  }

  public static void main(String[] args) {
    System.out.println(solution("banana", "ban"));
  }

}
