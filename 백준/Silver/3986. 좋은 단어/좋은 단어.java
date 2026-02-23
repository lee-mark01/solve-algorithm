import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++){
            String name = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < name.length(); j++){
                char c = name.charAt(j);

                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
            if (stack.isEmpty()){
                count += 1;
            }
        }
        pw.println(count);
        br.close();
        pw.close();
    }
}
