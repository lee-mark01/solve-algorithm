import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++){
            pw.println(String.format("%d * %d = %d", num, i, num*i));
        }
        br.close();
        pw.close();
    }
}