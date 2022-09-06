// 10845번 큐

import java.util.*;
import java.io.*;

public class Solve220906 {
    
    static int[] que = new int[10000];
    static int size = 0;
    static int rear = -1;
    static int front = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
                }
                System.out.println(sb);
            }
        }

        public static void push(int num) {
            rear++;
            que[rear] = num;
            size++;
        }

        public static int pop() {
            if(size == 0){
                return -1;
            }else {
                int P = que[front];
                que[front] = 0;
                front++;
                size--;
                return P;
            }
        }

        public static int size() {
            return size;
        }

        public static int empty() {
            if(size == 0){
                return 1;
            }else {
                return 0;
            }
        }

        public static int front() {
            if(size == 0){
                return -1;
            }else {
                return que[front];
            }
        }

        public static int back() {
            if(size == 0){
                return -1;
            }else {
                return que[rear];
            }
        }
    }