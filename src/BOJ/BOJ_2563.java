package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean arr[][] = new boolean[101][101];

        int sum = 0;
        int n = Integer.parseInt(br.readLine());

        for(int tc=0; tc<n; tc++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    if(!arr[x+j][y+i]) {
                        arr[x+j][y+i] = true;
                        sum += 1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
