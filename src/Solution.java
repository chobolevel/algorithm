public class Solution {

  public static int[] solution(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      int n = arr[i];
      if(n >= 50 && n % 2 == 0) {
        arr[i] = n / 2;
      } else if(n < 50 && n % 2 != 0) {
        arr[i] = n * 2;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 100, 99, 98};
    int[] solution = solution(arr);
    for(int i : solution) {
      System.out.println(i);
    }
  }

}
