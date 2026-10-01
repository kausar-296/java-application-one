import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class HomePage extends JFrame{
    
    //components
    Button b1,b2,B1,B2,B3,x1,x2,x3,x4,x5,x6;
    Label l1,l2;

    //images
    
    

 ImageIcon i2 = new ImageIcon("images/noodles.png");
   		
    ImageIcon i3 = new ImageIcon("images/cake.png");
 ImageIcon i4 = new ImageIcon("images/juice.png");
    ImageIcon i5 = new ImageIcon("images/fruit.png");
    ImageIcon i6 = new ImageIcon("images/sweet.png");

  



  



    public HomePage(String name){
        
	//written matter inside the components

	setTitle("HOME PAGE");
        setLayout(new GridBagLayout());
	l1 = new Label(name);
        b1=new Button("SIGN OUT");
        b2=new Button("DELETE");
	l2=new Label("RUNNING OUT OF INGRIDENTS? WANT TO THROW A PARTY? JUST PICK AND CLICK.");
	B1=new Button("ACCOUNT DETAILS");
	B2=new Button("CART");
	B3=new Button("HELP");

JButton x2=new JButton(i2);
JButton x3=new JButton(i3);
JButton x4=new JButton(i4);
JButton x5=new JButton(i5);
JButton x6=new JButton(i6);

	//setting colours
	

	
	Color b=new Color(172,136,134);
        Color a=new Color(146,96,93);
	l1.setForeground(Color.WHITE);
	l1.setBackground(a);
	b1.setForeground(Color.WHITE);
	b1.setBackground(b);
	b2.setForeground(Color.WHITE);
	b2.setBackground(b);
	B1.setForeground(Color.WHITE);
	B1.setBackground(b);
	B2.setForeground(Color.WHITE);
	B2.setBackground(b);
	B3.setForeground(Color.WHITE);
	B3.setBackground(b);

l2.setForeground(Color.WHITE);
	l2.setBackground(a);

x2.setBackground(Color.WHITE);
x2.setForeground(Color.WHITE);
x3.setBackground(Color.WHITE);
x3.setForeground(Color.WHITE);
x4.setBackground(Color.WHITE);
x4.setForeground(Color.WHITE);
x5.setBackground(Color.WHITE);
x5.setForeground(Color.WHITE);
x6.setBackground(Color.WHITE);
x6.setForeground(Color.WHITE);

	//setting panels
	
	JPanel BP = new JPanel(new GridLayout(2,3));
	BP.setBackground(Color.WHITE);

	JPanel SP = new JPanel(new GridLayout(1,6));
	SP.setBackground(a);

	JPanel MP = new JPanel(new FlowLayout());
	MP.setBackground(a);

	JPanel RSP = new JPanel(new FlowLayout());
	RSP.setBackground(a);

	
	

	//adding panels

	GridBagConstraints gbc = new GridBagConstraints();

	gbc.gridx =0;
	gbc.gridy = 0;       
	gbc.weightx = 0.0;
	gbc.weighty = 0.0;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	add(SP, gbc);

	gbc.gridx = 0;
	gbc.gridy = 1;       
	gbc.weightx = 0.0;
	gbc.weighty = 0.0;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	add(MP, gbc);
	
	gbc.gridx = 0;
	gbc.gridy = 2;     
	gbc.weightx = 0.0;
	gbc.weighty = 0.0;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	add(RSP, gbc);



// Wrap BP in a scroll pane
JScrollPane scrollPane = new JScrollPane(BP);

// Always show vertical scrollbar
scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

scrollPane.getVerticalScrollBar().setUnitIncrement(16); // smooth scroll

// Optional: show horizontal scrollbar only if needed
scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

// Add scrollPane to the frame instead of BP
//add(scrollPane);



	
	gbc.gridx =0;
	gbc.gridy = 3;
	gbc.weightx = 1.0;
	gbc.weighty = 1.0;   
	gbc.fill = GridBagConstraints.BOTH;
	add(scrollPane, gbc);





	for(int i=1;i<=6;i++)
	{
		if(i==2){SP.add(b1);}
		else if(i==4){SP.add(b2);}
		else if(i==6){SP.add(l1);}
		else{SP.add(new JLabel());}
	}

	MP.add(l2);


RSP.add(B1); RSP.add(new JLabel());
RSP.add(B2);RSP.add(new JLabel());RSP.add(B3);

	for(int j=1;j<=6;j++)
	{
		if(j==2){BP.add(x2);}
		else if(j==3){BP.add(x3);}
		else if(j==4){BP.add(x4);}
		else if(j==5){BP.add(x5);}
		else if(j==6){BP.add(x6);}
		else{BP.add(new JLabel());}



	}




	//setting fonts
	
	l1.setFont(new Font("Arial", Font.BOLD, 20));
	

	//action of buttons

	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e1) {
			dispose(); 
			new LoginPage(); 
		}
	});

	
	x2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e3) {
			//String name = t1.getText().trim();
			dispose();
			new CategoriesPage(1, name);
		}
	});

	x3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e4) {
			//String name = t1.getText().trim();
			dispose();
			new CategoriesPage(2,name);
		}
	});

x4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e4) {
			//String name = t1.getText().trim();
			dispose();
			new CategoriesPage(3, name);
		}
	});

x5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e4) {
			//String name = t1.getText().trim();
			dispose();
			new CategoriesPage(4,name);
		}
	});

x6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e4) {
			//String name = t1.getText().trim();
			dispose();
			new CategoriesPage(5, name);
		}
	});







	b2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e2) {
        String target = name + "_"; // match lines starting with name_
  
        try {
            java.io.File inputFile = new java.io.File("USERS.txt");
            java.io.File tempFile = new java.io.File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(target)) {
                    deleted = true; // skip this line
                    continue;
                }
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            // Replace original file with temp file
            if (inputFile.delete()) {
                tempFile.renameTo(inputFile);
            }
dispose();
            if (deleted) {
                JOptionPane.showMessageDialog(null, "Profile deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Profile not found.");
            }

            
            new LoginPage(); // back to login

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error deleting profile: " + ex.getMessage());
        }
    }
});




// Action for ACCOUNT DETAILS button (B1)
B1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose(); 
        new AccountPage(name); // open account details page with the user's name
    }
});




// Action for CART button (B2)
B2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose();
        new CartPage(name); // open cart page with the user's name
    }
});


// Action for HOME PAGE button (B3) → now leads to H.java
B3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose(); 
        new HelpPage(name); // open H.java with the user's name
    }
});





	//setting the frame
	
	setSize(1250,650);
	setVisible(true);
	getContentPane().setBackground(a);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}



 //main class

    public static void main(String [] arg){
        new HomePage("KAUSAR");
    }
}
