package algorithm;
import java.util.*;

public class Solve220802 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        if(A.equals("A+")){
            System.out.print(4.3);
        }else if(A.equals("AO")){
            System.out.print(4.0);
        }else if(A.equals("A-")){
            System.out.print(3.7);
        }else if(A.equals("B+")){
            System.out.print(3.3);
        }else if(A.equals("BO")){
            System.out.print(3.0);
        }else if(A.equals("B-")){
            System.out.print(2.7);
        }else if(A.equals("C+")){
            System.out.print(2.3);
        }else if(A.equals("CO")){
            System.out.print(2.0);
        }else if(A.equals("C-")){
            System.out.print(1.7);
        }else if(A.equals("D+")){
            System.out.print(1.3);
        }else if(A.equals("DO")){
            System.out.print(1.0);
        }else if(A.equals("D-")){
            System.out.print(0.7);
        } else{
            System.out.print(0.0);
        }



        sc.close();
    }
}
