import java.util.Arrays;
public class moveZeros {
    public static int [] Zeros(int [] nums){
        int j =-1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
            if(j==-1){
                return nums;
            }
            for(int i =j+1;i<nums.length;i++){
                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i]= nums[j];
                    nums[j]=temp;
                    j++;
                }
            }
            return nums;
        }
    
    public static void main(String[]args){
        int [] nums = {1,0,0,3,4};
        int [] result = Zeros(nums);
        System.out.println(Arrays.toString(result));
    }
}
