import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class AccountPage extends JFrame{
    
    //components
    Button b1,b2,b3;
    Label l1,L1,L2,L3,L4;

    

Color b=new Color(172,136,134);
       		 Color a=new Color(146,96,93);

    



    public AccountPage(String name){
        
	//written matter inside the components

	setTitle("ACCOUNT DETAILS");
        setLayout(new GridBagLayout());
	l1 = new Label(name);
        b1=new Button("SIGN OUT");
        b2=new Button("DELETE");
	b3=new Button("HOME PAGE");
	L1 = new Label("NAME:");
L2 = new Label("PASSWORD:");
L3 = new Label("*****");
		L4 = new Label(name);




	//setting colours
	
	l1.setForeground(Color.WHITE);
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	b3.setForeground(Color.WHITE);
		
	//setting panels
	
	JPanel BP = new JPanel(new GridLayout(15,5));
	JPanel SP = new JPanel(new GridLayout(1,6));
	JPanel MP = new JPanel(new GridLayout(1,3));
	



	//adding panels

	GridBagConstraints gbc = new GridBagConstraints();

	gbc.gridx = 0;
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
	gbc.weightx = 1.0;
	gbc.weighty = 1.0;   
	gbc.fill = GridBagConstraints.BOTH;
	add(BP, gbc);

	for(int i=1;i<=6;i++)
	{
		if(i==2){SP.add(b1);}
		else if(i==4){SP.add(b2);}
		else if(i==6){SP.add(l1);}
		else{SP.add(new JLabel());}
	}

	for(int k=1;k<=3;k++)
	{
		if(k==2){MP.add(b3);}
		else{MP.add(new JLabel());}
	}



	for(int j=1;j<=75;j++)
	{
		if(j==12){BP.add(L1);}
		else if(j==14){BP.add(L4);}
		else if(j==22){BP.add(L2);}
		else if(j==24){BP.add(L3);}
		else{BP.add(new JLabel());}
	}


	

	L1.setForeground(a);
	L2.setForeground(a);
	L3.setForeground(a);
L4.setForeground(a);
		//setting fonts
	
	l1.setFont(new Font("Arial", Font.BOLD, 20));



	



	//setting colours
	

		
		
		l1.setBackground(a);
		b1.setBackground(b);
		b2.setBackground(b);
		b3.setBackground(b);
		L1.setBackground(Color.WHITE);
		L2.setBackground(Color.WHITE);
		L3.setBackground(Color.WHITE);
		BP.setBackground(Color.WHITE);
		SP.setBackground(a);
		MP.setBackground(b);
		getContentPane().setBackground(a);
	

L4.setBackground(Color.WHITE);



	//action of buttons

	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e1) {
			dispose(); 
			new LoginPage(); 
		}
	});

	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e2) {
			dispose(); 
			new HomePage(name); 
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








	//setting the frame
	
	setSize(600,600);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}



 //main class

    public static void main(String [] arg){
        new AccountPage("KAUSAR");
    }
}
