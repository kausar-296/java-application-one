import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class CategoriesPage extends JFrame{
    
    //components
    Button b1,b2,B1,B2,B3,x1,x2,x3,x4;
    Label l1,l2,X1,X2,X3,X4;



ImageIcon i1,i2,i3,i4;








      



    public CategoriesPage(int preferance, String name){
        
	//written matter inside the components


if(preferance==1){setTitle("NOODLES");}
else if(preferance==2){setTitle("CAKE");}
else if(preferance==3){setTitle("JUICES AND COLD DRINKS");}
else if(preferance==4){setTitle("FRUITS AND VEGETABLES");}
else{setTitle("CHOCLATE AND SWEETS");}




	

if(preferance==1){
i1 = new ImageIcon("images/d1.png");
i2 = new ImageIcon("images/d2.png");
i3 = new ImageIcon("images/d3.png");
i4 = new ImageIcon("images/d4.png");

}
else if(preferance==2){
i1 = new ImageIcon("images/e1.png");
i2 = new ImageIcon("images/e2.png");
i3 = new ImageIcon("images/e3.png");
i4 = new ImageIcon("images/e4.png");

}
else if(preferance==3){
i1 = new ImageIcon("images/f1.png");
i2 = new ImageIcon("images/f2.png");
i3 = new ImageIcon("images/f3.png");
i4 = new ImageIcon("images/f4.png");

}
else if(preferance==4){
i1 = new ImageIcon("images/g1.png");
i2 = new ImageIcon("images/g2.png");
i3 = new ImageIcon("images/g3.png");
i4 = new ImageIcon("images/g4.png");

}
else{
i1 = new ImageIcon("images/K1.png");
i2 = new ImageIcon("images/K2.png");
i3 = new ImageIcon("images/K3.png");
i4 = new ImageIcon("images/K4.png");
}









        setLayout(new GridBagLayout());
	l1 = new Label(name);
        b1=new Button("SIGN OUT");
        b2=new Button("DELETE");



//	l2=new Label("RUNNING OUT OF INGRIDENTS? WANT TO THROW A PARTY? JUST PICK AND CLICK.");



	B1=new Button("ACCOUNT DETAILS");
	B2=new Button("CART");
	B3=new Button("HOME");


JLabel X1=new JLabel(i1);
JLabel X2=new JLabel(i2);
JLabel X3=new JLabel(i3);
JLabel X4=new JLabel(i4);




JButton x1=new JButton("SELECT");
JButton x2=new JButton("SELECT");
JButton x3=new JButton("SELECT");
JButton x4=new JButton("SELECT");



JLabel left1,left2,left3,left4,right1,right2,right3,right4;



if(preferance==1){
left1=new JLabel("Yaba Chinese Fast Food");
right1=new JLabel("Special Chicken Noodles");
left2=new JLabel("Yaba Chinese Fast Food");
right2=new JLabel("Veg Manchurian Noodles");
left3=new JLabel("Yaba Chinese Fast Food");
right3=new JLabel("Veg Noodles");
left4=new JLabel("Yaba Chinese Fast Food");
right4=new JLabel("Veg Schezwan Noodles");
}
else if(preferance==2){
left1=new JLabel("Tawakkal Bakery & Sweets");
right1=new JLabel("Butterscotch Cake [500 gms]");
left2=new JLabel("Tawakkal Bakery & Sweets");
right2=new JLabel("Pineapple Cake [500 gms]");
left3=new JLabel("Tawakkal Bakery & Sweets");
right3=new JLabel("Black Forest Cake [1 kg]");
left4=new JLabel("Tawakkal Bakery & Sweets");
right4=new JLabel("Plain Chocolate Cake [500gms]");
}
else if(preferance==3){
left1=new JLabel("Red Bull Energy Drink, 250 ML Can, Mixed Fruit");
right1=new JLabel("₹125.00 (₹50.00 /100 ml)");
left2=new JLabel("Maaza Mango Drink, Original Flavour, 1.2 L PET Bottle");
right2=new JLabel("₹66.00 (₹5.50 /100 ml)");
left3=new JLabel("Paper Boat Swing Slurpy Mango Juice, 125ml");
right3=new JLabel("₹9.00 (₹7.20 /100 ml)");
left4=new JLabel("Thums Up Soft Drink Can, 300 ml");
right4=new JLabel("₹40.00 (₹13.33 /100 ml)");
}
else if(preferance==4){
left1=new JLabel("Fresh Onion, 1kg");
right1=new JLabel("₹34.00 (₹3.40 /100 g)");
left2=new JLabel("Fresh Ginger (Adrak), 100g");
right2=new JLabel(" ₹12.00 (₹12.00 /100 g)");
left3=new JLabel("Fresh Coriander Leaves, 100 g");
right3=new JLabel(" ₹12.00 (₹12.00 /100 g)");
left4=new JLabel("Fresh Cucumber, 500g");
right4=new JLabel("₹14.00 (₹2.80 /100 g)");
}
else{
left1=new JLabel("Cadbury Dairy Milk Chocolate Bar, 20.2g");
right1=new JLabel("₹18.00 (₹89.11 /100 g)");
left2=new JLabel("Cadbury 5 Star Chocolate Bar, 35.2 g");
right2=new JLabel("₹20.00 (₹56.82 /100 g)");
left3=new JLabel("Bikano Diwali Gift Pack Utsav 760g | Premium Sweets & Namkeen Hamper for Gifting, Family & Festive Celebrations");
right3=new JLabel("₹275.00");
left4=new JLabel("Tic Tac Mint Flavor Candy, 13.7g");
right4=new JLabel("₹18.00 (₹131.39 /100 g)");
}

















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

//l2.setForeground(Color.WHITE);
//	l2.setBackground(a);

x1.setBackground(b);
x1.setForeground(Color.WHITE);
x2.setBackground(b);
x2.setForeground(Color.WHITE);
x3.setBackground(b);
x3.setForeground(Color.WHITE);
x4.setBackground(b);
x4.setForeground(Color.WHITE);

	//setting panels
	
	JPanel BP = new JPanel(new GridLayout(4,2));
	BP.setBackground(Color.WHITE);

	JPanel SP = new JPanel(new GridLayout(1,6));
	SP.setBackground(a);

	JPanel MP = new JPanel(new FlowLayout());
	MP.setBackground(a);

	JPanel RSP = new JPanel(new FlowLayout());
	RSP.setBackground(a);

	JPanel BMP1 = new JPanel(new GridLayout(3,1));
	BMP1.setBackground(Color.WHITE);

	JPanel BMP2 = new JPanel(new GridLayout(3,1));
	BMP2.setBackground(Color.WHITE);

	JPanel BMP3 = new JPanel(new GridLayout(3,1));
	BMP3.setBackground(Color.WHITE);

	JPanel BMP4 = new JPanel(new GridLayout(3,1));
	BMP4.setBackground(Color.WHITE);

	

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

//	MP.add(l2);


RSP.add(B1); RSP.add(new JLabel());
RSP.add(B2);RSP.add(new JLabel());RSP.add(B3);

	for(int j=1;j<=8;j++)
	{
		if(j==1){BP.add(X1);}
		else if(j==2){BP.add(BMP1);}
		else if(j==3){BP.add(X2);}
		else if(j==4){BP.add(BMP2);}
		else if(j==5){BP.add(X3);}
		else if(j==6){BP.add(BMP3);}
		else if(j==7){BP.add(X4);}
		else if(j==8){BP.add(BMP4);}

		else{BP.add(new JLabel());}



	}

for(int A=1;A<=3;A++)
	{
		if(A==1){BMP1.add(left1);}
		else if(A==2){BMP1.add(right1);}
		else if(A==3){BMP1.add(x1);}
	}

for(int Q=1;Q<=3;Q++)
	{
		if(Q==1){BMP2.add(left2);}
		else if(Q==2){BMP2.add(right2);}
		else if(Q==3){BMP2.add(x2);}
	}

for(int W=1;W<=3;W++)
	{
		if(W==1){BMP3.add(left3);}
		else if(W==2){BMP3.add(right3);}
		else if(W==3){BMP3.add(x3);}
	}

for(int R=1;R<=3;R++)
	{
		if(R==1){BMP4.add(left4);}
		else if(R==2){BMP4.add(right4);}
		else if(R==3){BMP4.add(x4);}
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

	

B3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e4) {
			//String name = t1.getText().trim();
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


// Actions for SELECT buttons
x1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose(); 
        new DetailsPage(1, preferance, name); // opt = 1
    }
});

x2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose(); 
        new DetailsPage(2, preferance, name); // opt = 2
    }
});

x3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose(); 
        new DetailsPage(3, preferance, name); // opt = 3
    }
});

x4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        dispose(); 
        new DetailsPage(4, preferance, name); // opt = 4
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







	//setting the frame
	
	setSize(1250,650);
	setVisible(true);
	getContentPane().setBackground(a);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}



 //main class

    public static void main(String [] arg){
        new CategoriesPage(3, "KAUSAR");
    }
}
