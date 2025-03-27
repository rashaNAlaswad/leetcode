class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var pointerForNum1 = m-1
        var pointerForNum2 = n-1
        var pointer = m+n-1

        while(pointerForNum1 >=0 && pointerForNum2>=0){
            if(nums1[pointerForNum1] > nums2[pointerForNum2]){
                nums1[pointer] = nums1[pointerForNum1]
                pointerForNum1--
            } else{
                nums1[pointer] = nums2[pointerForNum2]
                pointerForNum2--
            }
            pointer--
        }

        while(pointerForNum2>=0){
            nums1[pointer] = nums2[pointerForNum2]
            pointerForNum2--
            pointer--
        }
    }
}