class Solution {
    public int climbStairs(int n) {
        int earlier = 1;
        int latter = 1;

        for (int m = n-1 ; m>0; m--){
        int temp = earlier;
        earlier += latter;
        latter = temp;
        }

        return earlier;
    }
}
