//백준 2438번 별찍기 

#include <stdio.h>

int main() {
	int T ;
	scanf("%d",&T);

    for(int i = 1;i<T+1;i++){
        for(int j =0; j<i; j++){
        printf("*");}
        printf("\n");
    }

	return 0;
}