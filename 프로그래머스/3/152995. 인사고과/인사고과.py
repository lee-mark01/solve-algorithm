def solution(scores):
    people_num = len(scores)
    no_incentive = set() # 빈 셋은 이렇게 생성하는 구나
    
    # 인센티브 없는 사람 파악하기
    # for i in range(people_num):
    #     for j in range(people_num):
    #         if scores[i][0] < scores[j][0] and scores[i][1] < scores[j][1]:
    #             no_incentive.add(i)
    
    # 만약 여기서 첫번째 걸로 정렬하고 -> 1,2,2,3,3
    # 두번째 걸로 정렬하면 14 21 22 32 32
    # 일단 이건 아님. 
    # -> 이거 완탐 아니면 어케 풀지? ai야 도와줘. -> 아 정렬맞다네.
    indexed_scores = [(x,y,i) for i ,(x,y) in enumerate(scores)]
    sorted_people = sorted(indexed_scores, key=lambda x: (-x[0], x[1])) # 정렬...까먹어서 ai에게 물어봤습니다.
    max_score = sorted_people[0]
    for i in range(1, people_num):
        if max_score[1] > sorted_people[i][1]:
            no_incentive.add(sorted_people[i][2])
        else:
            max_score = sorted_people[i]
        
    
    # 두 점수의 합 구하기
    total = []
    for i in range(people_num):
        total.append(scores[i][0] + scores[i][1])
    
    # 완호가 인센티브 없으면 -1 return
    if 0 in no_incentive:
        return -1
    
    # 완호 등수 구하기
    wanhou_rank = 1; # 시작은 1등으로 가죠
    for i in range(1, people_num):
        # 완호보다 더 큰 사람 카운트 (인센티브 없는 사람은 넘어가기)
        wanhou = total[0]
        if i not in no_incentive:
            if wanhou < total[i]:
                wanhou_rank += 1
            
    return wanhou_rank

# 먼저 걸러내기. how? scores 길이만큼 완탐 2중 for 문 돌아서 첫번째 두번째가 모두 작은 게 있으면.. 어떻게 거르지? 일단 대기. 지금 생각나는 건 걔 빼고 복사 밖에 안떠오른다. 일단 set으로 번호를 기억해둘까? 뺄 번호를? 그리고 아래에서 셀 때 이 셋 안에 있는지 점검할까? 그렇게 가보자.

# 그리고 for문 한바퀴 돌면서 두 값을 저장하는 배열을 하나 만든다. 그리고 거기서 첫번째보다 큰 게 있으면 count 1부터 ++ 해서 1등에서 밀려나는 구조. 만약 2개가 더 크면 3등인 거지. 근데 거기서 빠지는 애 있으면 빼야해.

