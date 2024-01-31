x = input().split()
A, B, C = float(x[0]), float(x[1]), float(x[2])
delta = B**2 - 4 * A * C
if A == 0 or delta < 0:
    print('Impossivel calcular')
else:
    r1 = (-B + delta ** (1/2))/(2*A)
    r2 = (-B - delta ** (1/2))/(2*A)
    print('R1 = {:.5f}\nR2 = {:.5f}'.format(r1, r2))
