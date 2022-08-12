package algorithm;
import java.util.*;

public class Solve220812 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
        A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i<N; i++){
            System.out.println(A[i]);
            }
        


        sc.close();
    }
}
