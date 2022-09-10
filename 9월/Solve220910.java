// 

import java.util.*;

public class Solve220910 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 체스 검사 변수 초기화
        int F = 0;

        // 체스 판 입력
        for(int i = 0; i < 4; i++){
            String chess_Line_O = sc.nextLine();
            char[] chess_F1 = chess_Line_O.toCharArray();
            for(int k = 0; k < 8; k++){
                if(k == 0){
                    if(chess_F1[k] == 'F'){
                        F++;
                    } 
                }
                else if((k % 2) == 0){
                if(chess_F1[k] == 'F'){
                    F++;
                } }
            }
            String chess_Line_E = sc.nextLine();
            char[] chess_F2 = chess_Line_E.toCharArray();
            for(int k = 0; k < 8; k++){
                if((k % 2) == 1){
                if(chess_F2[k] == 'F'){
                    F++;
                } }
            }
        }

        // 검사 결과 출력
        System.out.println(F);
        

        sc.close();
    }
}
