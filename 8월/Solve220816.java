//1340번

package algorithm;
import java.util.*;

public class Solve220816 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 전체 입력 받음
        String Inp = sc.nextLine();
        char[] Inp_ch = Inp.toCharArray();
        int i = 0; // 전체 문자열, 순서 저장할 숫자 초기화

        // 각각 월 일 연도 시간 분 으로 담을 배열 생성
        char[] Month_F = new char[9];
        
        char[] day = new char[2];
        char[] year = new char[4];
        char[] hour = new char[2];
        char[] min = new char[2];

        // 문자열 중, 월 배열 저장
        while(Inp_ch[i] != ' ' ){
            Month_F[i] = Inp_ch[i];
            i++;
        }

        // 월 배열 중 공백 제외한 새로운 월 배열에 저장  
        char[] Month_R = new char[i];
        for(int j = 0; j<i; j++){
            Month_R[j] = Month_F[j];
        }
        String Month_r = new String(Month_R); // 월 문자 배열, 문자열로 변경  

        int Month_ru = 0; // 월 구분할 변수 초기화

        //월 구분
        if(Month_r.equals("January")){
            Month_ru = 1;
        } else if(Month_r.equals("February")){
            Month_ru = 2;
        } else if(Month_r.equals("March")){
            Month_ru = 3;
        } else if(Month_r.equals("April")){
            Month_ru = 4;
        } else if(Month_r.equals("May")){
            Month_ru = 5;
        } else if(Month_r.equals("June")){
            Month_ru = 6;
        } else if(Month_r.equals("July")){
            Month_ru = 7;
        } else if(Month_r.equals("August")){
            Month_ru = 8;
        } else if(Month_r.equals("September")){
            Month_ru = 9;
        } else if(Month_r.equals("October")){
            Month_ru = 10;
        } else if(Month_r.equals("November")){
            Month_ru = 11;
        } else if(Month_r.equals("December")){
            Month_ru = 12;
        }

        
        // 일 배열에 값 저장
        i++;
        int k =0;
        while(Inp_ch[i]!= ','){
            day[k] = Inp_ch[i];
            i++;
            k++;
        }

        i = i+2;
        int day_ru = Integer.parseInt(String.valueOf(day));

        // 연도 배열에 값 저장
        
        k = 0;
        while(Inp_ch[i] != ' '){
            year[k] = Inp_ch[i];
            i++;
            k++;
        }
        i++;
        int year_ru = Integer.parseInt(String.valueOf(year));

        // 시간 배열에 값 저장

        k=0;
        while(Inp_ch[i] != ':'){
            hour[k] = Inp_ch[i];
            i++;
            k++;
        }

        i++;
        int hour_ru = Integer.parseInt(String.valueOf(hour));

        // 분 배열에 값 저장
   
        k = 0;
        while(k != 2){
            min[k] = Inp_ch[i];
            i++;
            k++;
        }
        int min_ru = Integer.parseInt(String.valueOf(min));

        // 윤년 판단  후 분으로 변경

        int res = 0;
        int res_R = 0;
      

        if((year_ru % 400 == 0)||((year_ru%4 == 0) && (year_ru % 100 != 0))){
            res = ((7 * 31) + (4 * 30) + (1 * 29))*24*60; 
            for(int x = 1; x < Month_ru; x++){
                if((x==1)||(x==3)||(x==5)||(x==7)||(x==8)||(x==10)||(x==12)){
                    res_R += 31 * 24 * 60;
                }else if((x==4)||(x==6)||(x==9)||(x==11)){
                    res_R += 30 * 24 * 60;
                }else{
                    res_R += 29 * 24 * 60;
                }
            }
        } else{
            res = ((7 * 31) + (4 * 30) + (1 * 28))*24*60; 
            for(int x = 1; x < Month_ru; x++){
                if((x==1)||(x==3)||(x==5)||(x==7)||(x==8)||(x==10)||(x==12)){
                    res_R += 31 * 24 * 60;
                }else if((x==4)||(x==6)||(x==9)||(x==11)){
                    res_R += 30 * 24 * 60;
                }else{
                    res_R += 28 * 24 * 60;
                }
            }
        }
        res_R += (day_ru - 1) * 24 * 60;
        res_R += hour_ru * 60 + min_ru;
 
        // 결론
        System.out.println((res_R/(double)res)*100);

        
        sc.close();
    }
    
}
