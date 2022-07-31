package algorithm;
import java.util.*;

public class Solve220731 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int large_big = 0;
        int N = sc.nextInt();
        int[][] Num = new int[N][3];
        int[] big = new int[N];

        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++){
                Num[i][j] = sc.nextInt();
            }
            if((Num[i][0] == Num[i][1]) && (Num[i][1] == Num[i][2]) ){
                big[i] = 10000 + Num[i][1]*1000;
            }else if((Num[i][0] == Num[i][1]) || (Num[i][0] == Num[i][2]) || (Num[i][1] == Num[i][2])){
                if(Num[i][0] == Num[i][1]){
                    big[i] = 1000 + Num[i][0] *100;
                } else if(Num[i][0] == Num[i][2]){
                    big[i] = 1000 + Num[i][0] *100;
                } else{
                    big[i] = 1000 + Num[i][2] *100;
                }
            } else {
                if((Num[i][0]>Num[i][1]) && (Num[i][0] > Num[i][2]) ){
                big[i] = 100* Num[i][0];
            } else if((Num[i][1]>Num[i][0]) && (Num[i][1] > Num[i][2]) ){
                big[i] = 100* Num[i][1];
            } else {
                big[i] = 100* Num[i][2];
            } }
            if(big[i] > large_big){
                large_big = big[i];
            }

        }

        System.out.println(large_big);

sc.close();}}
