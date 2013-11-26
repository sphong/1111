package Lab08;

import javax.swing.JOptionPane;

public class PayCheck {


    public static void main (String[] args){

      String numStr;
      String numStr2;
      String result;
      double hours;
      double payrate;
      int again;
      double gross;
      double overtime = 1.5;

      

      do {
            numStr = JOptionPane.showInputDialog(null, "Enter number of hours worked:");      
            hours = Double.parseDouble(numStr);
                                  
            numStr2 = JOptionPane.showInputDialog(null, "Enter hourly pay rate:");
            
            payrate = Double.parseDouble(numStr2);

        

        if (hours < 40){
            gross = hours * payrate;             
        }else {
            hours -= 40;
            gross = (payrate * 40) + (hours * payrate *  overtime);
        }

        result = "The Gross pay of the worker is: " + gross;
        
        JOptionPane.showMessageDialog(null, result);
        
        again = JOptionPane.showConfirmDialog(null, "Do Another?");

      }while (again == JOptionPane.YES_OPTION);

    }

};