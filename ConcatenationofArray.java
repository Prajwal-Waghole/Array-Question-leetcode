class Solution {
  public int[] getConcatenation(int[] nums) {
      int n = nums.length;
      int size = 2*nums.length;
      int [] ans = new int[size];


      for (int i = 0; i < n; i++){
          ans[i] = nums[i];
          ans[i+n] = nums[i];
          /*---this copy the size of num plus the elements
          for eg = ans[i] = nums[i] , tyanntr size mhnje[123] sodun parat nums[i] elemnts copy krnar ans ans=[123123]*/
      }return ans;

      
  }
}