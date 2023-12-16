A = int(input())
X = int(input())

hap = 0
for i in range(X):
    a, b = map(int, input().split())
    
    c = a * b
    
    hap += c
if hap==A:
    print("Yes")
else: 
    print("No")