class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 1
        var end = arr.size-2

        while(start <= end){
            var mid = (start + end) /2
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1] ) return mid

            if (arr[mid] <= arr[mid+1]){
                start = mid +1
            } else{
                end = mid -1
            }
        }
        return -1
    }
}