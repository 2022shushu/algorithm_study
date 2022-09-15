// 1453번

import java.util.*;

public class Solve220915 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 손님 수 입력
        int N = sc.nextInt();

        // 전체 손님들 입력 각각 받고 거절 수 찾기
        int refuse = 0; // 거절 변수 초기화
        int[] computer = new int[100]; // 컴퓨터 배열 초기화

        for(int i = 0; i < N; i++){
            int customer = sc.nextInt(); // 고객 자리 입력

            if(computer[customer - 1] == 0){ // 빈 자리라면
                computer[customer - 1]++; // 자리 값 추가
            }else{ // 빈 자리가 아니라면
                refuse++; // 거절 사람 수 추가
            }
        }

        // 결과 출력
        System.out.println(refuse);

        sc.close();
    }
}
