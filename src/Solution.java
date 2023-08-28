public class Solution {

  // 0, 5, 10, 15, 20 17
  public static int[] solution(int[] num_list) {
    int[] result = new int[num_list.length + 1];
    for(int i = 0; i < num_list.length; i++) {
      result[i] = num_list[i];
    }
    int before = num_list[num_list.length - 2];
    int last = num_list[num_list.length - 1];
    if(last > before) {
      result[result.length - 1] = last - before;
    } else {
      result[result.length - 1] = last * 2;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {5, 2, 1, 7, 5};
    int[] solution = solution(arr);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
