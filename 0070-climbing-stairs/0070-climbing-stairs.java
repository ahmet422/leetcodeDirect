class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int one = 1, two = 2;
        int sum = 0;
        for(int i = 3; i <= n; i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
    
    
}