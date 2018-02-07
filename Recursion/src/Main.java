/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */


public class Main {
    public static void main(String[] args) {
        System.out.println(sum(8, 16));
    }

    public static int recursion1(int n, int s) {
        if (n == 0) return s;
        else s = n * s;
        return recursion1(n-1, s);
    }

    public static int sum(int n, int m) {
        if (n == 0) return m;
        return sum(--n, ++m);
    }
}
