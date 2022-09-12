// 5585번

import java.util.*;

public class Solve220912 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 지불한 금액 입력
        int money = sc.nextInt();   
        int change = 1000 - money; // 총 잔돈 계산

        // 잔돈 검사 시작
        int num_c = 0; // 잔돈 갯수
        int i = 0; // 중간 변수
        
        i = change / 500; // 500엔
        change -= i * 500;
        num_c += i;

        if(change != 0){
            i = change / 100; // 100엔
            change -= i * 100;
            num_c += i;
        }

        if(change !=  0){
            i = change / 50; // 50엔
            change -= i * 50;
            num_c += i;
        }

        if(change !=  0){
            i = change / 10; // 10엔
            change -= i * 10;
            num_c += i;
        }

        if(change !=  0){
            i = change / 5; // 5엔
            change -= i * 5;
            num_c += i;
        }

        if(change != 0){
            i = change / 1; // 1엔
            change -= i * 1;
            num_c += i;
        }

        // 결과 출력
        System.out.println(num_c);
        

        sc.close();
    }
}
