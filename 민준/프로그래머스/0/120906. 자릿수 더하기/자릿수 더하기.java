class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;  // 현재 일의 자리 숫자를 더함
            n /= 10;        // 10으로 나누어 다음 자리로 이동
        }
        return answer;
    }
}