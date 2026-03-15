import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] lefts = new int[n];
        int[] rights = new int[n];
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            lefts[i] = l;
            rights[i] = r;

            set.add(l);
            set.add(r + 1);
        }

        Integer[] sorted = set.toArray(new Integer[0]);
        int[] wall = new int[sorted.length - 1];

        int val = 1;
        for (int i = 0; i < n; i++) {
            int li = Arrays.binarySearch(sorted, lefts[i]);
            int ri = Arrays.binarySearch(sorted, rights[i] + 1);

            for (int x = li; x < ri; x++){
                wall[x] = val;
            }
            val++;
        }

        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < wall.length; i++) {
            if (wall[i] != 0) {
                a.add(wall[i]);
            }
        }

        pw.println(a.size());
        pw.close();
        br.close();
    }
}