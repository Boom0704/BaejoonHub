def solution(rsp):
    arr = list(rsp)
    for i in range (0, len(arr)):
        if arr[i] == "0":
            arr[i] = "5"
        elif arr[i] == "5":
            arr[i] = "2"
        elif arr[i] == "2":
            arr[i] = "0"
    return ''.join(arr)