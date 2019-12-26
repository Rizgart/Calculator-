import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String [] args){
        Calculator1 cal = new Calculator1();
        cal.calculator();

    }

}

class Calculator1{
    public JFrame frame;
    public JTextArea field = new JTextArea();
    public JTextArea field2 = new JTextArea();
    String strNum1 = "";
    String strNum2 = "";

    String[] statement;
    int num1 = 0;
    int num2 = 0;
    String total = "";
    int totalValue = 0;

    public void calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 420);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu file = new JMenu("File");
        JMenuItem close = new JMenuItem("close");
        menuBar.add(file);
        file.add(close);
        JMenu help = new JMenu("Help");
        menuBar.add(help);
        JMenuItem aboutCal = new JMenuItem("About");
        JMenuItem helping = new JMenuItem("Help");
        help.add(aboutCal);
        help.add(helping);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        aboutCal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a calculator made by Rizgar" +
                        " Teimouri");
            }
        });
        helping.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "There is currently no help");
            }
        });

        field.setSize(300,80);
        field.setLocation(15,5);
        field.setEditable(false);
        field.setColumns(30);

        frame.add(field);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonComma = new JButton(",");
        JButton equalButton = new JButton("=");
        JButton additionButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplicationButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton deleteButton = new JButton("C");
        JButton resetButton = new JButton("R");

        button0.setSize(50, 50);
        button0.setLocation(185, 300);
        button0.setVisible(true);
        button1.setSize(50, 50);
        button1.setLocation(135, 250);
        button1.setVisible(true);
        button2.setSize(50, 50);
        button2.setLocation(185, 250);
        button2.setVisible(true);
        button3.setSize(50, 50);
        button3.setLocation(235, 250);
        button3.setVisible(true);
        button4.setSize(50, 50);
        button4.setLocation(135, 200);
        button4.setVisible(true);
        button5.setSize(50, 50);
        button5.setLocation(185, 200);
        button5.setVisible(true);
        button6.setSize(50, 50);
        button6.setLocation(235, 200);
        button6.setVisible(true);
        button7.setSize(50, 50);
        button7.setLocation(135, 150);
        button7.setVisible(true);
        button8.setSize(50, 50);
        button8.setLocation(185, 150);
        button8.setVisible(true);
        button9.setSize(50, 50);
        button9.setLocation(235, 150);
        button9.setVisible(true);
        buttonComma.setSize(50, 50);
        buttonComma.setLocation(235, 300);
        buttonComma.setVisible(true);
        equalButton.setSize(50, 50);
        equalButton.setLocation(285, 300);
        equalButton.setVisible(true);
        additionButton.setSize(50, 50);
        additionButton.setLocation(285, 250);
        additionButton.setVisible(true);
        minusButton.setSize(50, 50);
        minusButton.setLocation(285, 200);
        minusButton.setVisible(true);
        multiplicationButton.setSize(50, 50);
        multiplicationButton.setLocation(285, 150);
        multiplicationButton.setVisible(true);
        divideButton.setSize(50, 50);
        divideButton.setLocation(285, 100);
        divideButton.setVisible(true);
        deleteButton.setSize(50, 50);
        deleteButton.setLocation(135, 300);
        deleteButton.setVisible(true);
        resetButton.setSize(50, 50);
        resetButton.setLocation(235, 100);
        resetButton.setVisible(true);

        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonComma);
        frame.add(equalButton);
        frame.add(additionButton);
        frame.add(minusButton);
        frame.add(multiplicationButton);
        frame.add(divideButton);
        frame.add(deleteButton);
        frame.add(resetButton);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("0");

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("9");
            }
        });
        buttonComma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append(",");
            }
        });
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("+");

            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("/");
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(field.getText().contains("+")){
                    statement = field.getText().split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 + num2;

                    total = Integer.toString((int) totalValue);
                    field.setText(total);
                }
                else if(field.getText().contains("-")){
                    statement = field.getText().split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 - num2;

                    total = Integer.toString((int) totalValue);
                    field.setText(total);
                }
                else if(field.getText().contains("/")){
                    statement = field.getText().split("\\/");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 / num2;

                    total = Integer.toString((int) totalValue);
                    field.setText(total);
                }
                else if(field.getText().contains("*")){
                    statement = field.getText().split("\\*");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalValue = num1 * num2;

                    total = Integer.toString((int) totalValue);
                    field.setText(total);
                }
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("-");
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.append("*");
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(null);
            }
        });

        frame.setVisible(true);

    }

}
class DisplayValue{
    public int totalValue = 0;

    public DisplayValue(int totalValue){
        this.totalValue = totalValue;
    }
    public int getTotalValue(){
        return totalValue;
    }

}