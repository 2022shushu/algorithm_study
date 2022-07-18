//백준 11022번 A+B - 8

#include <stdio.h>

int main() {
	int T,a,b ;
	scanf("%d",&T);
  int numT[T] , numA[T], numB[T];
    for(int i = 0;i <T;i++){
        scanf("%d %d",&a,&b);
        numT[i] = a + b;
        numA[i] = a;
        numB[i] = b;
    }
  for(int i = 0;i <T;i++){
        printf("Case #%d: %d + %d = %d\n",i+1,numA[i],numB[i],numT[i]);
    }
	return 0;
}