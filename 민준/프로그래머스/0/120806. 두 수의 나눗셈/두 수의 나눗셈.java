class Solution {
    public int solution(int num1, int num2) {
        double result = (double) num1 / num2;
        result = result * 1000;
        return (int) result;
    }
}