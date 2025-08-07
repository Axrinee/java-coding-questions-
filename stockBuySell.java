public class stockBuySell {
    public static int maxProfit(int[] price){
        int profit =0;
        for (int i =1;i<price.length;i++){
            if(price[i]>price[i-1]){
                profit += price[i]-price[i-1];
            }
        }
        return profit;
    } 
    public static void main (String[]args){
        int[]price={1,5,7,8,2,6,4};
        System.out.println(maxProfit(price));
    }
}
