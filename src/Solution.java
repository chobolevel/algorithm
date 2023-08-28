public class Solution {

  // 0, 5, 10, 15, 20 17
  public static String[] solution(String[] names) {
    String[] result = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
    for(int i = 0; i < names.length; i++) {
      if(i % 5 == 0) {
        result[i == 0 ? 0 : i / 5] = names[i];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String[] arr = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx", "katarina", "aatrox", "kaisa"};
    String[] solution = solution(arr);
    for(String s : solution) {
      System.out.println(s);
    }
  }

}
