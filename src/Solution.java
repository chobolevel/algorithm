public class Solution {

  public static int solution(int[] numbers, int n) {
    int result = 0;
    for(int i : numbers) {
      if(result > n) {
        break;
      } else {
        result += i;
      }
    }
    return result;
    // return IntStream.of(numbers).reduce((acc, cur) -> acc > n ? acc : acc + cur);
  }

  public static void main(String[] args) {
    int[] arr = {58, 44, 27, 10, 100};
    System.out.println(solution(arr, 139));
  }

}
