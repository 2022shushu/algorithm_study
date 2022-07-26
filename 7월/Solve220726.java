package algorithm;
import java.util.*;

public class Solve220726 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numIn = sc.nextInt();
        double numMax = 0;
        double numAve = 0;


        double[] numN = new double[numIn];

        for(int i=0; i < numIn; i++ ){
            numN[i] = sc.nextDouble();
            if(numN[i] > numMax){
                numMax = numN[i];
            }
        }

        for(int j=0; j < numIn; j++){
        numN[j] = (numN[j] / numMax) *100;
            numAve += numN[j];
        }

        System.out.print(numAve /= numIn);

        sc.close();
        

    }
    
}
