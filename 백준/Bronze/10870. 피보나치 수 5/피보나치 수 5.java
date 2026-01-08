/*
0
1
a[i] = a[i-2] + a[i-1]
i는 2부터 n까지. i++
피보나치는 빨리 크게 커지니깐 long
자바 배열 선언 구조는 long[] a = new long[n+1] (필요한 배열의 크기만큼)
*/

/*
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
*/

// 재귀함수로 문제를 풀기
/*
a[i-1]이랑 a[i-2]를 더한 값을 결과값으로 return 하는 함수.
*/

import java.io.*;
import java.util.*;

public class Main{
    public static long fibo(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);   
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        pw.println(fibo(n));
        br.close();
        pw.close();
    }
}
