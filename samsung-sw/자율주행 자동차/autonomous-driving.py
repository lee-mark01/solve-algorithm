# 첫번째줄 세로, 가로 5,5
n, m = map(int, input().split())

# 두번째줄 x와 y와 방향 1,1,0
x, y, d = map(int, input().split())

# 격자 받기
road = [list(map(int, input().split())) for _ in range(n)]

# 출력: 방문한 도로의 총 면적. 북은 0, 동은 1, 남은 2, 서는 3
# 지금 예시는 처음 위치가 (2,1)에 방향이 0 그래서 2,1,0. 그럼 위치는 road[2][1].
# 방향이 북일 때 왼쪽이면 서잖아. 그럼 0->3->2->1->0 음.. (d+3)%4 이렇게 하면 될 것 같고
# 가는 곳은 1로 바꾸고, 만약 (d+3)%4 를 다 돌았는데 없으면 후진 그런데 밖을 나가면 끝.
# count 해야겠네.


count = 1
v = [[0]*m for _ in range(n)]
v[x][y] = 1

while (True):
    moved = False
    for k in range(4):
        d = (d+3)%4
        if (d == 0 and road[x-1][y] == 0 and v[x-1][y] == 0):
            v[x-1][y] = 1
            count += 1
            x -= 1
            moved = True
            break

        if (d == 1 and road[x][y+1] == 0 and v[x][y+1] == 0):
            v[x][y+1] = 1
            count += 1
            y += 1
            moved = True
            break

        if (d == 2 and road[x+1][y] == 0 and v[x+1][y] == 0):
            v[x+1][y] = 1
            count += 1
            x += 1
            moved = True
            break
        
        if (d == 3 and road[x][y-1] == 0 and v[x][y-1] == 0):
            v[x][y-1] = 1
            count += 1
            y -= 1
            moved = True
            break

    # 지금은 바로 직전으로 돌아가기만 하고, 이전의 이전으로 못돌아간다. 왔던 기록을 저장하는 곳이 필요하다. 베열로 왔던 방향의 반대방향을 저장해놓고 꺼낼까?
    # 왔던 곳을 되돌아가는 게 아니라 현재 방향의 뒤로 가는 것
    if moved == False:
        if (d == 0):
            x += 1
            if road[x][y] == 1:
                break
        elif (d == 3):
            y += 1
            if road[x][y] == 1:
                break
        elif (d == 2):
            x -= 1
            if road[x][y] == 1:
                break
        else:
            y -= 1
            if road[x][y] == 1:
                break
print(count)

# 근데 또 여기까지 하다보니깐 그냥 좌표 만들고 이동하는 게 나을 것 같기도. 왜냐하면 이거 x,y 이동해서 확인해야하잖아. 첫 방향만 파악하는 용도로 하고, 아 아닌가? 그냥 어짜피 if 조건문으로 해야해서 똑같나? 일단 해봐