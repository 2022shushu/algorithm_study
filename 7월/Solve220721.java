package algorithm; // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // scanner 객체 생성 

        int N = sc.nextInt(); // N 입력
        int X = sc.nextInt(); // X 입력

        int numInput[] = new int[N]; // numInput 배열 생성

        for(int i=0; i<N; i++){
            numInput[i] = sc.nextInt(); // N 갯수 만큼 입력
        }

        sc.close(); // scanner 사용 종룍
        
        for(int j=0; j<numInput.length; j++){
            if(numInput[j]<X){ // 조건문, 입력값 중에서 X 보다 작은 값 
                System.out.print(numInput[j]);  // 조건 해당값 출력
                System.out.print(" ");
            }
        }
    }
}
