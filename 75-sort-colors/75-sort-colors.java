class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0 , mid = 0;
        int high = n-1;
        
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp1 = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp1;
                high--;
            }
        }
    }
}