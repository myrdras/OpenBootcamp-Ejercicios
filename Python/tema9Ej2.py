from functools import reduce
num = [1, 5, 3, 4, 3, 2, 8, 9]
res = filter(lambda x: x % 2, num)

print(reduce(lambda a, b: a+b, res))