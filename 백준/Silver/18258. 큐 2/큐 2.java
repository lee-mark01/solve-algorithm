import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] q = new int[N]; // push 최대 N번이므로 N이면 충분
        int head = 0;         // 맨 앞 원소 위치
        int tail = 0;         // 다음에 넣을 위치 (마지막 원소 다음칸)
        int size = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                q[tail] = x;
                tail++;
                size++;
            } else if (cmd.equals("pop")) {
                if (size == 0) sb.append(-1).append('\n');
                else {
                    sb.append(q[head]).append('\n');
                    head++;
                    size--;
                }
            } else if (cmd.equals("size")) {
                sb.append(size).append('\n');
            } else if (cmd.equals("empty")) {
                sb.append(size == 0 ? 1 : 0).append('\n');
            } else if (cmd.equals("front")) {
                sb.append(size == 0 ? -1 : q[head]).append('\n');
            } else if (cmd.equals("back")) {
                sb.append(size == 0 ? -1 : q[tail - 1]).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}