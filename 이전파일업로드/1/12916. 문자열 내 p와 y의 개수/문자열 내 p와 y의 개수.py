import re

def solution(s):
    plen = len(re.split(r'p|P', s))
    ylen = len(re.split(r'y|Y', s))

    return plen == ylen