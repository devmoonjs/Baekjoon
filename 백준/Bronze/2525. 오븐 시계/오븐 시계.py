a, b = map(int, input().split())
c = int(input())
A = ((a*60+b)+c)//60
B = ((a*60+b)+c)%60
if A > 23:
    A -= 24
print(A, B)