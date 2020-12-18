
public class AdditionArrays
{
    /**
     A demonstration to see how == and an equalArrays method are different.
    */
    public static void main(String[] args)
    {
        int[] c = new int[10];
        int[] d = new int[10]; 
        int[] e; 

        int i;
        for (i = 0; i < c.length; i++)
            c[i] = i;

        for (i = 0; i < d.length; i++)
            d[i] = i*2;


        e = addArrays(c, d);

        //insert your code 
        //print array
         

    }

   public static int[] addArrays(int[] a, int[] b)
   {
       if (a.length != b.length)
          { 
           System.out.println( "Two arrays are not equal size.");
           return null;
          }
       else
       {
          //insert your code
        
       }
 
      
    }


   public static boolean equalArrays(int[] a, int[] b)
   {
       if (a.length != b.length)
           return false;
       else
       {
           int i = 0;
           while (i < a.length)
           {
               if (a[i] != b[i])
                   return false;
               i++;
           }
       }
 
       return true;
    }
 
}
