package S2208;
import java.util.*;

public class Solve220822 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 단어 입력
        String L = sc.nextLine(); 
        char[] L_c = L.toCharArray();

        // 알파벳 배열 생성
        int[] Al = new int[26];
        char[] Bl = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        // 알파벳 개수 검사
        for(int i = 0; i < L.length(); i++){
            if((L_c[i] == 'a') || (L_c[i] == 'A')){
                Al[0]++;
            }else if((L_c[i] == 'b') || (L_c[i] == 'B')){
                Al[1]++;
            }else if((L_c[i] == 'c') || (L_c[i] == 'C')){
                Al[2]++;
            }else if((L_c[i] == 'd') || (L_c[i] == 'D')){
                Al[3]++;
            }else if((L_c[i] == 'e') || (L_c[i] == 'E')){
                Al[4]++;
            }else if((L_c[i] == 'f') || (L_c[i] == 'F')){
                Al[5]++;
            }else if((L_c[i] == 'g') || (L_c[i] == 'G')){
                Al[6]++;
            }else if((L_c[i] == 'h') || (L_c[i] == 'H')){
                Al[7]++;
            }else if((L_c[i] == 'i') || (L_c[i] == 'I')){
                Al[8]++;
            }else if((L_c[i] == 'j') || (L_c[i] == 'J')){
                Al[9]++;
            }else if((L_c[i] == 'k') || (L_c[i] == 'K')){
                Al[10]++;
            }else if((L_c[i] == 'l') || (L_c[i] == 'L')){
                Al[11]++;
            }else if((L_c[i] == 'm') || (L_c[i] == 'M')){
                Al[12]++;
            }else if((L_c[i] == 'n') || (L_c[i] == 'N')){
                Al[13]++;
            }else if((L_c[i] == 'o') || (L_c[i] == 'O')){
                Al[14]++;
            }else if((L_c[i] == 'p') || (L_c[i] == 'P')){
                Al[15]++;
            }else if((L_c[i] == 'q') || (L_c[i] == 'Q')){
                Al[16]++;
            }else if((L_c[i] == 'r') || (L_c[i] == 'R')){
                Al[17]++;
            }else if((L_c[i] == 's') || (L_c[i] == 'S')){
                Al[18]++;
            }else if((L_c[i] == 't') || (L_c[i] == 'T')){
                Al[19]++;
            }else if((L_c[i] == 'u') || (L_c[i] == 'U')){
                Al[20]++;
            }else if((L_c[i] == 'v') || (L_c[i] == 'V')){
                Al[21]++;
            }else if((L_c[i] == 'w') || (L_c[i] == 'W')){
                Al[22]++;
            }else if((L_c[i] == 'x') || (L_c[i] == 'X')){
                Al[23]++;
            }else if((L_c[i] == 'y') || (L_c[i] == 'Y')){
                Al[24]++;
            }else if((L_c[i] == 'z') || (L_c[i] == 'Z')){
                Al[25]++;
            }
        }

        // 가장 많은 알파벳 찾기
        int temp = 0;
        int temp_j = 26;
        for(int j =0; j<26; j++){
            if(Al[j] > temp){
                temp = Al[j];
                temp_j = j;
            } 
        }

        int temp_ = 0;
        for(int k =0; k<26; k++){
            if(Al[k] == temp){
                temp_++;
            } 
        }

        if(temp_ != 1){
            System.out.println('?');
        }else{
            System.out.println(Bl[temp_j]);
        }

        sc.close();
    }
    
}
