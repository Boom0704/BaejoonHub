def solution(price, money, count):
    value = 0
    for i in range (1, count+1):
        value += i
    totalValue = price * value
    if money > totalValue:
        return 0
    answer = totalValue - money

    return answer