//25372번 백준
package algorithm;
import java.util.*;

public class Solve220728_real {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N];


        for(int i=0; i<N; i++){
            A[i] = sc.next();
            if(A[i].length()>=6&&A[i].length()<=9){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
    
}
