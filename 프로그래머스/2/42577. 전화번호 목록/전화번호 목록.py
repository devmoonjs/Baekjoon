def solution(phone_book):
    answer = True
    new = sorted(phone_book)

    for i in range(len(new)-1):
        
        if len(new[i]) < len(new[i+1]):

            if new[i] == new[i+1][:len(new[i])]:
                answer = False
                break

    return answer