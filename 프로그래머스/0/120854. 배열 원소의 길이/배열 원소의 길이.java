class Solution {
    public int[] solution(String[] strlist) {
        String word = "";
        int listlength = strlist.length;
        int[] answer = new int[listlength];
        for (int i = 0; i < strlist.length; i++){
            word = strlist[i];
            answer[i] = word.length();
        }
        return answer;
    }
}