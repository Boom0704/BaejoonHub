def solution(s):
    r = s.split()
    data_r = list(map(int, r))
    data_r.sort()
    return str(data_r[0])+" "+str(data_r[-1])