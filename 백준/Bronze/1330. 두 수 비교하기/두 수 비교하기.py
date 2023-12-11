a = input().split(' ')
a_list = map(int, str(a))

A = int(a[0])
B = int(a[1])

if A > B:
    print('>')
    
elif A < B:
    print('<')
    
else:
    print('==')