// 1712번 손익분기점

package S2208;
import java.util.*;

public class Solve220830 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(b >= c){
        System.out.println(-1);
    }else{
        System.out.println(a/(c-b)+1);
    }

    sc.close();
 }   
}
