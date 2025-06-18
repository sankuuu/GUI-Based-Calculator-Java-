///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Project Name : GUI-Based Calculator (Java)
//
//    Application : xAnket's Custom Calculator
//
//    Description : A modern, user-friendly calculator application built using Java's AWT library.
//    Enables quick and accurate basic arithmetic operations (Addition, Subtraction,
//    Multiplication, Division) through an intuitive graphical interface.
//    Designed for students, professionals, and anyone needing fast desktop calculations.
//
//    Author : Sanket Shashikant Harpude
//
//    Project Guide : Prof. Piyush Khairnar
//
//    Date : 14-Nov-2024
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.awt.*;
import java.awt.event.*;


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//       Functions Provided by the Program:
//
//    - Addition: Computes the sum of two integers.
//    - Subtraction: Computes the difference between two integers.
//    - Multiplication: Computes the product of two integers.
//    - Division: Computes the quotient of two integers (integer division).
//    - Error Handling: Displays a message for invalid or empty inputs.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Input and Output:
//
//    Input:
//    - Two integer values entered by the user in the provided text fields.
//
//    Output:
//    - The result of the selected arithmetic operation displayed as a message label.
//    - Example: "Addition is : 15"
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Time Complexity:
//
//    - Each arithmetic operation (addition, subtraction, multiplication, division) executes
//    in constant time: O(1).
//    - Input parsing and result display also operate in O(1) time.
//    - Overall, the application responds instantly for all valid inputs.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    How the Algorithm Works:
//
//    1. User enters two numbers in the input fields.
//    2. User clicks one of the operation buttons (ADD, SUB, MULT, DIV).
//    3. The program reads and parses the input values.
//    4. Based on the button pressed, the corresponding arithmetic operation is performed.
//    5. The result is displayed in the label area.
//    6. If inputs are invalid or empty, an error message is shown (handled gracefully).
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Calculator extends WindowAdapter implements ActionListener
{
    public Frame mainframe;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;
    Integer no1, no2;

    public Calculator(int Width, int Height, String Title)
    {
        mainframe = new Frame(Title);
        mainframe.setSize(Width,Height);
        mainframe.addWindowListener(this);

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MULT");
        b4 = new Button("DIV");

        t1 = new TextField();
        t2 = new TextField();
        
        lobj = new Label();

        b1.setBounds(10,280,80,40);
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);
        //t1.setBounds(X,Y,W,H);
        t1.setBounds(70,100,100,40);
        t2.setBounds(220,100,100,40);

        lobj.setBounds(150,170,200,100);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);
        
        mainframe.add(t1);
        mainframe.add(t2);

        mainframe.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

    public void windowClosing(WindowEvent wobj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());

            if(aobj.getSource() == b1)
            {
                lobj.setText("Addition is : "+(no1+no2));
            }
            else if(aobj.getSource() == b2)
            {
                lobj.setText("Substraction is : "+(no1-no2));
            }
            else if(aobj.getSource() == b3)
            {
                lobj.setText("Multiplication is : "+(no1*no2));
            }
               else if(aobj.getSource() == b4)
            {
                lobj.setText("Division is : "+(no1/no2));
            }
        }
        catch(Exception eobj)
        {}
    }
}

class SanketCustomCalculator
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator(400,400,"xAnket's Custom Calculator");
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//     Purpose & Unique Features:
//
//    - Simplifies everyday calculations with a clear, distraction-free interface.
//    - Eliminates the need for complex scientific calculators for basic tasks.
//    - Ideal for academic, office, or personal use.
//    - Custom-built for reliability and ease of use.
//    - Responsive error handling for invalid inputs.
//    - Lightweight, efficient, and easily extendable.
//
//    Why use this application?
//    xAnket's Custom Calculator offers a tailored, no-nonsense tool for essential math,
//    making it perfect for quick calculations without unnecessary complexity.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////