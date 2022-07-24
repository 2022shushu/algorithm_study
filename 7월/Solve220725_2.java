// 백준 11720번 숫자의 합

package algorithm;  // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220725_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        String numFirst = sc.nextLine(); // N 숫자 개수, 문자열로 입력 받음
        int numSecond = Integer.parseInt(numFirst); // 정수로 변경
        String numInput = sc.nextLine(); // N 만큼 숫자 개수 받음
        String[] numOutput = numInput.split("");  // 문자열을 각각 배열로 요소 저장
        int[] numNumber = new int[numSecond]; // 정수로 받을 배열 형성
        int sum = 0; // 총합 초기화

        for(int i =0; i < numInput.length(); i++){ // N 만큼 반복
            numNumber[i] = Integer.parseInt(numOutput[i]); // 각각 요소 정수로 변경해 저장
            sum += numNumber[i]; // 변경된 요소 합계에 저장
        }

        System.out.println(sum); // 전체 값 출력
        sc.close();
    }
    
}
