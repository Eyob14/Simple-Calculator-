package SimpleCalculator;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Buttons extends JPanel {
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;

    JButton sum;
    JButton difference;
    JButton product;
    JButton division;
    JButton equals;
    // new added
    JButton clear;
    JButton exponent;
    JButton sqrt;
    //JButton square;
    JButton sin;
    JButton cos;
    JButton tan;
    //JButton inverseExponent;
    JButton log;
    JButton ln;
    JButton point;
    JButton minus;

    Font font1;
    Font font2;
    ImageIcon image = new ImageIcon("C:\\Eyob\\programming\\All Projects\\Java Projects\\src\\SimpleCalculator\\Button Image\\1553102_green_number_numbers_one_study_icon.png");

    public Buttons()
    {
        setLayout(new GridLayout(5, 5));
        font1 = new Font("Serif", Font.BOLD, 24);
        font2 = new Font("Serif", Font.BOLD, 20);
        // creating the number buttons
        b0 = new JButton("0");
        b0.setFont(font1);
        b0.setBackground(Color.black);
        b0.setForeground(Color.blue);
        b1 = new JButton("1");
        b1.setFont(font1);
        b1.setBackground(Color.black);
        b1.setForeground(Color.blue);
        b2 = new JButton("2");
        b2.setFont(font1);
        b2.setBackground(Color.black);
        b2.setForeground(Color.blue);
        b3 = new JButton("3");
        b3.setFont(font1);
        b3.setBackground(Color.black);
        b3.setForeground(Color.blue);
        b4 = new JButton("4");
        b4.setFont(font1);
        b4.setBackground(Color.black);
        b4.setForeground(Color.blue);
        b5 = new JButton("5");
        b5.setFont(font1);
        b5.setBackground(Color.black);
        b5.setForeground(Color.blue);
        b6 = new JButton("6");
        b6.setFont(font1);
        b6.setBackground(Color.black);
        b6.setForeground(Color.blue);
        b7 = new JButton("7");
        b7.setFont(font1);
        b7.setBackground(Color.black);
        b7.setForeground(Color.blue);
        b8 = new JButton("8");
        b8.setFont(font1);
        b8.setBackground(Color.black);
        b8.setForeground(Color.blue);
        b9 = new JButton("9");
        b9.setFont(font1);
        b9.setBackground(Color.black);
        b9.setForeground(Color.blue);

        // creating additional operators and other buttons
        exponent = new JButton("<html><font color = blue><b> pow </b></font></html>");
        exponent.setFont(font2);
        exponent.setBackground(Color.black);
        sqrt = new JButton("<html><font color = blue><b> sqrt </b></font></html>");
        sqrt.setFont(font2);
        sqrt.setBackground(Color.black);
        //square = new JButton("<html><font color = blue><b> Square </b></font></html>");
        //square.setBackground(Color.black);
        sin = new JButton("<html><font color = blue><b> sin </b></font></html>");
        sin.setFont(font2);
        sin.setBackground(Color.black);
        cos = new JButton("<html><font color = blue><b> cos </b></font></html>");
        cos.setFont(font2);
        cos.setBackground(Color.black);
        tan = new JButton("<html><font color = blue><b> tan </b></font></html>");
        tan.setFont(font2);
        tan.setBackground(Color.black);
        //inverseExponent = new JButton("<html><font color = blue><b> inverseSquare </b></font></html>");
        //inverseExponent.setBackground(Color.black);
        log = new JButton("<html><font color = blue><b> log </b></font></html>");
        log.setBackground(Color.black);
        log.setFont(font2);
        ln = new JButton("<html><font color = blue><b> ln </b></font></html>");
        ln.setBackground(Color.black);
        ln.setFont(font2);
        point = new JButton("<html><font color = blue><b> . </b></font></html>");
        point.setBackground(Color.black);
        point.setFont(font1);
        minus = new JButton("<html><font color = blue><b> (-) </b></font></html>");
        minus.setBackground(Color.black);
        minus.setFont(font2);

        clear = new JButton("<html><font color = red><b> C </b></font></html>");
        clear.setBackground(Color.black);
        clear.setFont(font1);



        // creating major operators
        sum = new JButton("<html><font color = blue><b> + </b></font></html>");
        sum.setBackground(Color.black);
        sum.setFont(font1);
        difference = new JButton("<html><font color = blue><b> - </b></font></html>");
        difference.setBackground(Color.black);
        difference.setFont(font1);
        product = new JButton("<html><font color = blue><b> * </b></font></html>");
        product.setFont(font1);
        product.setBackground(Color.black);
        division = new JButton("<html><font color = blue><b> / </b></font></html>");
        division.setBackground(Color.black);
        division.setFont(font1);
        equals = new JButton("<html><font color = blue><b> = </b></font></html>");
        equals.setBackground(Color.black);
        equals.setFont(font1);

        setBackground(Color.black);
        setForeground(Color.blue);

        // adding the buttons
        add(clear);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(sum);
        add(difference);
        add(product);
        add(division);
        //new
        add(exponent);
        add(sqrt);
        //add(square);
        add(sin);
        add(cos);
        add(tan);
        //add(inverseExponent);
        add(log);
        add(ln);
        add(point);
        add(minus);
        add(equals);
    }
}
