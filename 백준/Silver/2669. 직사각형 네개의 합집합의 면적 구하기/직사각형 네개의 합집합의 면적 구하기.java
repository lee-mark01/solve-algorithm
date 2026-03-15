import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        boolean[][] arr = new boolean[100][100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        
        for (int i=0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken(" "));
            int y1 = Integer.parseInt(st.nextToken(" "));
            int x2 = Integer.parseInt(st.nextToken(" "));
            int y2 = Integer.parseInt(st.nextToken(" "));
            for (int x = x1; x < x2; x++){
                for (int y = y1; y < y2; y++){
                    arr[x][y] = true;
                }
            }
        }
        int count = 0;
        for (int i =0; i<100; i++){
            for (int j = 0; j<100; j++){
                if (arr[i][j]){
                    count++;
                }
            }
        }
        pw.println(count);
        br.close();
        pw.close();
    }
}
