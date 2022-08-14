package algorithm;
import java.util.*;

public class Solve220814 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int res = 0;
        int r = 0;

        Loop1 :
            for(int i = 0; i<5000; i++){
                for(int j=0; j<5000; j++){
                  res =  3 * i + 5 * j; 
     
                  if(res==N){
                    r = i + j;
                    break Loop1;
                  }
          
                }

        }
        if(r == 0){
            System.out.print(-1);
        }else {
        System.out.print(r);
        }
        sc.close();

    }
}
