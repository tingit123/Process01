package nhom8;

import javax.swing.*;

public class nhan extends JFrame {
    public nhan() {
        setTitle("Phép Nhân");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Số 1:");
        lbl1.setBounds(30, 20, 50, 25);
        add(lbl1);

        JTextField txt1 = new JTextField();
        txt1.setBounds(90, 20, 150, 25);
        add(txt1);

        JLabel lbl2 = new JLabel("Số 2:");
        lbl2.setBounds(30, 60, 50, 25);
        add(lbl2);

        JTextField txt2 = new JTextField();
        txt2.setBounds(90, 60, 150, 25);
        add(txt2);

        JButton btn = new JButton("Nhân");
        btn.setBounds(30, 100, 80, 30);
        add(btn);

        JLabel result = new JLabel("Kết quả: ");
        result.setBounds(130, 100, 150, 30);
        add(result);

        btn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                result.setText("Kết quả: " + (a * b));
            } catch (NumberFormatException ex) {
                result.setText("Lỗi nhập số!");
            }
        });
    }

    public static void main(String[] args) {
        new nhan().setVisible(true);
    }
}
