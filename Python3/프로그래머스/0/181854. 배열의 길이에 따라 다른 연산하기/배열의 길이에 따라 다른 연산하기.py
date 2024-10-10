def solution(arr, n):
    leng = len(arr)
    
    for i, num in enumerate(arr):
        if leng % 2 == 1 and i % 2 == 0:
            arr[i] += n
        elif leng % 2 == 0 and i % 2 == 1:
            arr[i] += n
            
    return arr
