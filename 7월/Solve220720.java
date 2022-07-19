package algorithm; // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220720 {
    public static void main(String[] args){
        int num_star= 0; // 변수 초기화
        
        Scanner scanner = new Scanner(System.in); 
        String tmp = scanner.nextLine(); // 화면 통해 받은 입력값 tmp에 저장
        num_star = Integer.parseInt(tmp);  // tmp 문자열 값을 숫자로 변환
        
        for(int i=0;i<num_star;i++){  // 전체 반복 횟수
            for(int j=num_star - 1; j >i; j--){ // 공백  
                System.out.print(" ");
            }
            for(int k=0; k <=i; k++){ // 별
                System.out.print("*"); 
            }
            System.out.println(); // 줄 바꿈
        }
    }
}