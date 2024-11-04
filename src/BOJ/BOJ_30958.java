package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_30958 {
    public static void main(String[] args) throws IOException {
        // int랑 string 받기
        // 알파벳이랑 카운트수 리스트 만들기
        // 해당 알파벳당 카운트수 늘리기
        // max 카운트 출력 때리면됨
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();

        int[] alpha = new int[26];
        System.out.println(Arrays.toString(alpha));
        int[] cnt = new int [26];
        System.out.println(Arrays.toString(cnt));

        for(int i = 0; i < alpha.length; i++) {
            alpha[i] = 97 + i;
            cnt[i] = 0;
        }
        // alpha  = [97~ 122]
        //System.out.println(Arrays.toString(alpha));
        for (int i = 0; i < a.length(); i++) {

        }

    }
}
