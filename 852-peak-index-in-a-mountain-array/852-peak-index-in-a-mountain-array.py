class Solution:    
    
    
    #     flag = 0
    #     for i in range(len(arr)-1):
    #         if arr[i] > arr[i+1]:
    #             flag = i
    #             break
    #     return flag
    #    -- Brute Force Approach --
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        s = 0 
        e = len(arr)-1
        while(s<=e):
            mid = s + ((e-s)//2)
            if arr[mid] > arr[mid+1]:
                e = mid
            else:
                
                s= mid+1
            if s == e:
                break
        print(s)
        return s
        