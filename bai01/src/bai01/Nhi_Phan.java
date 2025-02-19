import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nhi_Phan extends JFrame {
    private JTextField inputField;
    private JButton convertButton;
    private JLabel resultLabel;

    public Nhi_Phan() {
        setTitle("Bộ chuyển đổi thập phân sang nhị phân");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nhập một số thập phân:"));
        inputField = new JTextField(10);
        add(inputField);
        
        convertButton = new JButton("Chuyển thành");
        add(convertButton);
        
        resultLabel = new JLabel("Biểu diễn nhị phân sẽ xuất hiện ở đây");
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertDecimalToBinary();
            }
        });
    }

    private void convertDecimalToBinary() {
        try {
            int decimalNumber = Integer.parseInt(inputField.getText());
            String binaryString = Integer.toBinaryString(decimalNumber);
            resultLabel.setText("Nhị phân: " + binaryString);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Số thập phân không hợp lệ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Nhi_Phan().setVisible(true);
        });
    }
}
