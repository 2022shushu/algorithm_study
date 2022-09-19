// 3009번

import java.util.*;

public class Solve220919 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        // 세 점 좌표 입력
        int[][] ThreeNum = new int[3][2];

        for(int i =0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                ThreeNum[i][j] = sc.nextInt();
            }
        }

        // x축 좌표 검사 후 출력
        if(ThreeNum[0][0] == ThreeNum[1][0]){
            System.out.print(ThreeNum[2][0] + " ");
        }else if(ThreeNum[0][0] == ThreeNum[2][0]){
            System.out.print(ThreeNum[1][0] + " ");
        }else{
            System.out.print(ThreeNum[0][0] + " ");
        }

        // y축 좌표 검사 후 출력
        if(ThreeNum[0][1] == ThreeNum[1][1]){
            System.out.print(ThreeNum[2][1]);
        }else if(ThreeNum[0][1] == ThreeNum[2][1]){
            System.out.print(ThreeNum[1][1]);
        }else{
            System.out.print(ThreeNum[0][1]);
        }


        sc.close();
    }

}