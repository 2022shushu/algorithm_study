// 1259번 팰린드롬수

package S2209;
import java.util.*;

public class Solve220902 {
    public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    
    // 우선 하나 입력 받기
    int Num = sc.nextInt();

    // 0 입력 될 때까지 반복
       while(Num != 0){

    // 입력 값 문자열 배열로 변겅
        String NumS = String.valueOf(Num);
        char[] NumC = NumS.toCharArray();

    // 중간값 찾기
        int mid = NumS.length() / 2;

    // 횟수 저장 변수 초기화
        int m = 0;
    
    // 수의 길이가 2로 나누어지는 경우
        if(NumS.length() % 2 == 0){
        for(int k = 1; k < mid + 1 ; k++){
            if(NumC[mid + k -1] == NumC[mid - k]){
                m++;
            }
        }}
    
    // 수의 길이가 2로 나누어지지 않는 경우
    else{
            for(int k = 1; k < mid + 1; k++){
                if(NumC[mid + k] == NumC[mid - k]){
                    m++;
                }
            }
        }

    // 팰린드롬수 판정 후 결과 출력
        if(m == mid){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    // m 다시 초기화
        m = 0;

        Num = sc.nextInt();
        }
        

    sc.close();
    }
}