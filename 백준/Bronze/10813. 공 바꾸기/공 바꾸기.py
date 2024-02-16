N, M = map(int,input().split())
a = [int(i+1) for i in range(N)]
X = 0
for i in range(M):
    b, j = map(int, input().split())
    X = a[b-1]
    a[b-1] = a[j-1]
    a[j-1] = X
    
for i in range(len(a)):
    print(a[i], end = ' ')