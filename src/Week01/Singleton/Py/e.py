def sum(a, b):
    return a+b
    

def sumRaise(a, b):
    if(a<b):
        return a+b
    raise Exception(a-b)

print(sum(1,6))

try:
   print( sumRaise(1,4))
except Exception as e:
    print(e)

try:
   print( sumRaise(4,1))
except Exception as e:
    print(e)