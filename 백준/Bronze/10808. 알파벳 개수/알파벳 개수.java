// 문자마다 아스키 코드로 변환한 후에 65를 뺀 게 인덱스네. 그 인덱스 값을 +1
// 문자열에서 문자 하나씩 떼어와서
// 아스키 코드로 변환하는 법? int로 형변환

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int[] ar = new int[26];
        for (int i = 0; i < name.length(); i++){
            char a = name.charAt(i);
            int idx = a;
            ar[idx-97] += 1;
        }
        
        for (int i = 0; i < 26; i++){
            sb.append(ar[i] + " ");
        }
        pw.println(sb);
        br.close();
        pw.close();
    }
}