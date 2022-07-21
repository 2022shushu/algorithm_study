package algorithm; // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class SOlve220722 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //scanner 객체 생성

        int A = sc.nextInt(); //A 입력
        int B = sc.nextInt(); //B 입력

        while(true){ //while 문(조건 성립할 때까지, 반복)
            if(!(A==0 && B ==0)){ //A == 0 && B == 0 가 아닌 경우 실행
            System.out.println(A+B); // A + B 합 출력
            
            A = sc.nextInt(); // 새로운 A B 입력
            B = sc.nextInt();
        }else{
            break; // A == 0 && B == 0 인 경우 반복문 break
        }
        }
  
        sc.close(); 
    }
    
}
