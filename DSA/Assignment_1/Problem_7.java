package Assignment_1;

class Problem_7 {
        public void moveZeroes(int[] nums) {
            int size = nums.length;
            int j = 0;
            for(int i = 0; i < size; i++){
                if(nums[i]!=0){
                    nums[j]=nums[i];
                    j++;
                }
            }
    
            for(int i=j ; i<size; i++){
              nums[i] = 0;
            }
        } 
} 

