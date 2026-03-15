import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i <n; i++) {
            int m = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = 0; j < m; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String category = st.nextToken();

                map.put(category, map.getOrDefault(category, 0) + 1);
            }

            int result = 1;

            for (int count : map.values()){
                result *= (count + 1);
            }

            System.out.println(result - 1);
        }

        br.close();
    }
}