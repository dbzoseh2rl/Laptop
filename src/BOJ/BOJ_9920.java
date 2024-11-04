package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_9920 {
    public static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.deepToString(map));
//        System.out.println(func(0,0,n));
        System.out.println(func(0, 0, n).length());
    }

    public static String func(int y, int x, int size) {
        if (size == 0) {
            return "";
        }

        int sum = 0;
        int half = size / 2;

        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                sum += map[i][j];
            }
        }

        if (sum == 0) {
            return "00";
        } else if (sum == size * size) {
            return "01";
        } else {
            return "1" +
                    func(y, x, half) +
                    func(y, x + half, half) +
                    func(y + half, x, half) +
                    func(y + half, x + half, half);
        }
    }
}
