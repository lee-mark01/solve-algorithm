import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        String a = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++){
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                list1.add(str1.substring(i, i + 2));
            }
        }   
        
        for (int i = 0; i < str2.length() - 1; i++){
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i + 1);
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                list2.add(str2.substring(i, i + 2));
            }
        }     
        
        int guo = 0;
        int hab = 0;

        List<String> temp = new ArrayList<>(list2);
        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < temp.size(); j++){
                if (list1.get(i).equals(temp.get(j))){
                    guo++;
                    temp.remove(j);
                    break;
                }
            }
        }
        
        hab = list1.size() + list2.size() - guo;
        if (hab == 0) {
            return 65536;
        }
        int answer = (int) (((double)guo / hab) * 65536);
        return answer;
    }
}

/*
저거 쪼개는 거 
*/