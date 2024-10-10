def solution(a, b):
    aa =  a % 2==1
    bb = b % 2==1
    if aa and bb :
        return a*a+b*b
    elif not aa and not bb:
        return abs(a-b)
    else:
        return 2*(a+b)