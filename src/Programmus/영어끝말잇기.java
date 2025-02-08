package Programmus;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(n, words)));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            if(i != 0) {
                String s1 = words[i - 1]; // 이전
                String s2 = words[i]; // 현재

                char last = s1.charAt(s1.length() - 1); // 이전 단어의 마지막 철자
                char first = s2.charAt(0); // 현재 단어의 처음 철자

                if(map.containsKey(s2) || last != first) { // 단어가 중복이거나 철자가 이어지지 않는 경우
                    answer[0] = (i % n) + 1;  // 번호
                    answer[1] = (i / n) + 1;  // 차례

                    return answer;
                }
            }

            map.put(words[i], 1); // 사용한 단어 맵에 넣어두기
//            System.out.println(map);
        }


        return answer;
    }



}
