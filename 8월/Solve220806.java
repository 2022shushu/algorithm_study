//백준 2920번 음계 문제

package algorithm; //파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220806 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        int[] A = new int[8]; // 숫자 값 저장 배열 생성
        
        for(int i=0; i<A.length;i++){
            A[i] = sc.nextInt(); // 숫자 값 입력
        }

        String B = Arrays.toString(A).replaceAll("[^0-9]",""); // 입력한 숫자 값 문자열로 변환

        if(B.equals("12345678")){ // 오름차순 일때
            System.out.println("ascending"); // ascending 출력
        }else if(B.equals("87654321")){ // 내림차순 일때
            System.out.println("descending"); // descending 출력
        }else{                                  // 나머지
            System.out.println("mixed"); // mixed 출력
        }

        sc.close(); //Scanner 종료
    }
}

