import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 인덱스를 넣으면 이름이 출력되는 배열
        String[] nameById = new String[N+1];
        HashMap<String, Integer> idByname = new HashMap<>(N+1);

        // 이름을 넣으면 인덱스를 출력하는 해시맵
        for (int i = 1; i <= N; i++){
            String q = br.readLine();
            nameById[i] = q;
            idByname.put(q, i);
        }


        for (int i = 0; i < M; i++){
            String q = br.readLine();
            if (Character.isDigit(q.charAt(0))){
                int num = Integer.parseInt(q);
                pw.println(nameById[num]);
            }
            else {
                pw.println(idByname.get(q));
            }
        }

        br.close();
        pw.close();
    }
}