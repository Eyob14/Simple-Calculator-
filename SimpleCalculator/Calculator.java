package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    Buttons buttons;
    JTextField field;
    private final int WIDTH_W = 450;
    private final int HEIGHT_H = 550;
    private double number1;
    private int operation;
    public Calculator()
    {
        setTitle("Simple Calculator");
        setSize(WIDTH_W, HEIGHT_H);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.black);
        setForeground(Color.blue);

        field = new JTextField(10);
        field.setFont(new Font("Serif", Font.BOLD, 14));
        field.setBackground(Color.LIGHT_GRAY);
        field.setForeground(Color.BLACK);
        buttons = new Buttons();
        //adding action Listener to the buttons
        buttons.b0.addActionListener(new CalcListener());
        buttons.b1.addActionListener(new CalcListener());
        buttons.b2.addActionListener(new CalcListener());
        buttons.b3.addActionListener(new CalcListener());
        buttons.b4.addActionListener(new CalcListener());
        buttons.b5.addActionListener(new CalcListener());
        buttons.b6.addActionListener(new CalcListener());
        buttons.b7.addActionListener(new CalcListener());
        buttons.b8.addActionListener(new CalcListener());
        buttons.b9.addActionListener(new CalcListener());
        buttons.sum.addActionListener(new CalcListener());
        buttons.difference.addActionListener(new CalcListener());
        buttons.product.addActionListener(new CalcListener());
        buttons.division.addActionListener(new CalcListener());
        buttons.equals.addActionListener(new CalcListener());
        buttons.exponent.addActionListener(new CalcListener());
        buttons.sqrt.addActionListener(new CalcListener());
        buttons.sin.addActionListener(new CalcListener());
        buttons.cos.addActionListener(new CalcListener());
        buttons.tan.addActionListener(new CalcListener());
        buttons.log.addActionListener(new CalcListener());
        buttons.ln.addActionListener(new CalcListener());
        buttons.point.addActionListener(new CalcListener());
        buttons.minus.addActionListener(new CalcListener());
        buttons.clear.addActionListener(new CalcListener());

        // For future advancement
        //buttons.inverseExponent.addActionListener(new CalcListener());
        //buttons.square.addActionListener(new CalcListener());

        //adding the panels to the content pane
        add(buttons, BorderLayout.CENTER);
        add(field, BorderLayout.NORTH);

        setVisible(true);
    }
    public class CalcListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            double result; // variable to store all computed values of the program

            if(e.getSource() == buttons.b0){field.setText(field.getText() + buttons.b0.getActionCommand());}
            else if(e.getSource() == buttons.b1){field.setText(field.getText() + buttons.b1.getActionCommand());}
            else if(e.getSource() == buttons.b2){field.setText(field.getText() + buttons.b2.getActionCommand());}
            else if(e.getSource() == buttons.b3){field.setText(field.getText() + buttons.b3.getActionCommand());}
            else if(e.getSource() == buttons.b4){field.setText(field.getText() + buttons.b4.getActionCommand());}
            else if(e.getSource() == buttons.b5){field.setText(field.getText() + buttons.b5.getActionCommand());}
            else if(e.getSource() == buttons.b6){field.setText(field.getText() + buttons.b6.getActionCommand());}
            else if(e.getSource() == buttons.b7){field.setText(field.getText() + buttons.b7.getActionCommand());}
            else if(e.getSource() == buttons.b8){field.setText(field.getText() + buttons.b8.getActionCommand());}
            else if(e.getSource() == buttons.b9){field.setText(field.getText() + buttons.b9.getActionCommand());}


            else if(e.getSource() == buttons.clear){field.setText("");}
            else if(e.getSource() == buttons.point)
            {
                if(field.getText().length() == 0){field.setText("." + field.getText());}
                else if(field.getText().contains(".")){field.setText(field.getText());}
                else if(field.getText().length() != 0) {field.setText(field.getText() + ".");}

            }
            else if(e.getSource() == buttons.minus)
            {
                operation = 7;
                field.setText("-" + field.getText());
            }
            else if(e.getSource() == buttons.sqrt)
            {
                number1 = Double.parseDouble(field.getText());
                result = Math.sqrt(number1);
                field.setText(String.valueOf(result));
            }
            else if(e.getSource() == buttons.log)
            {
                number1 = Double.parseDouble(field.getText());
                result = Math.log10(number1);
                field.setText(String.valueOf(result));
            }
            else if(e.getSource() == buttons.ln)
            {
                number1 = Double.parseDouble(field.getText());
                result = Math.log(number1);
                field.setText(String.valueOf(result));
            }
            /*
            else if(e.getSource() == buttons.square){
                number1 = Double.parseDouble(field.getText());
                result = Math.pow(number1, 2);
                field.setText(String.valueOf(result));
            }
            */
            else if(e.getSource() == buttons.sin){
                number1 = Double.parseDouble(field.getText());
                result = Math.sin(number1);
                field.setText(String.valueOf(result));
            }
            else if(e.getSource() == buttons.cos){
                number1 = Double.parseDouble(field.getText());
                result = Math.cos(number1);
                field.setText(String.valueOf(result));
            }
            else if(e.getSource() == buttons.tan){
                number1 = Double.parseDouble(field.getText());
                result = Math.tan(number1);
                field.setText(String.valueOf(result));
            }
            else if(e.getSource() == buttons.sum)
            {
                number1 = Double.parseDouble(field.getText());
                operation = 1;
                field.setText("");
            }
            else if(e.getSource() == buttons.difference)
            {
                number1 = Double.parseDouble(field.getText());
                operation = 2;
                field.setText("");
            }
            else if(e.getSource() == buttons.product)
            {
                number1 = Double.parseDouble(field.getText());
                operation = 3;
                field.setText("");
            }
            else if(e.getSource() == buttons.division)
            {
                number1 = Double.parseDouble(field.getText());
                operation = 4;
                field.setText("");
            }

            else if(e.getSource() == buttons.exponent)
            {
                number1 = Double.parseDouble(field.getText());
                operation = 5;
                field.setText("");
            }
            else if(e.getSource() == buttons.equals)
            {
                double number2 = Double.parseDouble(field.getText());

                switch (operation)
                {
                    case 1:
                        result = number1 + number2;
                        field.setText(String.valueOf(result));
                        break;
                    case 2:
                        result = number1 - number2;
                        field.setText(String.valueOf(result));
                        break;
                    case 3:
                        result = number1 * number2;
                        field.setText(String.valueOf(result));
                        break;
                    case 4:
                        result = number1 / number2;
                        field.setText(String.valueOf(result));
                        break;
                    case 5:
                        result = Math.pow(number1, number2);
                        field.setText(String.valueOf(result));
                        break;
                    case 6:
                        result = Math.pow(number1, 1/ number2);
                        field.setText(String.valueOf(result));
                        break;
                    case 7:
                        number1 = Double.parseDouble(field.getText());
                        field.setText(String.valueOf(number1));
                        break;
                    default:
                        result = Double.parseDouble(field.getText());
                        field.setText(String.valueOf(result));
                }
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
