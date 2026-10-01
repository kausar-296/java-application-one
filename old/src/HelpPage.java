import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;  // for FileWriter and IOException

public class HelpPage extends JFrame {

    // components
    Button reportBtn;
    Label issueLabel;
    TextField issueField;

    Color b = new Color(172,136,134);
    Color a = new Color(146,96,93);

    private String username; // store username for file writing

    public HelpPage(String name) {
        this.username = name; // save username
        setTitle("HELP PAGE");
        setLayout(new GridBagLayout());

        // top bar components
        Label l1 = new Label(name);
        Button b1 = new Button("SIGN OUT");
        Button b2 = new Button("DELETE");
        Button b3 = new Button("HOME PAGE");

        // help components (in BP only)
        issueLabel = new Label("What's the issue?");
        issueField = new TextField(30);
        reportBtn = new Button("REPORT ISSUE");

        // colors
        l1.setForeground(Color.WHITE);
        l1.setBackground(a);
        b1.setForeground(Color.WHITE);
        b1.setBackground(b);
        b2.setForeground(Color.WHITE);
        b2.setBackground(b);
        b3.setForeground(Color.WHITE);
        b3.setBackground(b);

        issueLabel.setForeground(a);
        issueLabel.setBackground(Color.WHITE);
        issueField.setBackground(Color.WHITE);
        reportBtn.setForeground(Color.WHITE);
        reportBtn.setBackground(b);

        // panels
        JPanel BP = new JPanel(new GridLayout(3,1)); // exactly 3 rows: label, textfield, button
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

        // add help components into BP
        BP.add(issueLabel);
        BP.add(issueField);
        BP.add(reportBtn);

        // fonts
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        issueLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // actions
        b1.addActionListener(e -> {
            dispose();
            new LoginPage(); // back to login
        });

        b3.addActionListener(e -> {
            dispose();
            new HomePage(name); // back to home
        });

        b2.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Delete action not implemented for Help page.");
        });

        reportBtn.addActionListener(e -> {
            String issue = issueField.getText().trim();
            if(issue.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter an issue before reporting.");
            } else {
                // Save issue to file in format username_issue
                try (FileWriter fw = new FileWriter("issues.txt", true)) {
                    fw.write(username + "_" + issue + System.lineSeparator());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving issue: " + ex.getMessage());
                }

                JOptionPane.showMessageDialog(null, "Issue reported: " + issue);
                issueField.setText(""); // clear after reporting
            }
        });

        // frame settings
        setSize(600,400);
        setVisible(true);
        getContentPane().setBackground(a);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // main class
    public static void main(String[] args) {
        new HelpPage("KAUSAR");
    }
}
