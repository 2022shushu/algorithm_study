// 백준 2562 번 최댓값

package algorithm; // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220725 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  //scanner 객체 생성

        int[] numInput = new int[9]; // 입력값 담을 배열 생성

        for(int i=0; i<numInput.length; i++){ // 9번 반복
            numInput[i] = sc.nextInt(); // 입력 값 받음
        }

        int maxNum = 0; // 최댓값
        int maxNumI = 0; // 최댓값의 인덱스

        for(int j=0; j<numInput.length; j++){ //최댓값 확인하는 연산, 반복문
            if(numInput[j] > maxNum){ // 최댓값 보다 크면
                maxNum = numInput[j]; // 최댓값 교체
                maxNumI = j+1; // 그 때 인덱스 저장
            }
        }

        System.out.println(maxNum); // 최댓값 출력
        System.out.println(maxNumI); // 최댓값 인덱스 출력

        sc.close();
    }
}
