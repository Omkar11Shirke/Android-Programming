emp_tup = ()
print(type(emp_tup))
print(emp_tup)

int_tup = [(1, 2, 3, 4,), (0, 0, 0, 0), ("hello", 2)]
print(type(int_tup))
print(int_tup)
print()

mix_tup = [(8, 3, 3, 4)]
print(type(mix_tup))
print(mix_tup)

nest_tup = ("hello", "world", "somaiya", (9, 8, 7, 6, 90))
print(type(nest_tup))
print(nest_tup)

middle_ele = len(mix_tup) / 2
print(mix_tup[int(middle_ele)])

i = 0
while i <= len(mix_tup):
    i += 1
    if i == middle_ele:
        print(mix_tup[i])

join_tup = mix_tup + int_tup
print(join_tup)
print(join_tup[0])
print(join_tup[-1])

print(join_tup)
print("\n")
res = [(sub[-1], sub[0]) for sub in join_tup]
print(res)

print(divmod(7,3))
