public class Lottery2
{
  public static void main(String[] args)
  {

  System.out.println("Six Random Lottery Numbers");
  
  int max =100;
  int min =1; 
  int range = max - min +1;
  for (int i = 0; i < 6; i++) {
         int rand = (int) (Math.random() *range) + min;
  System.out.println(rand);
                               }
   }
}
 

