a, b = map(int, input().split())
A = ((a*60+b)-45)//60
B = ((a*60+b)-45)%60
if A<0:
    A += 24
print(A, B)