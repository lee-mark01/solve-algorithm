import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(br.readLine());
        }

        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String[] aa = a.split(" ");
                String[] bb = b.split(" ");
                return Integer.parseInt(aa[0]) - Integer.parseInt(bb[0]);
            }
        });

        int time = 0;

        for (int i = 0; i < al.size(); i++) {
            StringTokenizer st = new StringTokenizer(al.get(i));
            int arrival = Integer.parseInt(st.nextToken());
            int check = Integer.parseInt(st.nextToken());

            if (time < arrival) {
                time = arrival;
            }

            time += check;
        }

        pw.println(time);

        br.close();
        pw.close();
    }
}