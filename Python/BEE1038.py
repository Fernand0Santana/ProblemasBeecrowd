x = input().split()
codigo, quantidade = int(x[0]), int(x[1])
if codigo == 1:
    preco = 4
if codigo == 2:
    preco = 4.5
if codigo == 3:
    preco = 5
if codigo == 4:
    preco = 2
if codigo == 5:
    preco = 1.5
print('Total: R$ {:.2f}'.format(preco*quantidade))
