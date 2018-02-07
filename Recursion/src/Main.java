/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */


public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(7, 1));
    }

    public static int recursion(int n, int s) {
        if (n == 0) return s;
        else s = n * s;
        return recursion(n-1, s);
    }
}
