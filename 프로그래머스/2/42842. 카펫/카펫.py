def solution(brown, yellow):
    h = 1
    while (True):
        if yellow % h == 0:
            w = yellow // h
            if (h+2) * (w+2) == brown+yellow:
                return [w+2, h+2]
        h +=1 