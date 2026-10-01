import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CartPage extends JFrame {

    // components
    Button b1, b2, b3;
    Label l1, L1, L2;

    public CartPage(String name) {

        setTitle("CART");
        setLayout(new GridBagLayout());

        // top bar components
        l1 = new Label(name);
        b1 = new Button("SIGN OUT");
        b2 = new Button("DELETE");
        b3 = new Button("HOME PAGE");

        // cart labels
        L1 = new Label("IN CART:");
        L2 = new Label("BOUGHT:");

        // colors
        Color b = new Color(172,136,134);
        Color a = new Color(146,96,93);

        l1.setForeground(Color.WHITE);
        l1.setBackground(a);
        b1.setForeground(Color.WHITE);
        b1.setBackground(b);
        b2.setForeground(Color.WHITE);
        b2.setBackground(b);
        b3.setForeground(Color.WHITE);
        b3.setBackground(b);

        L1.setForeground(a);
        L1.setBackground(Color.WHITE);
        L2.setForeground(a);
        L2.setBackground(Color.WHITE);

        // panels
        JPanel BP = new JPanel(new GridLayout(2,1)); // just two rows
        JPanel SP = new JPanel(new GridLayout(1,6));
        JPanel MP = new JPanel(new GridLayout(1,3));

        BP.setBackground(Color.WHITE);
        SP.setBackground(a);
        MP.setBackground(b);

        // layout constraints
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(SP, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(MP, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.weightx = 1.0; gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(BP, gbc);

        // fill SP (top bar)
        for(int i=1;i<=6;i++) {
            if(i==2){SP.add(b1);}
            else if(i==4){SP.add(b2);}
            else if(i==6){SP.add(l1);}
            else{SP.add(new JLabel());}
        }

        // fill MP (middle bar)
        for(int k=1;k<=3;k++) {
            if(k==2){MP.add(b3);}
            else{MP.add(new JLabel());}
        }

        // add cart labels
        BP.add(L1);
        BP.add(L2);

        // fonts
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        L1.setFont(new Font("Arial", Font.BOLD, 18));
        L2.setFont(new Font("Arial", Font.BOLD, 18));

        // actions
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                dispose();
                new LoginPage(); // back to login
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                dispose();
                new HomePage(name); // back to home
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                // optional: clear cart logic here
                JOptionPane.showMessageDialog(null, "Cart cleared (placeholder).");
            }
        });

        // frame settings
        setSize(600,600);
        setVisible(true);
        getContentPane().setBackground(a);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // main class
    public static void main(String [] arg){
        new CartPage("KAUSAR");
    }
}
