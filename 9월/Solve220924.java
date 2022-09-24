// 2506번

import java.util.*;

public class Solve220924 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();

        int[] NC = new int[N];

        int temp = 1;
        int re = 0;

        for(int i =0; i < N; i++){
            NC[i] = sc.nextInt();
            if(NC[i] != 0){
                re += temp;
                temp++;
            }else{
                temp = 1;
            }
        }

        System.out.println(re);
        sc.close();
    }

}