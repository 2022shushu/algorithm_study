// 백준 3단계 반복문 C언어 10950번 A+B -3

#include <stdio.h>

int main() {
	int T,a,b ;
	scanf("%d",&T);
  int numT[T];
    for(int i = 0;i <T;i++){
        scanf("%d %d",&a,&b);
        numT[i] = a + b;
    }
  for(int i = 0;i <T;i++){
        printf("%d\n",numT[i]);
    }
	return 0;
}