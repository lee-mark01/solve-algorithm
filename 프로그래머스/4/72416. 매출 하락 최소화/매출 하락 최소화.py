import sys
sys.setrecursionlimit(10**6)
from collections import defaultdict

def solution(sales, links):
    # 팀장 번호 → 팀원 번호 리스트
    children = defaultdict(list)
    for a, b in links:
        children[a].append(b)

    # v를 기준으로 (v가 갈 때 최소 비용, v가 안 갈 때 최소 비용) 메모를 돌려줌
    def dfs(v):
        # 팀원이 없으면: 가면 자기 매출, 안 가면 0
        if not children[v]:
            return sales[v - 1], 0

        on = sales[v - 1]          # v가 감 → 자기 매출부터
        off = 0                    # v가 안 감
        extra = float('inf')       # 팀원 한 명을 '가는 쪽'으로 바꿀 때 추가 비용의 최솟값

        for c in children[v]:
            c_on, c_off = dfs(c)           # 팀원 메모 먼저 (후위 순회)
            on += min(c_on, c_off)         # v가 가면 팀원은 싼 쪽 선택
            off += min(c_on, c_off)        # v가 안 가도 일단 싼 쪽 선택
            extra = min(extra, c_on - c_off)

        # v가 안 가는데 팀원도 아무도 안 갔다면, 제일 싼 팀원 한 명을 보냄
        if extra > 0:
            off += extra

        return on, off

    on, off = dfs(1)
    return min(on, off)