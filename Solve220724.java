package algorithm; // 파일 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220724 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // scanner 객체 생성 

        int ju_1 = sc.nextInt(); //　주사위 1번 입력
        int ju_2 = sc.nextInt(); //　주사위 2번 입력
        int ju_3 = sc.nextInt(); //　주사위 3번 입력

        if((ju_1==ju_2)&&(ju_2==ju_3)){ //　주사위 수 셋 다 같은 경우
            System.out.println(10000 + ju_1 * 1000);
        }else if((ju_1==ju_2) || (ju_2==ju_3) || (ju_1 == ju_3)){ //　주사위 수 두 개가 같은 경우
            if((ju_1==ju_2)||(ju_1 == ju_3)){ //　같은 주사위가 1 / 2 or 1 / 3 인 경우
                System.out.println(1000 + ju_1 * 100);
            }else {  //　같은 주사위가 2 / 3 or 1 / 2 인 경우
                System.out.println(1000 + ju_2 * 100);
            }
        }else { //　주사위 수가 다 다른 경우
            if((ju_1 > ju_2) && (ju_1 > ju_3)){  //　제일 큰 주사위 수가 1번 인 경우
                System.out.println(ju_1 * 100);
            }else if((ju_2>ju_3)&&(ju_2>ju_1)){ // 제일 큰 주사위 수가 2번 인 경우
                System.out.println(ju_2 * 100);
            }else { // 제일 큰 주사위 수가 3번 인 경우
                System.out.println(ju_3 * 100); 
            }
        }

        sc.close();
    }
    
}
