// 4153번

package S2208;
import java.util.*;

public class Solve220825 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        
        // 직각 삼각형
        while((A!= 0)||(B!= 0)||(C!= 0)){
            if((C>A)&&(C>B)){
            if(C * C == (A * A + B * B) ){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }}else if((B>A)&&(B>C)){
                if(B * B == (A * A + C * C)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }}else{
            if(A * A == (B * B + C * C)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
            }                
            
            A =sc.nextInt();
            B =sc.nextInt();
            C =sc.nextInt();
        }

        sc.close();
    }
}
