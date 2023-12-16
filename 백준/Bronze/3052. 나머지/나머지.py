a = [int(input()) for i in range(10)]
b = [0]*10
for i in range(10):
    b[i] = a[i]%42
    
set_b = set(b)
print(len(set_b))