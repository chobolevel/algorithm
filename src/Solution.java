import java.util.stream.IntStream;

public class Solution {

  public static int[] solution(int start, int end_num) {
    int[] ascArr = IntStream.rangeClosed(end_num, start).toArray();
    int[] descArr = new int[ascArr.length];
    for(int i = 0; i < ascArr.length; i++) {
      descArr[descArr.length - 1 - i] = ascArr[i];
    }
    return descArr;
  }

  public static void main(String[] args) {
    int[] solution = solution(10, 3);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
