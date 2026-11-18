n, L = map(int, input().split())
sidewalk = [list(map(int, input().split())) for _ in range(n)]

def walkable(line):
    used = [False] * n                      # 경사로 놓은 칸 기록
    for i in range(n - 1):
        if line[i] == line[i+1]:
            continue
        elif abs(line[i] - line[i+1]) > 1:  # 2 이상 차이
            return False

        elif line[i] - line[i+1] == 1:      # 내리막: i+1 ~ i+L에 설치
            if i + L > n - 1:
                return False
            for j in range(L):
                if line[i+1+j] != line[i+1] or used[i+1+j]:
                    return False
            for j in range(L):
                used[i+1+j] = True

        else:                               # 오르막: i ~ i-L+1에 설치
            if i - L + 1 < 0:
                return False
            for j in range(L):
                if line[i-j] != line[i] or used[i-j]:
                    return False
            for j in range(L):
                used[i-j] = True
    return True

count = 0
for row in sidewalk:
    if walkable(row):
        count += 1
for j in range(n):
    column = [sidewalk[i][j] for i in range(n)]
    if walkable(column):
        count += 1
print(count)