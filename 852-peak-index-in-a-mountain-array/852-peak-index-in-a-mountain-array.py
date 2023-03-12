class Solution:        
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        flag = 0
        for i in range(len(arr)-1):
            if arr[i] > arr[i+1]:
                flag = i
                break
        return flag
        