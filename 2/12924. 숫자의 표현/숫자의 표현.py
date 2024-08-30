def solution(n):
    answer = 0
    sum = 0
    for i in range(1, n+1):
        if((n-sum)%i==0):
            if((n-sum)/i>=1):
                answer +=1
        sum +=i
    return answer

