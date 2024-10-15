def solution(arr):
    answer = []
    temp = -1
    for i in arr:
        if temp == i:
            continue
        else:
            answer.append(i)
            temp = i
    return answer