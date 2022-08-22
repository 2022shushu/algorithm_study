// 10773번 제로

package S2208;
import java.util.*;

public class Solve220828 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // K 입력 받기
        int K = sc.nextInt();
        int[] K_num = new int[K];

        // K개 만큼 입력 받기
        for(int i =0; i < K; i++){
            int a = sc.nextInt();
            if(a != 0){
                K_num[i] = a;
            }else{
                int j = 1;
                while(i-j != -1){
                    if(K_num[i-j] != 0){
                        K_num[i-j] = 0;
                        break;
                    }j++;
                }
            }
        }

        // 결과 출력
        int res = 0;
        for(int j = 0; j < K; j++){
            res += K_num[j];
        }
        System.out.println(res);

        sc.close();
    }
}
