import java.util.Scanner;
public class finbonacci {
    public static int fibonacci(int n){
        if (n<=0) return n;
        else if (n==1) return 1;
        int a =0,b=1;
        for(int i =2;i<=n;i++){
            int temp = a+b;
            a=b;
            b=temp;
        }
        return b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
        sc.close();
    }
}
