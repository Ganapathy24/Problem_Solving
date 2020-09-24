def removingSubstring(string,subString):
    stack = [string[0]]
    count = 0
    for i in range(1,len(string)):
        if(stack[-1] == subString[0] and string[i] == subString[1]):
            stack.pop()
            count += 1
        else:
            stack.append(string[i])
    return  "".join(stack), count

string = input().strip()
x,y = map(int,input().split())
if(x > y):
    string, countX = removingSubstring(string,"SR")
    string, countY = removingSubstring(string,"RS")
else:
    string, countY = removingSubstring(string,"RS")
    string, countX = removingSubstring(string,"SR")

print(countX * x + countY * y)
