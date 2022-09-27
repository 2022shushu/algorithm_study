// 2010번

import java.util.*;

public class Solve220927 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int re = 0;
        int one = 0;
        int f = 1;
        int[] NR = new int[N];

        int i = 0;

        while(i != N){
            NR[i] = sc.nextInt();

            if((f == 1) && (NR[i] != 1)){
                re += NR[i];
                f *= -1;
            }else if(NR[i] != 1){
                re += (NR[i] -1);
            }else{
                one++;
            }

            i++;
        }

         if(one == N){
            System.out.println(1);
         }else{
         System.out.println(re);
         }
        sc.close();
    }

}