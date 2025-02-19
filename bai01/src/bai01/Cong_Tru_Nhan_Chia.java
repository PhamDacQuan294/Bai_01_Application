package bai01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//public class Cong_Tru_Nhan_Chia extends JFrame {
//    
//}

public class Cong_Tru_Nhan_Chia extends JFrame implements ActionListener {

    private JTextField display;
    private StringBuilder currentInput;
    private String operator;
    private double result;

    public Cong_Tru_Nhan_Chia() {
        setTitle("Máy tính");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        currentInput = new StringBuilder();
        operator = "";
        result = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789.".contains(command)) {
            currentInput.append(command);
            display.setText(currentInput.toString());
        } else if ("+-*/".contains(command)) {
            operator = command;
            result = Double.parseDouble(currentInput.toString());
            currentInput.setLength(0);
        } else if ("=".equals(command)) {
            double secondOperand = Double.parseDouble(currentInput.toString());
            switch (operator) {
                case "+":
                    result += secondOperand;
                    break;
                case "-":
                    result -= secondOperand;
                    break;
                case "*":
                    result *= secondOperand;
                    break;
                case "/":
                    result /= secondOperand;
                    break;
            }
            display.setText(String.valueOf(result));
            saveResultToFile(result);
            currentInput.setLength(0);
            operator = "";
        }
    }

    private void saveResultToFile(double result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ket_ket.txt", true))) {
            writer.write("Kết quả: " + result);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi ghi file!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }