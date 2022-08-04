// 백준 2675번 문자열 반복

package algorithm; // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220805 {
 
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in); //Scanner 객체 생성
     
            int n = in.nextInt(); // n 값 받기
            

            for(int i=0; i<n; i++){ // n 값 만큼 반복
                int A = in.nextInt(); //숫자 입력
                String B= in.next(); // 문자열 입력
                for(int j=0; j<B.length();j++){ 
                    for(int k=0; k<A; k++){ // 입력 받은 숫자 만큼 반복
                        System.out.print(B.charAt(j)); // 문자 출력
                    }
                }
                System.out.println(""); // 줄 바꿈
            }
           

            in.close();
        }
    }
