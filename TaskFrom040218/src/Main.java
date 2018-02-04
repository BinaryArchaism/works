import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    }

    public static void task_3() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.print(number + " = ");
        for (int i = 2; i <= number; ++i) {
            while (number % i == 0) {
                number = number / i;
                System.out.print(i + " * ");
            }
        }

    }

    public static void task4_1() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int arr[] = new int[4];
        for (int i = 0; i <4; ++i) {
            arr[i] = number%10;
            number/=10;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3]);
    }
}
