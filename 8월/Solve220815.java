package algorithm;
import java.util.*;

public class Solve220815 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String Pol = sc.nextLine();
        char[] pol = Pol.toCharArray();
        int temp = 0;
        int temp_4 = 0;
        int temp_2 = 0;
        int point = 0;
        
        for(int i=0; i<pol.length; i++){
            if(pol[i] == 'X'){
                temp++;
            }else if(pol[i] == '.'){
                if(temp%2 != 0){
                    point++;
                }
                temp = 0;
            }
            if(i==pol.length-1){
                if(temp % 2 != 0){
                    point++;
                }
            }
        }

        temp = 0;

        if(point != 0){
            System.out.print(-1);
        }else{
        for(int i=0; i<pol.length; i++){
            if(pol[i] == 'X'){
                temp++;
            }else if(pol[i] == '.'){
                temp_4 = temp/4;
                temp_2 = (temp -temp_4*4)/2;
                for(int j=0; j<temp_4; j++){
                    System.out.print("AAAA");
                }
                for(int k=0; k<temp_2; k++){
                    System.out.print("BB");
                }
                temp = 0;
                temp_4 = 0;
                temp_2 = 0;
                System.out.print('.');
            }
        }


        if(temp != 0){
                    temp_4 = temp/4;
                    temp_2 = (temp -temp_4*4)/2;
                    for(int j=0; j<temp_4; j++){
                        System.out.print("AAAA");
                    }
                    for(int k=0; k<temp_2; k++){
                        System.out.print("BB");
                    }
                }}
            
        sc.close();}
        }

        
    

