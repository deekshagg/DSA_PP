class l_70 {
    public int climbStairs(int n) {
        int m[] = new int[n+1];
        int ans = record(n, m);
        return ans;
    }
    static int record(int n , int[] m){
        if(n<=1)
            return 1;
        if(m[n]>0)
            return m[n];
        int o1 = record(n-1,m);
        int o2 = record(n-2,m);
        m[n] = o1 + o2;
        return m[n];
    }
}