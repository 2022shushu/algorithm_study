// 번

import java.util.*;

public class Solve220917 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int i = 0;

    int[] C = new int[3];
    C[0]++;
    int temp = 0;

    while(i != N){
        int X = sc.nextInt() - 1;
        int Y = sc.nextInt() - 1;

        temp = C[X];
        C[X] = C[Y];
        C[Y] = temp;

        i++;
        temp = 0;
    }

    if(C[0] == 1){
        System.out.println(1);
    }else if(C[1] == 1){
        System.out.println(2);
    }else {
        System.out.println(3);
    }

        sc.close();
    }

}
