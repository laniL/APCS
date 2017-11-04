package methods;

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      StarsAndStripes flag = new StarsAndStripes();
      
      flag.printTenStars();
      flag.printThirtyDashes();
      
      flag.printTenStars();
      flag.printBlankStripe();
      
      flag.printTenStars();
      flag.printThirtyDashes();
      
      flag.printTenStars();
      flag.printBlankStripe();
      
      flag.printTenStars();
      flag.printThirtyDashes();
      
      flag.printBigBlankStripe();
      flag.printFourtyDashes();
      flag.printBigBlankStripe();
      flag.printFourtyDashes();
      flag.printBigBlankStripe();
      flag.printFourtyDashes();
      
   }
}