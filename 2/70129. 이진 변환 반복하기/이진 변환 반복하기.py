def solution(s):
    answer = [0,0]
    while(s != "1"):
        ss = s.replace('0','')
        answer[0] += 1
        answer[1] += len(s) - len(ss)
        s = format(len(ss), 'b')
    
    return answer