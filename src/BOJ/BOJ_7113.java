package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_7113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        /*int cnt = 0;*/
        int cnt = m - n + 1;
/*        for (int i = n; i <= m; i++) {
                cnt+=1;
        }*/

        /*bw.write(cnt); // 그냥 하면 str로 안잡힘 이유가 뭐지..?*/
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
