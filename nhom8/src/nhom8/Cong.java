package nhom8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cong extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnCong;
    private JLabel lblKetQua;

    public Cong() {
        setTitle("Cộng hai số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa màn hình

        // Tạo các thành phần
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        btnCong = new JButton("Cộng");
        lblKetQua = new JLabel("Kết quả: ");

        // Sắp xếp giao diện
        setLayout(new GridLayout(4, 2, 5, 5));
        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(new JLabel("")); // khoảng trống
        add(btnCong);
        add(lblKetQua);

        // Xử lý sự kiện
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double tong = so1 + so2;
                    lblKetQua.setText("Kết quả: " + tong);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Cong.this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Cong().setVisible(true);
        });
    }
}
