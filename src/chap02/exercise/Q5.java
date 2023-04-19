package chap02.exercise;

public class Q5 {

    static void rcopy(int[] a, int[] b) {
        for(int i = 0; i < b.length; i++) {
            a[a.length - i] = b[i];
        }
    }

}
