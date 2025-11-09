class Singleton:

    instance = True

    def __init__(self) -> None:

        if Singleton.instance == True:
            Singleton.instance = self
        else:
            raise Exception(Singleton.instance)


def getInstance():
    instance = None
    try:
        instance = Singleton()
    except Exception as e:
        instance = e

    return instance


test = getInstance()
test1 = getInstance()
test2 = getInstance()
test3 = getInstance()
test4 = getInstance()
test5 = getInstance()

print(test)
print(test1)
print(test2)
print(test3)
print(test4)
print(test5)
