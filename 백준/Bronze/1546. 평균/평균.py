a = int(input())
b = list(map(int, input().split()))
B = max(b)
for i in range(a):
    b[i] = b[i]/B*100
print(sum(b)/a)