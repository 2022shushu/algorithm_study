// 번

import java.util.*;

public class Solve220928 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int r = 0;
            int car = sc.nextInt();
            int n = sc.nextInt();
            for(int j = 0; j < n; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                r += (a * b);
            }

            System.out.println(car + r);
        }
        sc.close();
    }

}