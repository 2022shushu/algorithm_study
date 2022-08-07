//2822번

package algorithm; // 폴더
import java.util.*; // Scanner 클래스 사용

public class Solve220808 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        int[] A = new int[8]; // 값 받을 배열 생성
        int[] B = new int[8]; // 그 배열의 순서 저장 배열 생성

        for(int i=0; i<8;i++){
            A[i] = sc.nextInt(); // 값 입력
            B[i] = i + 1; // 순서 입력
        }

        for(int i = 1; i < 8; i++) {
            for(int j = 0; j < 8 - i; j++) {
                if(A[j] > A [j + 1]) {
					swap(A, j, j + 1); // 값 받은 배열 버블 정렬
                    swap(B, j, j + 1); // 순서 배열 버블 정렬
				}
			}
		}

        int sum = 0; // 총합 변수 초기화

        for(int k=7; k>2; k--){
            sum += A[k]; // 큰 수 5개로 총합 
        }

        int[] C = new int[5];
        for(int q=7 , w=0; q>2; q--, w++){
            C[w] = B[q]; // 순서 배열을 새 배열에 저장
        }

        for(int i=0;i<4;i++) {
            for(int j=0;j<4-i;j++){
                if(C[j]>C[j+1]) {
                    int tmp=C[j];    
                    C[j]=C[j+1];
                    C[j+1]=tmp; // 순서 다시 버블 정렬
                }    
            }
        }    

        System.out.println(sum); // 총합 출력
        System.out.println(C[0] + " " + C[1] + " " + C[2] + " " + C[3] + " " + C[4]); // 순서 출력


        

        sc.close();
    }

    private static void swap(int[] a, int i, int j) { // 버블 정렬 함수
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
