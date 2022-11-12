class Solution:
    def rotate(self, nums: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        arr = [0]*(len(nums)**2)
        c=0
        for i in range(len(nums)):
            for j in range(len(nums)):
                
                arr[c] = nums[j][len(nums)-1-i]
                c+=1
                
        c=len(arr)-1
        print(arr)
        for i in range (len(nums)):
            for j in range(len(nums)):
                nums[i][j] = arr[c]
                c=c-1
        return nums
                
        
        