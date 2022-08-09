package algorithm;
import java.util.*;

public class Sovle220810 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 받을 배열 수 입력
        int N = sc.nextInt();
        sc.nextLine();

        // 그 수 기준으로 배열 생성
        int[][] A = new int[N][10];

        // 배열에 값 입력 받음
        for(int i=0; i<N; i++){
            for(int j=0; j<10; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        // 버블 정렬, 크기 순 정렬함
        for(int n=0; n< N; n++){
        for(int i=0;i<10-1;i++) {
            for(int j=0;j<10-1-i;j++){
                if(A[n][j]<A[n][j+1]) {
                    int tmp=A[n][j];    
                    A[n][j]=A[n][j+1];
                    A[n][j+1]=tmp;
                }    
            }}}

        // 3번째로 큰 크기 수 각각 출력
        for(int k=0; k<N; k++){
            System.out.println(A[k][2]);
        }

        sc.close();

}}
