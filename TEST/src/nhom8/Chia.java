package nhom8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chia extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnChia;
    private JLabel lblKetQua;

    public Chia() {
        setTitle("Chia Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo các thành phần
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        btnChia = new JButton("Chia");
        lblKetQua = new JLabel("Kết quả: ");

        // Sắp xếp giao diện
        setLayout(new GridLayout(4, 2, 5, 5));
        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(new JLabel(""));
        add(btnChia);
        add(lblKetQua);

        // Xử lý sự kiện khi nhấn nút
        btnChia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());

                    if (so2 == 0) {
                        lblKetQua.setText("Không thể chia cho 0");
                    } else {
                        double ketQua = so1 / so2;
                        lblKetQua.setText("Kết quả: " + ketQua);
                    }
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Chia().setVisible(true));
    }
}

