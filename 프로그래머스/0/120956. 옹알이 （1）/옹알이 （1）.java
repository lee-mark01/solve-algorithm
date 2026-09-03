class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++){
            String word = babbling[i];
            int index = 0;
            boolean success = true;
            while (index < word.length()){
                if (word.startsWith("aya", index)){
                    index += 3;
                } 
                else if (word.startsWith("ye", index)){
                    index += 2;
                } 
                else if (word.startsWith("woo", index)){
                    index += 3;
                }
                else if (word.startsWith("ma", index)){
                    index += 2;
                }
                else {
                    success = false;
                    break;
                }
            }
            if (success){
                    answer++;
                } 
        }
        return answer;
    }
}

/* 
문자열 비교인거고 배열에 있는 단어에서, 5개 단어를 합쳐서 만들 수 있는 단어면 된다. 문자열의 비교.. 어떻게 하지? 빼? 

자바의 문자열 처리법을 모름.
문자열에서 문자열을 빼서 전부 없어지면 만들 수 있는 단어고, 전부 안없어지면 못만드는 거.

힌트를 보자. 아 자바에서는 String 문자열 일부를 바꿀 때 replace(a,b) 메서드를 쓴다. 

그럼 replace("aya","")
replace("ye","")
replace("woo","")
replace("ma","")
이렇게 하고 empty이면 count++
아니면 넘어가.
이런 식으로 하는 건가? 해볼까?

아 String은 원본이 안바뀐대. 그래서 새로 재할당해줘야함
word = word.replace("aya", "")이런 식으로

아 근데 틀림. 이게 시작: wyeoo
aya 후: wyeoo
ye 후: woo
woo 후: 
woo 후: 

이거같은 경우 중간 ye하면 woo가 남고 woo 없어지면 2개가 됨.
근데 사실 순서가 보장되어야함. 

이제 모르겠으니깐 ai 한테 또 물어본다. 
ai는 인덱스를 0부터 시작해서, 해당되는 게 있으면 인덱스를 그만큼 올리고, 올린 곳부터 다시 해당되는 게 있는지 탐색하란다.
트래킹해서 맨 끝으로 가면 카운트를 ++ 하라고 한다.

중간에 한번의 탐색도 안걸리는 루프에서는 success가 false로 찍히며 break된다.
*/