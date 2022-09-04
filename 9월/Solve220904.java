//1236번 성지키기

package S2209;
import java.util.*;

public class Solve220904 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //행 열 입력
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        //성 입력
        char[][] castle = new char[N][M];

        for(int i = 0; i < N; i++){
            String c = sc.nextLine();
            char[] d = c.toCharArray();
            for(int j = 0; j < M; j++){
                castle[i][j] = d[j];
           }
        }

        // 경비원이 없는 행의 줄 수, 와 계산
        int noN = 0;
        int temp = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
               if(castle[i][j] == 'X'){
                temp++;
               }
            }if(temp == 0){
                noN++;
            }temp = 0;
        }
        

        // 경비원이 없는 열의 줄 수
        int noM = 0;

        for(int j = 0; j < M; j++){
            for(int i = 0; i < N; i++){
               if(castle[i][j] == 'X'){
                temp++;
               }
            }if(temp == 0){
                noM++;
            }temp = 0;
        }

        // 결과 출력
        if(noN >= noM){
            System.out.println(noN);
        }else{
            System.out.println(noM);
        }
        

        sc.close();
    }
}
