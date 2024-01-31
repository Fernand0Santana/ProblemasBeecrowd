N = int(input())
Ano = N // 365
Mes = (N - Ano * 365) // 30
Dia = N - Ano * 365 - Mes * 30
print('{} ano(s)'.format(Ano))
print('{} mes(es)'.format(Mes))
print('{} dia(s)'.format(Dia))
