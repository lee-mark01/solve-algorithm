from itertools import product

def solution(cost, hint):
    # 힌트 쓰냐마냐 튜플리스트
    cmin = float('inf') # 최소 비용
    
    for h in list(product([0, 1], repeat=len(hint))):
        
        n = len(cost)
        
        # 쓰면 해당 스테이지 힌트 개수 카운트하며 비용청구
        i = 0
        c = 0 # 모든 경우의 수의 비용
        hcount = [0] * len(cost) # hount는 어디 스테이지의 힌트가 몇개 있는지 저장
        hintdummylen = len(hint[i])
        for a in h:
            if a == 1:
                c += hint[i][0]
                for d in range(1, hintdummylen):
                    hcount[hint[i][d]-1] += 1
            i += 1

        # 힌트 개수를 반영하여 cost 계산
        for k in range(len(cost)):
            c += cost[k][min(hcount[k], n-1)]
        # i에 쓸 수 있는 힌트의 개수만큼 2차를 늘려야함
        # 배열에 인덱스에 해당하는 개수를 늘려서 저장하자
        cmin = min(c, cmin)
    return cmin