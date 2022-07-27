package algorithm;
import java.util.*;

public class Solve220730 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Double [] A = new Double[5];
        int B=0;

        for(int i=0; i<5; i++){
            A[i] = sc.nextDouble();
            B += (int)Math.pow(A[i], 2);
        }

        System.out.println(B%10);

        sc.close();
    }   
}
