import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int N = Integer.parseInt(br.readLine());
        
        HashSet<String> hs = new HashSet<>(N);
        
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            
            if (status.equals("enter")){
                hs.add(name);
            }
            else {
                hs.remove(name);
            }
        }
        
        // set을 list에 복사
        ArrayList<String> al = new ArrayList<>(hs);
        
        // list에서 역정렬
        Collections.sort(al , Collections.reverseOrder());

        // 반복문 출력      
        for (String name : al){
            pw.println(name);
        }
        
        br.close();
        pw.close();
    }
}