// 1152번

package S2208;
import java.util.*;

public class Solve220821 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 문자열 받기
        String A = sc.nextLine();
        char[] A_L = A.toCharArray();

        // 단어 개수 셀 변수 초기화
        int temp = 0;
        int temp_ = 0;

        // 공백 검사로 단어 개수 구하기
        for(int i =0; i<A.length(); i++){
            if(A_L[i] == ' '){
                if(i == 0){}
                else if(i==A.length()-1){}
                else {temp++;}
            }else{
                temp_++;
            }
        }

        // 단어 개수 출력
        if(temp_ == 0){
            System.out.println(0);
        }else{
            temp++;
        System.out.println(temp);
        }

        sc.close();
    }
}
