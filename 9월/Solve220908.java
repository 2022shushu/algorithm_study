// 1598번 꼬리를 무는 숫자 나열

import java.util.*;

public class Solve220908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 위치 두 개 입력
        int L1 = sc.nextInt();
        int L2 = sc.nextInt();

        // 거리 변수 초기화
        int F = 0;

        // 행 거리
        int P1 = L1 % 4;
        int P2 = L2 % 4;

        // 열 거리
        int D1 = L1 / 4;
        int D2 = L2 / 4;

		// 각각 행값이 4일 경우 P 값이 0이 아닌 4가 되도록 변경
        if(P1 == 0){
            P1 = 4;
            D1--;
        }
        if(P2 == 0){
            P2 = 4;
            D2--;
        }

        // 행 거리 계산
        F += (int)Math.abs((double)(P1 - P2));

        // 열 거리 계산
        F += (int)Math.abs((double)(D1 - D2));

        // 결과 출력
        System.out.println(F);



        sc.close();
    }
}