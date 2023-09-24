X = input()
C = X.split(' ')
while True:
    try:
        C.remove('')
    except:
        ValueError
        break
print(len(C))