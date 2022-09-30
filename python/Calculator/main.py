import sys
# ------------------------------
ops = ["+" , "-" , "*" , "^" , "/" , "%", "2D", "3D", ]
add = sub = mul = exp = div = rem = False
#-------------------------------
op = input("What operation(+,-,*,^,/,%,2D,3D)?: ")
if op not in ops:
    raise TypeError("Invalid input!")
if op == ops[0]:
    print("Addition")
    add = True
if op == ops[1]:
    print("Subtraction")
    sub = True
if op == ops[2]:
    print("Multiplication")
    mul = True
if op == ops[3]:
    print("Exponentiation")
    exp = True
if op == ops[4]:
    print("Division")
    div = True
if op == ops[5]:
    print("Remainder")
    rem = True
if op == ops[6]:
    shapes = ["rect", "squ", "circ", "tri", ]
    shape = input("What shape(rect,squ,circ,tri): ")
    if shape not in shapes:
        raise TypeError("Invalid input!")
    if shape == shapes[0]:
        print("rect")
        L = int(input("Length: "))
        W = int(input("Width: "))
        A = L*W
        print(A)
        sys.exit(0)
    if shape == shapes[1]:
        print("squ")
        S = int(input("Side: "))
        A = S**2
        print(A)
        sys.exit(0)
    if shape == shapes[2]:
        print("circ")
        pi = 3.14
        R = int(input("Radius: "))
        A = pi * (R**2)
        print(A)
        sys.exit(0)
    if shape == shapes[3]:
        print("tri")
        H = int(input("Height: "))
        B = int(input("Base: "))
        A = (H*B)/2
        print(A)
        sys.exit(0)
if op == ops[7]:
    shapes_3D = ["rect", "cube", "sph", "pyr", ]
    shape_3D = input("What shape(rect,cube,sph,pyr): ")
    if shape_3D not in shapes_3D:
        raise TypeError("Invalid input!")
    if shape_3D == shapes_3D[0]:
        print("rectP ")  
        L = int(input("Length: "))
        W = int(input("Width: "))
        H = int(input("Height: "))
        A = L*W*H
        print(A)
        sys.exit(0)
    if shape_3D == shapes_3D[1]:
        print("cube")
        S = int(input("Edge: "))
        A = S**3
        print(A)
        sys.exit(0)
    if shape_3D == shapes_3D[2]:
        print("sphere")
        pi = 3.14
        R = int(input("Radius: "))
        A = (4/3)*(pi * R**3)
        print(A)
        sys.exit(0)
    if shape_3D == shapes_3D[3]:
        print("pyr")
        H = int(input("Height: "))
        L = int(input("Length: "))
        W = int(input("Width: "))
        B = L*W
        A = B*(H/3)
        print(A)
        sys.exit(0)
num_1 = int(input("First number: "))
num_2 = int(input("Second number: "))
if add:
    Sum = num_1 + num_2
    print(Sum)
if sub:
    Sum = num_1 - num_2
    print(Sum)
if mul:
    Sum = num_1 * num_2
    print(Sum)
if exp:
    Sum = num_1 ** num_2
    print(Sum)
if div:
    Sum = num_1 / num_2
    print(Sum)
if rem:
    Sum = num_1 % num_2
    print(Sum)