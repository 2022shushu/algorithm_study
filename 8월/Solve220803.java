package algorithm;
import java.util.*;

public class Solve220803 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        int[] C = new int[A.length()];

        for(int i=0; i<A.length();i++){
            C[i] = A.charAt(i) -'0';
        }

        for(int i=1; i<A.length(); i++){
            for(int j=0; j< A.length() - i; j++){
                if(C[j]<C[j+1]){
                    swap(C, j, j+1);
                }
            }
        }
        for(int k=0; k<A.length(); k++){
            System.out.print(C[k]);
        }

        sc.close();
    }


private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
}