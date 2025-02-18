package bai01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Cv_Dt_Hcn extends JFrame {
    private JTextField sideLengthField;
    private JLabel perimeterLabel;
    private JLabel areaLabel;

    public Cv_Dt_Hcn() {
        setTitle("Tính chu vi và diện tích hình vuông");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 5, 5));

        JLabel sideLengthLabel = new JLabel("Nhập cạnh hình vuông:");
        sideLengthField = new JTextField();
        JButton calculateButton = new JButton("Tính toán");
        perimeterLabel = new JLabel("Chu vi: ");
        areaLabel = new JLabel("Diện tích: ");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSquareProperties();
            }
        });

        add(sideLengthLabel);
        add(sideLengthField);
        add(calculateButton);
        add(new JLabel());
        add(perimeterLabel);
        add(areaLabel);
    }

    private void calculateSquareProperties() {
        try {
            double sideLength = Double.parseDouble(sideLengthField.getText());
            if (sideLength <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double perimeter = 4 * sideLength;
            double area = sideLength * sideLength;

            perimeterLabel.setText("Chu vi: " + perimeter);
            areaLabel.setText("Diện tích: " + area);

            saveResultToFile(sideLength, perimeter, area);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveResultToFile(double sideLength, double perimeter, double area) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ket_qua.txt", true))) {
            writer.write("Cạnh hình vuông: " + sideLength + " - Chu vi: " + perimeter + " - Diện tích: " + area);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi ghi file!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Cv_Dt_Hcn().setVisible(true);
        });
    }
}
