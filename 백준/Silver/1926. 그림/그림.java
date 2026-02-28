import java.util.*;
import java.io.*;

public class Main{
    static int n, m;
    static int[][] map;
    static boolean[][] chk;
    static int[] dy = {0,1,0,-1};
    static int[] dx = {1,0,-1,0};
    
    static int bfs(int y, int x){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{y,x});
        chk[y][x] = true;
        int area = 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int ey = cur[0];
            int ex = cur[1];
            
            for (int i = 0; i < 4; i++){
                int ny = ey + dy[i];
                int nx = ex + dx[i];
                
                if (ny >=0 && ny < n && nx >=0 && nx < m){
                    if(map[ny][nx] == 1 && !chk[ny][nx]){
                        area++;
                        chk[ny][nx] = true;
                        q.offer(new int[]{ny, nx});
                    }
                }
            }
        }
        return area;
    }
    
    
    
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        chk = new boolean[n][m];
        
        int count = 0;
        int maxArea = 0;
        
        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j<m; j++){
                if (map[i][j] == 1 && !chk[i][j]){
                    count++;
                    int area = bfs(i,j);
                    maxArea = Math.max(maxArea, area);
                } 
            }
        }
        pw.println(count);
        pw.println(maxArea);
        
        br.close();
        pw.close();
    }
}