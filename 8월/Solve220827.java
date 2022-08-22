// 1978번 소수 찾기

package S2208;
import java.util.*;

public class Solve220827 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // N 입력 받기
    int N = sc.nextInt();

    // N개 만큼 자연수 입력 받기
    int res = 0;

    // 반복문 조건에 사용될 변수들 초기화
    int b = 1;
    int c = 0;
    int a = 0;


    for(int i = 0; i < N; i++){
        a = sc.nextInt();
        // 1 부터 a-1 까지 나눠서, 나머지 없이 나누어지는 경우 확인
        while(b != a){
            if(a%b==0){
                c++;
            }
            b++;
        }
        b = 1;

        // 입력이 1이 아닐 때, 나머지 없이 나누어지는 경우 소수라 판별
        if(a != 1){
            if(c == 1){
                res++;
            }
        }
        c = 0;
    }

    // 소수 개수 출력
    System.out.println(res);

    sc.close();

 }   
}
