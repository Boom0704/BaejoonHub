def solution(n, m):
    up = max(n, m)
    num = 1
    answer = 1
    while num <= up:
        if n%num == 0 and m%num == 0:
            answer = num
        print(num)
        num = num +1
        
    print(answer)
    return [answer, n*m/answer]