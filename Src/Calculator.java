package Src;
import java.awt.*;
import javax.swing.*;
//import javax.awt.*;
import java.awt.event.*;
/***************************/
public class Calculator implements ActionListener{
    Calculator calc =new Calculator();
    public static void main(String[] args){
    }
    public void actionPerformed(ActionEvent e) {

    }
    JFrame frame;   //frame                              
    JTextField textfiled;
    JButton[] numberButtons = new JButton [10]; //array for the number buttons 10
    JButton[] functionbuttons = new JButton[8]; //array for the func buttons 8
    JButton addButton,subButton,mulButton,divButton;
    JButton deButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("inkFree",Font.BOLD,30); //selcted font
    double num1=0,num2=0,result=0;
    char operator;

    Calculator(){
        frame= new JFrame ("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //option to colse the software
        frame.setSize(420,550);
        frame.setLayout(null);

        frame.setVisible(true);

    }
}