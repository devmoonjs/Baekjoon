def solution(s):
    a = list(map(int, (s.split())))
    
    max_value = max(a)
    min_value = min(a)
    
    result = str(min_value) + " " + str(max_value)
    
    return result