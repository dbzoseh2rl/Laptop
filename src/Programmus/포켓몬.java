package Programmus;

import java.util.HashSet;

public class 포켓몬 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int size = set.size();

        if(size >= len) {
            answer = len;
        } else {
            answer = size;
        }
        return answer;
    }
}
