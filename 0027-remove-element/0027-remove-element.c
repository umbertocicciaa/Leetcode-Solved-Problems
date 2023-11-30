int removeElement(int* nums, int numsSize, int val) {
    int i,repetions,x;
    repetions=0;
    x=0;
    for(i=0;i<numsSize;i++){
        x=nums[i];
        if (x!=val){
            nums[repetions]=x;
            repetions++;
        }
    }
    return repetions;
}