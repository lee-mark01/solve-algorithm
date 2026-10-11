import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        Map<String, Integer> inMap = new HashMap<>(); // IN 상태의 차량번호와 시간을 저장하는 공간.
        Map<String, Integer> totalMap = new TreeMap<>(); // OUT된 차량번호와 누적 시간을 저장하는 공간. key (차량번호) 기준으로 정렬하기 위해서 TreeMap 사용.
        
        // 입/출차 내역을 순회
        for (int i = 0; i < records.length; i++){
            String[] info = records[i].split(" "); // 기록을 띄어쓰기 기준으로 시각, 차량번호, 내역을 쪼개서 인덱스 0,1,2인 String 배열에 저장 
            
            String[] timeInfo = info[0].split(":"); // 시각을 : 기준으로 시와 분으로 쪼개서 인덱스 0, 1인 String 배열에 저장
            
            int hour = Integer.parseInt(timeInfo[0]); // "시" 문자열을 int형으로 변환
            int minute = Integer.parseInt(timeInfo[1]); // "분" 문자열을 int형으로 변환
            int time = hour * 60 + minute;  // 분단위로 저장
            
            String car = info[1];
            String state = info[2];
            
            // 상태가 IN이면 inMap에 저장
            if (state.equals("IN")){
                inMap.put(car, time);
            } else {
                /* 상태가 OUT이면
                inMap에서 time 가져와서 time을 빼서 totalMap에 누적
                inMap에서 제거
                */
                time -= inMap.get(car);
                totalMap.put(car, totalMap.getOrDefault(car,0) + time);
                inMap.remove(car);
            }
        }
        
        // out처리가 되지 않아 inMap에 남아있는 car들 계산
        for (Map.Entry<String, Integer> entry : inMap.entrySet()){
            String car = entry.getKey();
            int time = entry.getValue();
            time = 1439 - time;
            totalMap.put(car, totalMap.getOrDefault(car,0) + time);
        }
        
        // 요금을 계산해서 answer에 넣기
        int[] answer = new int[totalMap.size()];
        int i = 0;
        
        // 차량번호 순서대로 시간을 요금으로 변환
        for (int time : totalMap.values()){
                        
            if (time <= fees[0]){
                // 기본 시간보다 작으면 기본요금
                answer[i] = fees[1];
            } else {
                // 기본 시간보다 크면 아래와 같이 계산
                answer[i] = fees[1] + fees[3] * ( (int) Math.ceil( (double) (time - fees[0]) / fees[2]) );
            }
            i++;
        }
        
        return answer;
    }
}

/*
우선 문자열을 공백 기준으로 split해야할 것 같습니다.

받으면 앞 5자, 중간 4자, 뒤 2~3자로 쪼갤 필요가 있다는 것? 그리고 In하고 out 하면 뭔가 큐 느낌이 났지만, 그건 그냥 느낌이고, 차량번호로 시간을 빠르게 조회해야한다는 생각에 맵이 생각났습니다. 그리고 out될 떄 결과값을 저장하는 map 도 있어야할 것 같습니다.

그래서 In이면 inMap에 차량번호와 입차 시간을 저장하고,
out이면 inMap에서 해당 차량 입차 시간을 찾고,
out - in을 계산해서 totalMap에 누적하고,
inMap에서 제거합니다.

그리고 모든 기록을 다 처리했는데 inMap에 남아있는 차들은 23:59 - in으로 계산합니다.

시간은 시간 x 60 + 분으로 변환합니다. 
그리고 차량번호 순서대로 정렬해서 result를 내보내면 될 것 같습니다.
*/