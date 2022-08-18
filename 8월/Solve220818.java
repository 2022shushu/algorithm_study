package algorithm.S2208;
import java.util.*;

public class Solve220818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Money = sc.nextInt();
        int many = sc.nextInt(); 
        
        for(int i =0; i<many; i++){
            int L = sc.nextInt();
            int price = sc.nextInt();

            Money -= L * price;
        }

        if(Money == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

      


        



        sc.close();
    }
}
