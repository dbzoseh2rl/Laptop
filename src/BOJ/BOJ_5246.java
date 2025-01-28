package BOJ;

import java.util.Scanner;
import java.util.Arrays;


public class BOJ_5246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cntBoard = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cntBoard; i++) {
            String[] input = scanner.nextLine().split(" ");
            int cntPieces = Integer.parseInt(input[0]);

            int[] rows = new int[8];
            for (int j = 1; j <= cntPieces; j++) {
                int x = Integer.parseInt(input[2 * j - 1]);
                int y = Integer.parseInt(input[2 * j]);

                rows[y - 1]++;
            }

            int maxPieces = Arrays.stream(rows).max().getAsInt();
            System.out.println(maxPieces);
        }

        scanner.close();
    }
}
