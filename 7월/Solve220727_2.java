package algorithm;
import java.util.*;

public class Solve220727_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = 0;

        for(int i=0; i<A; i++){
            for(int k=0; k<B; k++){
                System.out.print(" ");
            }
            for(int j=0; j<A-B; j++){
                System.out.print("*");
            }
            System.out.println("");
            B++;
        }


    }
}
