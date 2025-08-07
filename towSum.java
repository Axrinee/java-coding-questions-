import java.util.Arrays;
public class twosum {
    public static int[] sum (int [] nums, int target){
        for (int i =0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int [] {i,j};
            }
        }
        }
         return new int[]{};
    }
    public static void main(String[]args){
        int [] nums ={1,9,6,3,5,8};
        int target = 6;
        int [] result = sum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
