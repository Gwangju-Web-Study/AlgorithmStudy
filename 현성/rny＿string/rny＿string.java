class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i = 0; i < rny_string.length(); i++){
            if(rny_string.substring(i, i+1).equals("m")){
                answer += "rn";
            }else {
                answer += rny_string.substring(i, i+1);
            }
        }
        
        return answer;
    }
}