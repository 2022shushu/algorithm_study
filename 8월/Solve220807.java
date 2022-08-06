package algorithm;
import java.util.*;

public class Solve220807 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < N; i++){
            String A = sc.nextLine();

            char[] B = A.toCharArray();

            int temp = 0;
            int sum = 0; 

            for(int j=0; j<A.length(); j++){
                if(B[j] == 'O'){
                    temp += 1;
                    sum += temp;
                }else {
                    temp = 0;
                }
            }
            System.out.println(sum);
        }


        sc.close();
    }
}
