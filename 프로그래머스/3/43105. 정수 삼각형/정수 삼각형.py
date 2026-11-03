def solution(triangle):
    """
    밑에서 그리디하게
    즉, 전체 배열에서 마지막 꺼로 그 전꺼로 갱신하는 거지.
    triangle[4][0] 과 triangle[4][1]를 비교해서 큰 걸 triangle[3][0]에 갱신.
    triangle[4][1] 과 triangle[4][2]를 비교해서 큰 걸 triangle[3][1]에 갱신.
    triangle[4][j] 과 triangle[4][j+1]를 비교해서 큰 걸 triangle[3][j]에 갱신.
    j는 triangle[3]의 길이까지만.
    
    그걸 triangle의 크기 -1 만큼 반복하면 
    triangle[0][0]의 크기가 정답
    """
    depth = len(triangle) # depth = 5
    for i in range(1, depth): # i = 1,2,3,4
        width = len(triangle[depth - i]) # width = 5,4,3,2
        for j in range(width-1): # j = 0,1,2,3
            triangle[depth-i-1][j] += max(triangle[depth - i][j], triangle[depth - i][j+1])
    return triangle[0][0]

