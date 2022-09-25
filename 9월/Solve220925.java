// 2798번

import java.util.*;

public class Solve220925 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] NC = new int[N];
        for(int i =0; i < N; i++){
            NC[i] = sc.nextInt();
        }
        int temp = 0;;

        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                if(((M - (NC[i] + NC[j] + NC[k])) >= 0) && ((NC[i] + NC[j] + NC[k]) > temp)){
                    temp = (NC[i] + NC[j] + NC[k]);
                }
                }
            }
        }

        System.out.println(temp);

        sc.close();
    }

}