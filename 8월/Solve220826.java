//11866 번

package S2208;
import java.util.*;

public class Solve220826 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N 과 K 입력 받기
        int N = sc.nextInt();
        int K = sc.nextInt();

        // N 기준, 배열 생성
        int[] N_B = new int[N];
        for(int j = 0; j < N; j++){
            N_B[j] = j + 1;
        }
        
        // 기준이 될 변수 초기화 
        int num = 0;
        int k_num = 1;

        // 제거된 값 담을 배열 생성
        int[] num_r = new int[N];  

        // 원 따라 제거
        int kill = K-1;

        num_r[num] = N_B[kill]; 
        N_B[kill] *= -1;
        num++;


        while(num != N){
          while(k_num != K + 1){
            if(kill == N){
                kill = 0;
            }
            if(N_B[kill] < 0){
                kill++;
            }else{
                kill++;
                k_num++;
            }
          }

          k_num = 1;
          kill--;
          if(kill >= N){
            kill -= 7;
          }

          num_r[num] = N_B[kill]; 
          N_B[kill] *= -1;
          num++;
        
        }

        // 결과 값, 출력
        System.out.print("<");
        for(int i = 0; i < N-1; i++){
            System.out.print(num_r[i]+", ");
        }
        System.out.print(num_r[N-1]+">");

        sc.close();
    }
}
