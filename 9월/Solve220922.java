// 4447번

import java.util.*;

public class Solve220922 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while( i != N){
            String A = sc.nextLine();
            char[] AC = A.toCharArray();
            int GN = 0;
            int BN = 0;

            for(int j =0; j < A.length(); j++){
                if((AC[j] == 'g') || (AC[j] == 'G')){
                    GN++;
                }else if((AC[j] == 'b') || (AC[j] == 'B')){
                    BN++;
                }
            }

            if(GN > BN){
                System.out.println(A + " " + "is" + " " + "GOOD");
            }else if(GN == BN){
                System.out.println(A + " " + "is" + " " + "NEUTRAL");
            }else{
                System.out.println(A + " " + "is" + " " + "A BADDY");
            }

            GN = 0;
            BN = 0;

            i++;
        }
        sc.close();
    }

}
