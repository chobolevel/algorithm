import java.io.IOException;

public class Solution {
  public static void main(String[] args) throws IOException {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    StringTokenizer st = new StringTokenizer(br.readLine());
//
//    String str1 = st.nextToken();
//    String str2 = st.nextToken();
//    int n = Integer.parseInt(st.nextToken());
//
//    String first = "";
//    String last = "";
//    String result = "";
//
//    first = str1.substring(0, n);
//    last = str1.substring(first.length() + str2.length(), str1.length());
//    result = first + str2 + last;
//
//    bw.write(result);
//
//    br.close();
//    bw.close();

    System.out.println(solution("He11oWor1d", "lloWorl", 2));
  }

  public static String solution(String my_string, String overwrite_string, int s) {
    String first = "";
    String last = "";
    String result = "";

    first = my_string.substring(0, s);
    last = my_string.substring(first.length() + overwrite_string.length());
    result = first + overwrite_string + last;

    return result;
  }

}
