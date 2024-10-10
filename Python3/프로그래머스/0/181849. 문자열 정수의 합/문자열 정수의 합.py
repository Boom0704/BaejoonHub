def solution(num_str):
    arr = list(num_str)
    answer = 0
    for i in arr:
        answer += int(i)
    return answer