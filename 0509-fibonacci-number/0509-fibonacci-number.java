class Solution {
    public int fib(int n) {
        return (int)((1/Math.sqrt(5))*(Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n)));
    }
}