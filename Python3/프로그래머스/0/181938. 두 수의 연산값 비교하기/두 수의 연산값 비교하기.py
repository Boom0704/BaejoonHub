def solution(a, b):
    first = str(a)+str(b)
    second = a*b*2
    if(int(first)>= second):
        return int(first)
    else:
        return second