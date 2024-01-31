dados = input().split()
x1, y1 = float(dados[0]), float(dados[1])
dados = input().split()
x2, y2 = float(dados[0]), float(dados[1])
distancia = ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5
print('{:.4f}'.format(distancia))
