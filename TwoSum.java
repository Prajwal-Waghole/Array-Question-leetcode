class Solution {
  public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      for (int i = 0; i < n-1; i++){//this loop will start from first index
          for (int j = i+1; j < n; j++){//this will start form second index
          
              if(nums[i] + nums[j] == target){
                  return new int[]{i,j};
              }
          }
      }
      return new int[]{};
  }
}
