class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > height){
                count++;
            }
        }
        return count;
    }
}

// 정렬하고 인덱스를 출력할 수도 있겠지만, 그냥 비교해서 count 셀게