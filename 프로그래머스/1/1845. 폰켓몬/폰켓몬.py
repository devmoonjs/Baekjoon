def solution(nums):
    choose = len(nums)/2
    result = set(nums)
    answer = len(result)
    return min(answer, choose)