// 1065번 한수

package S2208;
import java.util.Scanner;

public class Solve220831 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N 입력 받고, 중간 변수 temp, 결과 변수 res 초기화
        int N = sc.nextInt();
        int res = 99;
        int temp = 99;

        // 100보다 작은 수는 모두 한수 이므로, 100보다 작을 경우 바로 출력
        if(N < 100){
            System.out.println(N);
        }
        
        // 각 수, while문으로 한수인지 점검하고, 한수이면 개수 추가. 
        else{
            while(temp != N+1){
                if(((temp/100)-((temp%100)/10))==(((temp%100)/10)-((temp%10)/1))){
                    res++;
                }temp++;
            }

            // 결과 출력
            System.out.println(res);
        }

        sc.close();
    }
    
}
