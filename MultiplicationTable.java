import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable {
    MultiplicationTable(){
        JFrame frame=new JFrame();
        frame.setSize(400,800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font f=new Font("Arial",Font.BOLD,14);
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        Cursor textcursor = new Cursor(Cursor.MOVE_CURSOR);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Multiplication Table");
        JLabel label=new JLabel();
        ImageIcon icon=new ImageIcon("image.jpg");
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        label.setIcon(icon);
        label.setBounds(25,0,icon.getIconWidth(),icon.getIconHeight());
        JLabel label1=new JLabel("Enter the number:");
        label1.setBounds(10,300,200,20);
        label1.setForeground(Color.white);
        label1.setFont(f);
        JTextField text=new JTextField(10);
        text.setBounds(130,300,110,20);
        text.setBackground(Color.darkGray);
        text.setForeground(Color.WHITE);
        text.setCursor(textcursor);
        text.setToolTipText("Enter a number");
        JButton button=new JButton("Clear");
        button.setBounds(145,330,75,20);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.white);
        button.setFont(f);
        button.setCursor(c);
        JTextArea area=new JTextArea();
        area.setBounds(10,370,365,300);
        area.setFont(f);
        area.setBackground(Color.darkGray);
        area.setForeground(Color.white);
        panel.add(label);
        panel.add(label1);
        panel.add(text);
        panel.add(button);
        panel.add(area);
        frame.setIconImage(icon.getImage());
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                area.setText("");
                String a=text.getText();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter a number","message",0);
                }
                else {
                    try {
                        area.setText("The Result is:\n");
                        int A=Integer.parseInt(a);
                        for(int i=1;i<11;i++){
                            String s=area.getText();
                            int fact=A*i;
                            area.setText(s+"\n"+a+" x "+String.valueOf(i)+" = "+String.valueOf(fact));
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null,"Please enter a valid number","message",0);
                    }
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text.setText("");
                area.setText("");
            }
        });
    }
    public static void main(String[] args) {
        MultiplicationTable imageLabel=new MultiplicationTable();
    }
}
