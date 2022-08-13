package algorithm;
import java.util.*;

public class Solve220813 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int w = sc.nextInt();
        int h = sc.nextInt();

        int s_x = w-x;
        int s_y = h-y;

        int[] arr = new int[4];

    arr[0] = x;
    arr[1] = y;
    arr[2] = s_x;
    arr[3] = s_y;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(arr[0]);

        sc.close();
    }
}
