// 11050번 이항정리

package S2208;
import java.util.*;

public class Solve220829 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       // n! / k!(n-k)!

       // N , K 입력 받음
       int N = sc.nextInt();
       int K = sc.nextInt();

       // 이항정리
       int n_r = 1;
       int k_r = 1;
       int res = 0;

       for(int i = 1; i < N +1; i++){
        n_r *= i;
       }

       for(int j = 1; j < K + 1; j++){
        k_r *= j;
       }

       for(int k = 1; k < N - K + 1; k++){
        k_r *= k;
       }

       res = n_r / k_r;

       // 결과 출력
       System.out.println(res);

        sc.close();
    }
}
