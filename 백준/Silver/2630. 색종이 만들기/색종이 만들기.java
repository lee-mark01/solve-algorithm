/*
1. 2차원 배열로 받는다
2. 재귀함수 (파라미터)
3. 종료조건
*/

import java.io.*;
import java.util.*;

public class Main{
    static int white = 0;
    static int blue = 0;
    public static void check(int x, int y, int size, int[][] paper){
        boolean same = true;
        int c = paper[x][y];
        for (int i = x; i <x + size; i++){
            for (int j = y; j < y + size; j++){
                if (paper[i][j] != c) {
                    same = false;
                    break;
                }
            }
        if (!same) {
                int half = size / 2;
                check(x,y,half,paper);
                check(x+half,y,half,paper);
                check(x, y+half,half, paper);
                check(x+half, y+half,half, paper);
                return;
        }
           
          
        }
        if (c == 0) white++;
        else blue++;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        
        int[][] paper = new int[n][n]; 
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check(0,0,n,paper);
        pw.println(white);
        pw.println(blue);
        br.close();
        pw.close();
    }
}