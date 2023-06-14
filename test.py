def f():
    return -1


def g():
    return 0xffffffff


print(f())
print(g())


# without the space between the literal and method call,
# interpreter treats it as an invalid float literal
print(-1 .__add__(2))   # prints -3  !!
print((-1) .__add__(2))  # prints  1
