N, M = map(int, input().split())
basket = [0]*N

for X in range(M):
    i, j, k = map(int, input().split())

    for i in range(i,j+1):
        basket[i-1] = k
        
for A in range(len(basket)):
    print(basket[A], end = ' ')
