package algorithm.S2208;
import java.util.*;

public class Solve220817 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int A_s = sc.nextInt();
        int B_s = sc.nextInt();

        int A_d = 0;
        int B_d = 0;

        A_d = A/A_s;
        if(A%A_s != 0){
            A_d++;
        }
        B_d = B/B_s;
        if(B%B_s != 0){
            B_d++;
        }
        if(A_d > B_d){
            System.out.println(N-A_d);
        }else{
            System.out.println(N-B_d);
        }



        sc.close();
    }
}
