//5596번

package S2209;
import java.util.*;

public class Solve220903 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T1_data = sc.nextInt();  
        int T1_math = sc.nextInt();  
        int T1_science = sc.nextInt();  
        int T1_english = sc.nextInt();  
        int T1 = T1_data + T1_english + T1_math + T1_science;  


        int T2_data = sc.nextInt();  
        int T2_english = sc.nextInt();  
        int T2_math = sc.nextInt();  
        int T2_science = sc.nextInt();  
        int T2 = T2_data + T2_english + T2_math + T2_science;
        
        if(T1 >= T2){
            System.out.println(T1);
        }else{
            System.out.println(T2);
        }




        sc.close();

    }
}