import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));      

        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            al.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(al);
        
        for (int i = 0; i<n; i++){
            pw.println(al.get(i));
        }

        br.close();
        pw.close();

    }

}