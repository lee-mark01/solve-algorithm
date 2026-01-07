/*
1. for 문으로 풀기
n!이니깐, n을 받고, n>0 일 때까지 n을 줄여나가며 곱하면 될 것 같다.

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int result = 1;
        for (int n = Integer.parseInt(br.readLine()); n>0; n--){
            result *= n;
        }
        pw.println(result);
        br.close();
        pw.close();
    }
}
*/

// 2. 재귀함수로 풀기
import java.io.*;
import java.util.*;

public class Main{
    
    public static long factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        pw.println(factorial(n));
        br.close();
        pw.close();
    }
}
