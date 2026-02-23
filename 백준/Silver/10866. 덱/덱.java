import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                dq.offerFirst(x);
            }
            else if (command.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                dq.offerLast(x);
            }
            else if (command.equals("pop_front")){
                pw.println(dq.isEmpty() ? -1 : dq.pollFirst());
            }
            else if (command.equals("pop_back")){
                pw.println(dq.isEmpty() ? -1 : dq.pollLast());
            }
            else if (command.equals("size")){
                pw.println(dq.size());
            }
            else if (command.equals("empty")){
                pw.println(dq.isEmpty()? 1:0);
            }
            else if (command.equals("front")){
                pw.println(dq.isEmpty() ? -1 : dq.peekFirst());
            }
            else if (command.equals("back")){
                pw.println(dq.isEmpty() ? -1 : dq.peekLast());
            }
        }
        br.close();
        pw.close();
    }
}