// This class implements a Celsius-Fahrenheit converter
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Temperature2 extends JFrame
  implements ActionListener
{
  private JTextField displayF, displayC;
  // Constructor
  public Temperature2()
  {
    Container c = getContentPane();
    c.setLayout(new GridLayout(2, 2, 10, 0));
    c.add(new JLabel("  Fahrenheit:"));
    c.add(new JLabel("  Celsius:"));
    displayF = new JTextField(6);
    displayF.setBackground(Color.YELLOW);
    displayF.addActionListener(this);
    c.add(displayF);
    displayC = new JTextField(6);
    displayC.setBackground(Color.YELLOW);
    displayC.addActionListener(this);
    c.add(displayC);
 }
  // Invoked when <Enter> is pressed 
  public void actionPerformed(ActionEvent e)
  {
    //FCConverter fc = new FCConverter();
    if ((JTextField)e.getSource() == displayF)
    {
      // Fahrenheit to Celsius
      double degrees = stringToDouble(displayF.getText());
      if (!Double.isNaN(degrees))
      {
        //fc.setFahrenheit(degrees);
        degrees = FCConverter2.fToC(degrees);
        displayC.setText(String.format("%1.1f", degrees));
      }
      else
      {
        displayF.selectAll();
      }
    }
    else
    {
      // Celsius to Fahrenheit
      double degrees = stringToDouble(displayC.getText());
      if (!Double.isNaN(degrees))
      {
        //fc.setCelsius(degrees);
        degrees = FCConverter2.cToF(degrees);
        displayF.setText(String.format("%1.1f", degrees));
      }
      else
      {
        displayC.selectAll();
      }
    }
  }
  // Extracts a double value from a string
  private double stringToDouble(String s)
  {
    double degrees;
    try
    {
      degrees = Double.parseDouble(s);
    }
    catch (NumberFormatException ex)
    {
      JOptionPane.showMessageDialog(null,
        "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);      
      degrees = Double.NaN;
    }
    return degrees;
  }
  // **********************************************************************
  public static void main(String[] args)
  {
    Temperature2 window = new Temperature2();
    window.setBounds(300, 300, 200, 80);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
