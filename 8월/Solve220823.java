package S2208;
import java.util.*;

public class Solve220823 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // A B C 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 각각 곱한 값 문자열로 저장
        int res = A * B * C;
        String res_S = Integer.toString(res);
        char[] res_C = res_S.toCharArray();

        // 숫자 담을 배열 초기화
        int[] Num = new int[10];

        // 각 숫자 검사
        for(int i =0; i<res_S.length(); i++){
            Num[res_C[i] - '0']++;
        }

        // 결과 출력
        for(int j = 0; j<10; j++){
            System.out.println(Num[j]);
        }


        sc.close();
    }
    
}
