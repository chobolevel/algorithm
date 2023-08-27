import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static int[] solution(int[] num_list, int n) {
    List<Integer> resultList = new ArrayList<>();
    for(int i = 1; i <= num_list.length; i++) {
      if(i >= n) {
        resultList.add(num_list[i - 1]);
      }
    }
    int[] result = new int[resultList.size()];
    for(int i = 0; i < resultList.size(); i++) {
      result[i] = resultList.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] num_list = {5, 2, 1, 7, 5};
    int n = 2;
    int[] solution = solution(num_list, n);
    for(int i : solution) {
      System.out.println(i);
    }
  }
}
