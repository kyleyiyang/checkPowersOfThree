class Solution {
    public boolean checkPowersOfThree(int n) {
        if (n==0) return true;
        return checkPowersOfThree(n/3) && (n%3==0 || (n-1)%3==0);
    }
}
