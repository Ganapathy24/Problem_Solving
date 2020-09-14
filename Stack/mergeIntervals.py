T = int(input())
for _ in range(T):
    n = int(input())
    lt = list(map(int,input().split()))
    data = []
    for i in range(0,len(lt),2):
        data.append([lt[i],lt[i+1]])
    data.sort()
    start = []
    end = []
    start.append(data[0][0])
    end.append(data[0][1])
    for i in range(1,n):
        if(data[i][0] <= end[-1]):
            if(data[i][1] > end[-1]):
                end.pop()
                end.append(data[i][1])
        else:
            start.append(data[i][0])
            end.append(data[i][1])
    for i in range(len(start)):
        print(start[i],end[i],end=" ")
    print()
    