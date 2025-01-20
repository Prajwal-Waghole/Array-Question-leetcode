class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
      int [] ans = new int[nums.length];
      
      for(int i = 0; i < nums.length; i++){
          int small = 0;
          for(int j = 0; j < nums.length; j++){
              if(nums[j] < nums[i] ){
                  small ++;
                  //ans[i] = small;
              }
              ans[i] = small;
          }
      }
      return ans;

  }
}
