package nhom8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tru extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnTru;

    public Tru() {
        setTitle("Tính hiệu hai số");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa màn hình

        // Tạo các thành phần giao diện
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        JLabel lblKetQua = new JLabel("Kết quả:");

        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        txtKetQua = new JTextField(10);
        txtKetQua.setEditable(false); // không cho nhập kết quả

        btnTru = new JButton("Tính");

        // Gắn sự kiện cho nút
        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double hieu = so1 - so2;
                    txtKetQua.setText(String.valueOf(hieu));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thiết lập bố cục giao diện
        setLayout(new GridLayout(4, 2, 10, 10));
        add(lblSo1); add(txtSo1);
        add(lblSo2); add(txtSo2);
        add(lblKetQua); add(txtKetQua);
        add(new JLabel()); add(btnTru); // để canh lề nút

        setVisible(true);
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        new Tru();
    }
}
