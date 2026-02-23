import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> hs = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++){
            String sentence = br.readLine();
            hs.add(sentence);
        }
        
        int count = 0;
        for (int i = 0; i < m; i++){
            String sentence = br.readLine();
            if (hs.contains(sentence)){
                count += 1;
            };
        }
        pw.println(count);
        br.close();
        pw.close();
        
    }
}