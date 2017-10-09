/**
 * Created by Dmitrii on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 23, 4, 1, 6 ,8 , 3, 4, 5};
        int max1, max2, max3;

        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }
        if (a[2] < a[1]) {
            max3 = a[2];
        }
        else max3 = a[2];
        if (a[2] > a[0]){
            int temp = max1;
            int temp2 = max2;
            max1 = a[2];
            max2 = temp;
            max3 = temp2;
        }

        System.out.println(max1+" "+max2+" "+max3);

        for (int i = 3; i < a.length; i++){
            if (a[i] > max1) {
                int temp = max2;
                max2 = max1;
                max3 = temp;
                max1 = a[i];
            } else {
                if (a[i] > max2) {
                    max3 = max2;
                    max2 = a[i];
                }
                else  if (a[i] > max3) {
                    max3 = a[i];
                }
                else System.out.println("Unexpected error");
            }
        }

        System.out.println(max1+" "+max2+" "+max3);
    }
}
