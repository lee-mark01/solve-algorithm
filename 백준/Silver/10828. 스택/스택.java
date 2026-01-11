import java.util.*;
import java.io.*;

public class Main{
    static int[] stack;
    static int top = -1;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        for (int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            if (com.equals("push")){
                int new_val = Integer.parseInt(st.nextToken());
                push(new_val);
            }else if (com.equals("pop")){
                pw.println(pop());
            }else if (com.equals("size")){
                pw.println(size());
            }else if (com.equals("empty")){
                pw.println(empty());
            }else if (com.equals("top")){
                pw.println(peek());
            } 
        }
        br.close();
        pw.close();
    }
    
    public static void push(int new_val){
        top++;
        stack[top] = new_val;
    }
    
    public static int pop(){
        if (top == -1) return -1;
        return stack[top--];
    }
    
    public static int size(){
        return (top + 1);
    }
    
    public static int empty(){
        if (top == -1) {
            return 1;
        }else return 0;
    }
    public static int peek(){
        if (top == -1) return -1;
        return stack[top];
    }
}
