class Solution:
    def search(self, arr: List[int], target: int) -> int:
        s = 0 
        e = len(arr)-1
        pivot = 0
        if arr[0] > arr[len(arr)-1]:
            while (s<e):
                mid = s + ((e-s)//2)

                if arr[mid] > arr[mid+1]:
                    pivot = mid
                    break
                elif arr[mid] < arr[mid-1]:
                    pivot = mid -1
                    break
                elif arr[s] > arr[mid]:
                    e =mid +1 
                elif arr[s] < arr[mid]:
                    s = mid +1
        print(pivot)
        s = 0
        e = pivot
        while (s<=e):
            mid = s + ((e-s)//2)
            if arr[mid] > target :
                e = mid -1 
            elif arr[mid] < target:
                s= mid +1
            else:
                return mid
        s = pivot + 1
        e = len(arr)-1
        while (s<=e):
            mid = s + ((e-s)//2)
            if arr[mid] > target :
                e = mid -1 
            elif arr[mid] < target:
                s= mid +1
            else:
                return mid
            
            
        return -1
                
                