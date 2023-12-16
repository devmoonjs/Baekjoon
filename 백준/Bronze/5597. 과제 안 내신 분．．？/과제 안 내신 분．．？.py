data = [i for i in range(1,31)]
chul = [int(input()) for i in range(28)]

li = []
for i in data:
    if i not in chul:
        li.append(i)
        
li.sort()
print(li[0])
print(li[1])