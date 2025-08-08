import java.util.Scanner;
public class PalindromString {
    public static String isPalindrome(String s){
        int left =0;
        int right = s.length()-1;
        while (left<right){
            while(left<right&&Character.isLetterOrDigit(left)){
                left++;
            }
            while (left<right&&Character.isLetterOrDigit(right)){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return "no";
            }
            left++;
            right--;
        }
        return "yes";
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(isPalindrome(s));
        sc.close();
        }
    }

