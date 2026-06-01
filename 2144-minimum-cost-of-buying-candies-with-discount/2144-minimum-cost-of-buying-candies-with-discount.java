class Solution {
    public int minimumCost(int[] cost) {
        int ans=0;
        int c=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            c++;
            if(c==3){
                c=0;
                continue;
            }
            ans+=cost[i];
        }return ans;
    }
}