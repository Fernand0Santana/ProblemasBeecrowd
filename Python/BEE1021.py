din = float(input())
x = din * 100
n100 = x // 10000
n50 = (x-n100*10000)//5000
n20 = (x-n100*10000-n50*5000)//2000
n10 = (x-n100*10000-n50*5000-n20*2000)//1000
n5 = (x-n100*10000-n50*5000-n20*2000-n10*1000)//500
n2 = (x-n100*10000-n50*5000-n20*2000-n10*1000-n5*500)//200
y = (x-n100*10000-n50*5000-n20*2000-n10*1000-n5*500-n2*200)
m1 = y//100
m50 = (y-m1*100)//50
m25 = (y-m1*100-m50*50)//25
m10 = (y-m1*100-m50*50-m25*25)//10
m5 = (y-m1*100-m50*50-m25*25-m10*10)//5
m1cent = (y-m1*100-m50*50-m25*25-m10*10-m5*5)
print('NOTAS:')
print('{:.0f} nota(s) de R$ 100.00'.format(n100))
print('{:.0f} nota(s) de R$ 50.00'.format(n50))
print('{:.0f} nota(s) de R$ 20.00'.format(n20))
print('{:.0f} nota(s) de R$ 10.00'.format(n10))
print('{:.0f} nota(s) de R$ 5.00'.format(n5))
print('{:.0f} nota(s) de R$ 2.00'.format(n2))
print('MOEDAS:')
print('{:.0f} moeda(s) de R$ 1.00'.format(m1))
print('{:.0f} moeda(s) de R$ 0.50'.format(m50))
print('{:.0f} moeda(s) de R$ 0.25'.format(m25))
print('{:.0f} moeda(s) de R$ 0.10'.format(m10))
print('{:.0f} moeda(s) de R$ 0.05'.format(m5))
print('{:.0f} moeda(s) de R$ 0.01'.format(m1cent))
