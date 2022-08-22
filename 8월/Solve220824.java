package S2208;
import java.util.*;

public class Solve220824 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 숫자 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 각 수 백의 자리와 일의 자리 변경
        char temp = ' ';

        String A_S = String.valueOf(A);
        char[] A_C = A_S.toCharArray();
        
        temp = A_C[0];
        A_C[0] = A_C[2];
        A_C[2] = temp;
        
        int A_N = Integer.parseInt(String.valueOf(A_C));

        String B_S = String.valueOf(B);
        char[] B_C = B_S.toCharArray();

        temp = B_C[0];
        B_C[0] = B_C[2];
        B_C[2] = temp;

        int B_N = Integer.parseInt(String.valueOf(B_C));

        if(A_N > B_N){
            System.out.println(A_N);
        }else{
            System.out.println(B_N);
        }

    
        sc.close();
    }
    
}
