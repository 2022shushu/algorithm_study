// 1731번

import java.util.*;

public class Solve220923 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] NC = new int[N];

        for(int i =0; i < N; i++){
            NC[i] = sc.nextInt();
        }

    if((NC[1]-NC[0]) == (NC[2] - NC[1])){
        System.out.println(NC[N-1] + (NC[1] - NC[0]));
    }else{
        System.out.println(NC[N-1] * (NC[1]/NC[0]));
    }
        sc.close();
    }
}