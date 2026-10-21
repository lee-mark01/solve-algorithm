n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
answer = 0
# Please write your code here.
# 시작점이 i, j 일 때 가로 일자, 세로 일자, ㄱ자를 구한다
for i in range(n):
    for j in range(m):
        # 가로 일자 구하기, 근데 범위를 벗어나지 않게
        # 기본적으로 j는 0부터 m-1까지 할당받음.
        # 여기선 j가 m-3까지만 가야함
        if j < m-2:
            answer = max(answer, grid[i][j]+grid[i][j+1]+grid[i][j+2])
        
        # 범위 벗어나지 않게 세로 일자 구하기
        # 기본적으로 i가 n-1까지 감.
        # 여기서는 i가 n-3까지만 가야함
        if i < n-2:
            answer = max(answer, grid[i][j]+grid[i+1][j]+grid[i+2][j])

        # 이제 ㄱ자. 한 점 i j 를 기준으로 r자는 4개가 가능함
        if (i < n-1 and j < m-1):
            answer = max(answer, grid[i][j]+grid[i+1][j]+grid[i][j+1])
            answer = max(answer,grid[i][j]+grid[i+1][j]+grid[i+1][j+1])
            answer = max(answer,grid[i][j]+grid[i][j+1]+grid[i+1][j+1])
            answer = max(answer,grid[i+1][j]+grid[i][j+1]+grid[i+1][j+1])

print(answer)