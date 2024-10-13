import java.time.LocalDate;

class Solution {
    public int solution(int age) {
    int currentYear = LocalDate.now().getYear();
    int birthYear = currentYear - age;
    return birthYear - 1;
    }
}