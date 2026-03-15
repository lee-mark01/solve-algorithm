import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        int[] ar = new int[26];
        int len = name.length();

        for (int i = 0; i < len; i++){
            ar[name.charAt(i) - 'A']++;
        }

        int oddCount = 0;
        char mid = ' ';

        for (int i = 0; i < 26; i++){
            if (ar[i] % 2 == 1){
                oddCount++;
                mid = (char)(i + 'A');
            }
        }

        if ((len % 2 == 0 && oddCount > 0) || (len % 2 == 1 && oddCount != 1)){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder left = new StringBuilder();

        for (int i = 0; i < 26; i++){
            for (int j = 0; j < ar[i] / 2; j++){
                left.append((char)(i + 'A'));
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append(left);

        if (mid != ' '){
            answer.append(mid);
        }

        answer.append(new StringBuilder(left).reverse());

        System.out.println(answer);
    }
}