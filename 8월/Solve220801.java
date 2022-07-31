package algorithm;
import java.util.*;

public class Solve220801 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        Long B = sc.nextLong();

        System.out.println((A+B)*(A-B));

        sc.close();
    }
}
