def solution(num_list):
    odd = 0
    even = 0
    for i, num in enumerate(num_list):
        if(i % 2 ==0):
            odd += num
        else:
            even += num
    
    return max(odd, even)