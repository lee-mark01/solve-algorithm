// 문자열로 받은 뒤, string parse 해서 비교 정렬 근데 그럼 Collections.sort(al, 에서 이 부분을 바꿔?)

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));      

        int n = Integer.parseInt(br.readLine());
        
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            al.add(br.readLine());
        }
        
        
        Collections.sort(al, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String [] aa = a.split(" ");
                String [] bb = b.split(" ");
                return Integer.parseInt(aa[0]) - Integer.parseInt(bb[0]);
            }
        });
        
        for (int i = 0; i<n; i++){
            pw.println(al.get(i));
        }

        br.close();
        pw.close();

    }

}