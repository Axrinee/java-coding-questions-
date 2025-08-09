import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class mergeArray {
    public static Set<Integer> mergeA(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer>arr= new TreeSet<>();
        for(int nums : nums1){
            arr.add(nums);
        }
        for(int nums : nums2){
            arr.add(nums);
        }
        for(int nums : nums3){
            arr.add(nums);
        }
        return arr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] nums1 = new int[n1];
        for(int i =0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] nums2 = new int[n2];
        for(int i =0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }
        int n3 = sc.nextInt();
        int [] nums3 = new int[n3];
        for(int i =0;i<n3;i++){
            nums3[i]=sc.nextInt();
        }
        Set<Integer>result = mergeA(nums1,nums2,nums3);
        for(int num : result){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
