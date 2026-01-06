import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken(" "));
        int b = Integer.parseInt(st.nextToken(" "));
		pw.println(a+b);
		br.close();
		pw.close();
	}
}