// 2460번 지능형 기차2

import java.util.*;

public class Solve220913 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 최고로 많이 있는 정차역의 사람 수 초기화
        int manyP = 0;

        // 각 정차역의 사람 수 초기화
        int nowP = 0;

        // 10번의 정차역 반복
        for(int i = 0; i < 10; i++){
            int out = sc.nextInt();
            int in = sc.nextInt();

            nowP += (in - out);
            if(nowP > manyP){
                manyP = nowP;
            }
        }

        // 결과 출력
        System.out.println(manyP);
        
        sc.close();
    }
}