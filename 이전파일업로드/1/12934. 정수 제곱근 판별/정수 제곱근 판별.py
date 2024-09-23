def solution(n):
    i = 1
    while i*i <= n:
        i += 1
        if n == i*i:
            i += 1
            return i*i
    if n == 1:
        return 4
    return -1