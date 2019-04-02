class Solution {
    public  int climbStairs(int n) {
        int[] wayCount = new int[n + 1];
        for(int i = n; i >= 0;i--){
            wayCount[i] = findWay(n,i,wayCount);

        }
        return wayCount[0];
    }
    public int findWay(int last ,int n, int[] wayCount){
        int count = 0;
        if(n > last){
            return 0;
        }
        else if (n == last){
            return 1;
        }
        else{
            if(wayCount[n] > 0){
                return wayCount[n];
            }
            else{
                count += findWay(last,n+1,wayCount);
                count += findWay(last,n+2,wayCount);
                return count;


            }


        }
    }
}