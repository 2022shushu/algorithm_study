// 2902번

import java.util.*;

public class Solve220926 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        char[] AC = A.toCharArray();

        int i = 0;

        while(i != A.length()){
            if(i == 0 ){
                System.out.print(AC[0]);
            }else if(AC[i] == '-'){
                System.out.print(AC[i+1]);
            }
            i++;
        }
        sc.close();
    }

}