package algorithm;
import java.util.*;

public class Solve220804 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String A = sc.next();
            String[] B = A.split("");
            System.out.println(B[0]+B[A.length()-1]);
        }

        sc.close();
    }
}
