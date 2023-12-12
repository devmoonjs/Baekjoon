num = []

for i in range(9):
    num.append(input())
    
max = 0
count = 0

for i in range(len(num)):
    if int(max) < int(num[i]):
        max = int(num[i])
        count = i + 1
        
print(max)
print(count)
