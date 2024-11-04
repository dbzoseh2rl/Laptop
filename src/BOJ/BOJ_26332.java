package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_26332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int total = c * d - (c - 1) * 2;

            bw.write(c + " " + d + "\n");
            bw.write(total + "\n");
        }
        bw.flush();
        bw.close();
    }
}
