package S2208;
import java.util.*;

public class Solve220820 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // L 과 R 입력 받기
        int L = sc.nextInt();
        int R = sc.nextInt();

        // 8 저장할 변수와 , 배열 변수 값 저장
        int N_L = 0;
        int  i = 0;

        // R이 L 보다 자릿수가 많은 경우 0 출력
        String B = String.valueOf(R);
        String A = String.valueOf(L);
        if(B.length() > A.length()){
            System.out.println(0);
        }else{

        // L 과 R 이 자릿수가 같은 경우, 같은 숫자인 자릿수 부분까지만 '8' 개수 확인 후 출력
        char[] A_L = A.toCharArray();
        char[] B_L = B.toCharArray();
        
        while(i  != A.length()){
            if(A_L[i] == B_L[i]){
                if(A_L[i] == '8'){
                    N_L++;
                }
            }else if(A_L[i] != B_L[i]){
                break;
            }
            i++;
        }
        
            System.out.println(N_L);
        
        }
        
      

       
        
        sc.close();
}
}
