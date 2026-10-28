n = int(input())
# 업무는 1부터 시작, 0번은 안 씀
t = [0] * (n + 1)
p = [0] * (n + 1)
for i in range(1, n + 1):
    t[i], p[i] = map(int, input().split())

# dp[i] = i번 외주를 마지막으로 했을 때의 최대 수익
dp = [0] * (n + 1)
answer = 0

for i in range(1, n + 1):
    # i번 외주가 휴가 안에 안 끝나면 아예 못 함
    if i + t[i] - 1 > n:
        continue

    dp[i] = p[i]                          # i번만 하는 경우
    for j in range(1, i):
        if i >= j + t[j]:                 # j번이 i일 전에 끝났으면
            dp[i] = max(dp[i], p[i] + dp[j])   # 원래 수익 p[i]에 j까지의 최대를 더함

    answer = max(answer, dp[i])

print(answer)