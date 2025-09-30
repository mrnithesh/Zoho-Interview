import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] inpt1 ={100,4,200,1,3,2};
        int[] inpt2 = {0,3,7,2,5,8,4,6,0,1};
        int[] inpt3 = {1,0,1,2};
        System.out.println("Answer: "+LCS(inpt1));
        System.out.println("Answer: " + LCS(inpt2));
        System.out.println("Answer: " +LCS(inpt3));
    }
    public static int LCS(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
