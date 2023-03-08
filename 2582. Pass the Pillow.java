class Solution {
    public int passThePillow(int n, int time) {
        time=time%(2*n-2);
        return n-Math.abs(n-1-time);
    }
}