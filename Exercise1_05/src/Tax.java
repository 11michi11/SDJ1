
public class Tax
{
   public static void main(String[] args) {
      int[] items = {80, 140, 230};
      int sum = 0;
      double tax = 0.0;
      
      for(int e:items) 
         sum += e;
      
      tax = sum * 0.25;
      
      System.out.println("Total price:" + sum + "kr.\n" +
            "Tax:" + tax + "kr."); 
   }
}
