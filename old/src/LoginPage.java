import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;



public class LoginPage extends JFrame{
    
    //components
    Label l1,l2,l3,L1,L2;
    TextField t1,t2;
    Button b1,b2;

	 ImageIcon i1 = new ImageIcon("images/stanley.png");
	JLabel I1 = new JLabel(i1);




    public LoginPage(){
        
	//written matter inside the components

	setTitle("LOGIN");
        setLayout(new GridLayout(2,1));
	JPanel login = new JPanel(new GridLayout(15,5));
	JPanel info = new JPanel(new FlowLayout());
        l1=new Label("--DETAILS--");
        l2=new Label("NAME:");
        l3=new Label("PASSWORD:");
        t1=new TextField(30);
        t2=new TextField(30);
        b1=new Button("SAVE");
	b2=new Button("CONTINUE");
	L1=new Label("FACULTY NAME: DR. D. RADHIKA  DEPARTMENT: CSE");
	L2=new Label("DONE BY: KAUSAR JEHAN   CLASS: CSE-C   ROLL NUMBER: 160624733156");




	//setting colours
	
	Color b=new Color(172,136,134);
        Color a=new Color(146,96,93);
	l1.setForeground(Color.WHITE);
	l2.setForeground(Color.WHITE);
	l3.setForeground(Color.WHITE);
	t1.setForeground(Color.WHITE);
	t2.setForeground(Color.WHITE);
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	l1.setBackground(a);
	l2.setBackground(a);
	l3.setBackground(a);
	t1.setBackground(b);
	t2.setBackground(b);
	b1.setBackground(b);
	b2.setBackground(b);
	login.setBackground(a);
	L1.setForeground(Color.WHITE);
	L1.setBackground(a);
	L2.setForeground(Color.WHITE);
	L2.setBackground(a);
	info.setBackground(a);


	//setting fonts

	l1.setFont(new Font("Arial", Font.BOLD, 20));
	l2.setFont(new Font("Arial", Font.PLAIN, 16));
	l3.setFont(new Font("Arial", Font.PLAIN, 16));
	b1.setFont(new Font("Arial", Font.BOLD, 16));
	b2.setFont(new Font("Arial", Font.BOLD, 16));
	t1.setFont(new Font("Arial", Font.PLAIN, 14));
	t2.setFont(new Font("Arial", Font.PLAIN, 14));
	L1.setFont(new Font("Arial", Font.PLAIN, 14));
	L2.setFont(new Font("Arial", Font.PLAIN, 14));


	
	//adding components
	
	for(int j=1;j<=2;j++)
	{
		if(j==1){add(info);}
		if(j==2){add(login);}
	}

	info.add(L1);info.add(L2);info.add(I1);
	
	for(int i=1;i<=75;i++)
	{
		if(i==3){login.add(l1);}
		else if(i==12){login.add(l2);}
		else if(i==13){login.add(t1);}
		else if(i==22){login.add(l3);}
		else if(i==23){login.add(t2);}
		else if(i==42){login.add(b1);}
		else if(i==44){login.add(b2);}
		else{login.add(new JLabel());}
	}
	
	//setting the frame
	
	setSize(600,600);
	setVisible(true);
	getContentPane().setBackground(a);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//action of buttons
	
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e1){
			save();
		}
	});

	b2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e2) {
        String name = t1.getText().trim();
        String pass = t2.getText().trim();
        String entry = name + "_" + pass;

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("USERS.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(entry)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
            return;
        }

        if (found) {
            dispose();
            new HomePage(name); // proceed to main menu
        } else {
            JOptionPane.showMessageDialog(null, "Invalid login! Please check your name and password.");
        }
    }
});


	
	
    }

    //save class
    
    private void save() {
    String un = t1.getText().trim();
    String pw = t2.getText().trim();

    // Check if username already exists
    try (BufferedReader br = new BufferedReader(new FileReader("USERS.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            if (line.startsWith(un + "_")) {
                JOptionPane.showMessageDialog(this, "Username already exists!");
                return;
            }
        }
    } catch (IOException ex) {
        // If file doesn't exist yet, that's fine — we'll create it later
    }

    // Validation
    if (un.isEmpty()) {
        JOptionPane.showMessageDialog(this, "name cannot be empty!");
        return;
    }
    if (pw.isEmpty()) {
        JOptionPane.showMessageDialog(this, "password cannot be empty!");
        return;
    }
    if (!isAlp(un)) {
        JOptionPane.showMessageDialog(this, "name needs to be alphabets ONLY!");
        return;
    }

    // Save new user
    try (FileWriter fw = new FileWriter("USERS.txt", true);
         BufferedWriter bw = new BufferedWriter(fw)) {

        bw.write(un + "_" + pw);
        bw.newLine();

        JOptionPane.showMessageDialog(this, "Data saved successfully!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error saving: " + ex.getMessage());
    }
}

		
		// checking classes
    public boolean isAlp(String s) {
        return s.matches("[a-zA-Z]+");
    }

    


    //main class

    public static void main(String [] arg){
        new LoginPage();
    }
}
