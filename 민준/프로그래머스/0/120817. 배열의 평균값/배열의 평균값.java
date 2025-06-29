class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int size = numbers.length;
        
        for(int i = 0; i < size; i++) {
            answer += numbers[i];
        }
        
        return  (double) answer/size;
    }
}