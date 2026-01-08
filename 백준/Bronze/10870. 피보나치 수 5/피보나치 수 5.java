/*
0
1
a[i] = a[i-2] + a[i-1]
i는 2부터 n까지.
i++
만약 4라면 i는 2부터 4까지
피보나치는 빨리 크게 커지니깐 long
자바 배열 선언 구조는 long[] a = new long[n+1]
*/

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n+1];
        a[0] = 0;
        if (n >= 1){
            a[1] = 1;
        for (int i = 2; i <= n; i++){
                a[i] = a[i-2] + a[i-1];
            }
        }
        pw.println(a[n]);
        br.close();
        pw.close();
    }
}