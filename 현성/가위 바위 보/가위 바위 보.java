class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.substring(i,i+1).equals("2")){
                answer += "0";
            } else if(rsp.substring(i,i + 1).equals("0")){
                answer += "5";
            } else{
                answer += "2";
            }
        }
        
        return answer;
    }
}