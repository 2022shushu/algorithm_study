// 백준 10818 번 최소, 최대
package algorithm;
import java.util.*;

public class Solve220725_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numInput = new int[N]; // 입력값 담을 배열 생성

        for(int i=0; i<numInput.length; i++){ // N번 반복
            numInput[i] = sc.nextInt(); // 입력 값 받음
        }

        int maxNum = -1000000; // 최댓값
        int minNum = 1000000; // 최솟값

        for(int j=0; j<numInput.length; j++){ // 최대 최소 확인하는 연산, 반복문
            if(numInput[j] > maxNum){ // 최댓값 보다 크면
                maxNum = numInput[j]; // 최댓값 교체
            } else if(numInput[j] < minNum){ // 최솟값 보다 작으면
                minNum = numInput[j]; // 최솟값 교체
            } 
        }

        System.out.println(minNum+ " " + maxNum); // 최대 최소 출력

        sc.close();
    }
}





