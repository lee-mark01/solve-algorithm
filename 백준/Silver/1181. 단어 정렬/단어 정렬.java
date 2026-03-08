import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++){
            hs.add(br.readLine());
        }

        ArrayList<String> al = new ArrayList<>(hs);

        Collections.sort(al, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if (a.length() != b.length()){
                    return a.length() - b.length(); // 문자열 비교
                }
                return a.compareTo(b); // 사전 순 비교
            }
        });

        for (int i = 0; i < al.size(); i++){
            pw.println(al.get(i));
        }
        br.close();
        pw.close();
    }
}