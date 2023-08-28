public class Solution {

  public static int solution(int[] num_list) {
    int idx = -1;
    for(int i = 0; i < num_list.length; i++) {
      if(num_list[i] < 0) {
        idx = i;
        break;
      }
    }
    return idx;
    // return IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElseThrow(-1);
  }

  public static void main(String[] args) {
    int[] arr = {13, 22, 53, 24, 15, 6};
    System.out.println(solution(arr));
  }

}
