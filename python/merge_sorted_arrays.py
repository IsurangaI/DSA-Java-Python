nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3


p1 = len(nums1)-1
p2 = len(nums2)-1
p3 = m-1

for i in range (len(nums1)):
    if( p2 < 0):
        break
    if(p3< 0):
        nums1[p1] = nums2[p2]
        p1 -= 1
        p2 -= 1
        continue
        

    
    number1 = nums1[p3]
    number2 = nums2[p2]

    if (number2 > number1):
        nums1[p1] = number2
        p1-=1
        p2-=1
        continue
    else:
        nums1[p1] = number1
        p1-=1
        p3-=1
        continue

