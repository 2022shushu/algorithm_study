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
        printf("Case #%d: %d\n",i+1,numT[i]);
    }
	return 0;
}