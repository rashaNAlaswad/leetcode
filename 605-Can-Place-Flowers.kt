class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = n
        var i = 0
        while(i < flowerbed.size){
            if(flowerbed[i] == 0 && 
            (i == 0 || flowerbed[i - 1] == 0) &&
            (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
            ){
                flowerbed[i] = 1
                count--
                if (count == 0) return true
                i++
            }
            i++
        }
        return count<=0        
    }
}