/*
맨 밑 원판을 3번째 장대로 옮기는 게 최우선 목표
1. 그래서 먼저 위 n-1개의 원판을 1-> 2번째 장대로 옮겨야함
    근데 이게 또 1,2,3 방식과 같아짐. 맨 밑 원판을 2번째 장대로 옮기는 게 최우선 목표
2. 그리고 맨 밑 원판을 1->3번째 장대로 옮기기
3. 그리고 n-1개의 원판을 2->3번째 장대로 옮겨야함.
    이것도 또 1,2,3 방식과 같아짐. 맨 밑 원판을 3번재 장대로 옮기는 게 최우선 목표
즉, hanoi 문제는 재귀 문제로 풀 수 있고,
n개를 어디에서 어디로, 어디를 거쳐서 옮길지를 함수화하고, 재사용하면 된다.

base condition은 n이 1일 때 return 1;

이동횟수는 2^(n)-1
*/

import java.io.*;
import java.util.*;

public class Main{
    public static void hanoi(int n, int from, int via, int to, PrintWriter pw){
        if (n==1){
            pw.println(from+" "+to);
            return;
        }
        hanoi(n-1, from, to, via, pw);
        pw.println(from +" "+to);
        hanoi(n-1, via, from, to, pw);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        pw.println((1L << n) - 1); // 2의 거듭제곱은 비트쉬프트
        hanoi(n,1,2,3,pw);
        br.close();
        pw.close();
    }
}