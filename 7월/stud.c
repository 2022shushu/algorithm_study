// 백준 1단계 2557번 Hello World! 출력

console.log("Hello World!");

// 백준 1단계 10718번 강한친구 대한육군 두 번 출력

console.log("강한친구 대한육군");
console.log("강한친구 대한육군");

// 백준 1단계 10171번 고양이 출력

console.log("\\    /\\");
console.log(" )  ( ')");
console.log("(  /  )");
console.log(" \\(__)|");

// 백준 1단계 10172번 개 출력
console.log("|\\_/|");
console.log("|q p|   /}");
console.log('( 0 )"""\\');
console.log('|"^"`    |');
console.log("||_/=\\\\__|");

// 백준 1단계 1000번 A+B 출력
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  input = line.split(" ").map((el) => parseInt(el));
  rl.close();
});

rl.on("close", function () {
  let A = input[0];
  let B = input[1];
  console.log(A + B);
});

// 백준 1단계 1001번 A - B 출력

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  input = line.split(" ").map((el) => parseInt(el));
  rl.close();
});

rl.on("close", function () {
  let A = input[0];
  let B = input[1];
  console.log(A - B);
});

// 백준 1단계 10998번 A * B 출력

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  input = line.split(" ").map((el) => parseInt(el));
  rl.close();
});

rl.on("close", function () {
  let A = input[0];
  let B = input[1];
  console.log(A * B);
});

// 백준 1단계 1008번 A / B 출력

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  input = line.split(" ").map((el) => parseInt(el));
  rl.close();
});

rl.on("close", function () {
  let A = input[0];
  let B = input[1];
  console.log(A / B);
});

// 백준 1단계 10869번 사칙연산

#include <stdio.h>

int main() {
	int A,B ;
	scanf("%d %d",&A,&B);
	printf("%d\n",A+B);
    printf("%d\n",A-B);
    printf("%d\n",A*B);
    printf("%d\n",A/B);
    printf("%d",A%B);
	return 0;
}

// 백준 1단계 10928번 ??!

#include <stdio.h>

int main() {
	char A[50] ;
	scanf("%s",&A);
	printf("%s??!",A);
	return 0;
}

// 백준 1단계 18108번 불기 연도

int main() {
	int a;
    int b;
	scanf("%d",&a);
    b = a - 543;
	printf("%d",b);
	return 0;
}

// 백준 1단계 10430번 나머지

#include <stdio.h>

int main(){
    int A,B,C;
    scanf("%d %d %d",&A,&B,&C);
    printf("%d\n",(A+B)%C);
    printf("%d\n",((A%C)+(B%C))%C);
    printf("%d\n",(A*B)%C);
    printf("%d",((A%C)*(B%C))%C);
    return 0;
}

// 백준 1단계 2588번 곱셈
#include <stdio.h>

int main() {
    int A, B;
    int C, D, E, F;
    scanf("%d %d", &A, &B);
    C = A * (B % 10);
    printf("%d\n", C);
    D = A * (((B % 100) - (B % 10)) / 10);
    printf("%d\n", D);
    E = A * ((B - (B % 10)) / 100);
    printf("%d\n", E);
    F = A * B;
    printf("%d", F);
    return 0;
}

// 백준 1단계 25083번 새싹

int main() {
    
  printf("         ,r\'\"7\n");
  printf("r`-_   ,\'  ,/\n");
  printf(" \\. \". L_r\'\n");
  printf("   `~\\/\n");
  printf("      |\n");
  printf("      |");
  return 0;
}
