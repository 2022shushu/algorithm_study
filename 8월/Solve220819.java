//1476번

package algorithm.S2208;
import java.util.*;

public class Solve220819 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // E S M 입력 받음
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        // 년도 저장 변수 초기화
        int temp = 1;

        // E S M이 모두 1이 될때까지 반복
        while((E != 1) || (S != 1) || (M != 1)){
            // 각각 1씩 줄임
            E -= 1;
            S -= 1;
            M -= 1;
            
            // 년도 증가
            temp++;

            // 0이 되면 각각의 최댓값으로 바꿔 저장  
            if(E == 0){
                E = 15;
            }
            if(S == 0){
                S = 28;
            }
            if(M == 0){
                M = 19;
            }

        }

        // 년도 출력
        System.out.print(temp);

        sc.close();
    }
}
