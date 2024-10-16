def solution(n):
    # 3진수 변환
    answer = ""
    while n > 0:
        answer += str(n % 3)
        n //= 3

    return int(answer, 3)

