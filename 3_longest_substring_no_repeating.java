
class Solution{

    public int lengthOfLongestSubstring(String s){
        int max_length = 0;
        int n = s.length();

        int[] seen_word = new int[128];
        // j = iterator for the string
        // i = iterator for the substring that we are checking if a character is repeated i++
        for(int j = 0, i = 0; j < n; j++){
            i = Math.max(seen_word[s.charAt(j)], i);
            max_length = Math.max(max_length, j - i + 1);
            seen_word[s.charAt(j)] = j + 1;
            
            // System.out.println("i: " + i + " j: " + j + " ans: " + ans + " index: " + index[s.charAt(j)]+ " s : " + s.charAt(j));
        }



        return max_length;
    }
    public static void main(String args[]){
            Solution solution = new Solution();
            String s = "abcabcbb";
            System.out.println(solution.lengthOfLongestSubstring(s));
    }
}