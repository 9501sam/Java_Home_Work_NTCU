import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyFormatDemo
{
  public static void main(String[] args)
  {       
    System.out.println("Default location:");
    NumberFormat moneyFormater =
                    //NumberFormat.getCurrencyInstance(Locale.US);
                   NumberFormat.getCurrencyInstance(Locale.FRANCE);

    System.out.println(moneyFormater.format(19.8));
    System.out.println(moneyFormater.format(19.81111));
    System.out.println(moneyFormater.format(19.89999));
    System.out.println(moneyFormater.format(19));
    System.out.println(moneyFormater.format(19999.89999));
    System.out.println();

  }
}
