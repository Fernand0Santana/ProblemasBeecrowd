X = input().split()
A, B, C ,D = int(X[0]), int(X[1]), int(X[2]), int(X[3])
if (B > C) and (D > A) and (C + D > A + B) and (D > 0) and (C > 0) and (A % 2 == 0):
    print('Valores aceitos')
else:
    print('Valores nao aceitos')
