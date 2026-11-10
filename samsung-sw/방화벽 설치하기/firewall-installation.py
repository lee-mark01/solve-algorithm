# todo: 각 상황마다 2의 상하좌우를 보고 갈 수 있는 곳을 bfs? 해서 2로 바꾼 후에 2중 for문 돌아서 0인 거 count에 담기
# 상하좌우를 탐색해야하니깐 그 좌표를 만드는 거.

# 상하좌우 좌표
dxdy = [(0, 1), (0, -1), (-1, 0), (1, 0)]

def spread(cpgrid, fires):
    cpfires = [row[:] for row in fires]
    cp2grid = [row[:] for row in cpgrid]
    while (cpfires):
        fire = cpfires.pop(0)
        x = fire[0]
        y = fire[1]
        for dx, dy in dxdy:
            if x+dx >= 0 and x+dx < n and y+dy >=0 and y+dy < m:
                if cp2grid[x+dx][y+dy] == 0:
                    cp2grid[x+dx][y+dy] = 2
                    cpfires.append([x+dx, y+dy])
    count = 0
    for i in range(n):
        for j in range(m):
            if cp2grid[i][j] == 0:
                count += 1
    return count

# 입력받기
n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# 0인 좌표, 2인 좌표 저장
empties = []
fires = []
for i in range(n):
    for j in range(m):
        if grid[i][j] == 0:
            empties.append([i,j])
        if grid[i][j] == 2:
            fires.append([i,j])

answer = 0;
# 0인 좌표 중 3개를 고름
for i in range(len(empties)):
    for j in range(i+1, len(empties)):
        for k in range(j+1, len(empties)):
            cpgrid = [row[:] for row in grid]
            cpgrid[empties[i][0]][empties[i][1]] = 1
            cpgrid[empties[j][0]][empties[j][1]] = 1
            cpgrid[empties[k][0]][empties[k][1]] = 1
            answer = max(spread(cpgrid, fires), answer)
print(answer)
            

            
    


