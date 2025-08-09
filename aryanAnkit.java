Aryan and Ankit play a game with N boxes. There are an even number of boxes arranged in a row, and each box has a positive integer number of stone balls, denoted by balls(i). The objective of the game is to end with the most balls. The total number of balls across all the boxes is odd, so there are no ties.

// Rules:

// Aryan and Ankit take turns picking all the balls from either the beginning or the end of the row of boxes. Aryan always plays first. Both players play optimally, meaning they make decisions to maximize their number of balls.

// The game ends when there are no more boxes left. Assume Aryan and Ankit play optimally. Print Aryan if Aryan wins, and print Ankit if Ankit wins.

// Input Format
// The first line of input contains an integer N, representing the size of the array.

// The second line of input contains N space separated integers representing the number of balls in the boxes.

// Output Format
// Display "Aryan" if Aryan wins or Display"Ankit" if Ankit wins.

// Constraints
// 1<=N<=10^2

// Assuming Arr denotes the array and Arr(i) denotes array element at ith index of the array.

// 1<=Arr(i)<=10^4






import java.util.*;
public class ankitoraryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++) dp[i][i] = a[i];

        for (int len = 2; len <= N; len++) {
            for (int l = 0; l + len - 1 < N; l++) {
                int r = l + len - 1;
                dp[l][r] = Math.max(a[l] - dp[l+1][r], a[r] - dp[l][r-1]);
            }
        }
        System.out.println(dp[0][N-1] > 0 ? "Aryan" : "Ankit");
        sc.close();
    }
}
