package BOJ;

import java.util.Scanner;

public class BOJ_17944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int cnt = 0;
        int x = 1;

        for (int i = 0; i < T; i++) {
            cnt += x;
            if (cnt == 2 * N) {
                x = -1;
            }
            if (cnt == 1) {
                x = 1;
            }
        }

        System.out.println(cnt);
    }
}
