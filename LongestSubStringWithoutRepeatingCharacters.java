class Solution {
    public  int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        else{
        int max_length = 1;
        int cur_length = 1;
        int prev;
        int[] visited = new int[256];
        for (int i =0; i <256; i++){
            visited[i] = -1;
        }
        visited[s.charAt(0)] = 0;
        for (int i = 1; i < s.length(); i ++){
            prev = visited[s.charAt(i)];
            if (prev== -1 || i - cur_length > prev){
                cur_length += 1;
            }
            else{
                if (cur_length > max_length)
                    max_length = cur_length;

                cur_length = i - prev;


            }
            visited[s.charAt(i)] = i;
        }
        if (cur_length > max_length){
            max_length = cur_length;
        }
        return max_length;
        }
    }
}