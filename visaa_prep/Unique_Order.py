def unique_order(n,arr):
    same = set()
    unique_ele = []
    
    for number in arr:
        if number not in same:
            unique_ele.append(number)
            same.add(number)
            
    print(" ".join(map(str, unique_ele)))
    
    
n = int(input())
arr = list(map(int, input().split()))

unique_order(n,arr)
