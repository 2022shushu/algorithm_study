// 5565번

import java.util.*;

public class Solve220921 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        int re = sc.nextInt();

        int i =0;
        while(i != 9){
            re -= sc.nextInt();
            i++;
        }

        System.out.println(re);
        sc.close();
    }

}