import java.util.Random; 
public class Lottery
{
  public static void main(String[] args)
  {

  System.out.println("Six Random Lottery Numbers");
   int rn;
   Random rand = new Random();
   for(int i = 0; i < 6; i++){
      rn = rand.nextInt(50);
      System.out.println(rn);
   }
   }
}
 
