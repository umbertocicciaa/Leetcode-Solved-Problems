class Solution {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> result = new HashSet<Integer>();
        if(nums1.length < nums2.length){
            for(int i=0;i<nums1.length;i++){
                if(arrayContains(nums2,nums1[i]))
                    result.add(nums1[i]);
            }
        }else{
            for(int i=0;i<nums2.length;i++){
                if(arrayContains(nums1,nums2[i]))
                    result.add(nums2[i]);
            }
        }
        
        int[] intArray = new int[result.size()];
        int i=0;
        for(int number : result)
            intArray[i++]=number;

        return intArray;
    }
    
    private static boolean arrayContains(int[]array, int number){
        int i=0;
        int j=array.length-1;
        
        while(i<=j){
            int med = i+ (j-i) / 2;
            if(array[med] == number)
                return true;
            if(array[med] > number)
                j=med-1;
            else
                i=med+1;
        }
        return false;
    }
    
}