// 9012번 괄호

package S2209;
import java.util.*;

public class Solve220901 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // T 입력 받음
        int T = sc.nextInt(); 
        sc.nextLine();

        // T 만큼 반복해서 문자열 입력
        for(int i = 0; i < T; i++){
            String A = sc.nextLine();
            char[] AC = A.toCharArray();

            // 괄호 개수 중간 저장 변수 초기화
            int temp = 0;

            // 괄호가 '('이면 temp 늘리고 ')'이면 temp 감소
            // 검사 중, temp가 0에서 ')' 발견시 NO 출력, temp는 -1로 저장 반복문 break 탈출
            for(int j =0; j < A.length(); j++){
                if(AC[j] == '('){
                    temp++;
                }else{
                    if(temp == 0){
                        System.out.println("NO");
                        temp = -1;
                        break;
                    }
                    temp--;
                }
            }

            // 검사 끝난 뒤, 괄호 중간 값 저장 변수 temp가 0이 아니거나, -1인 경우 NO 출력. 아니면 'YES' 출력
            if((temp != 0) && (temp != -1)){
                System.out.println("NO");
            }else if(temp == 0){
                System.out.println("YES");
            }
        }

        sc.close();

    }
}
