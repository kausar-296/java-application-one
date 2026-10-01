import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DetailsPage extends JFrame {

    public DetailsPage(int opt, int preference, String name) {
        setTitle("Item Details");

        // Layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Colors
        Color bg = new Color(146,96,93);
        Color btnColor = new Color(172,136,134);

        // Top bar
        JLabel userLabel = new JLabel(name);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel topPanel = new JPanel(new GridLayout(1,6));
        topPanel.setBackground(bg);
        JButton homeBtn = new JButton("HOME");
        JButton signOutBtn = new JButton("SIGN OUT");

        homeBtn.setBackground(btnColor);
        homeBtn.setForeground(Color.WHITE);
        signOutBtn.setBackground(btnColor);
        signOutBtn.setForeground(Color.WHITE);

JButton backBtn    = new JButton("BACK");

backBtn.setBackground(btnColor);
backBtn.setForeground(Color.WHITE);



for(int i=1;i<=6;i++)
	{ if(i==1){topPanel.add(backBtn);}
	else if(i==2){topPanel.add(homeBtn);}
		else if(i==4){topPanel.add(signOutBtn);}
		else if(i==6){topPanel.add(userLabel);}
		else{topPanel.add(new JLabel());}
	}


        
        
        

        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 1.0; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(topPanel, gbc);

        // Main panel: left image + right info
        JPanel mainPanel = new JPanel(new GridLayout(1,2));
        mainPanel.setBackground(Color.WHITE);

        // LEFT SIDE: image
        JLabel imageLabel = new JLabel();
        ImageIcon itemImage = null;

        if(preference==1){ // Noodles
            if(opt==1) itemImage = new ImageIcon("images/d1.png");
            else if(opt==2) itemImage = new ImageIcon("images/d2.png");
            else if(opt==3) itemImage = new ImageIcon("images/d3.png");
            else itemImage = new ImageIcon("images/d4.png");
        }
        else if(preference==2){ // Cakes
            if(opt==1) itemImage = new ImageIcon("images/e1.png");
            else if(opt==2) itemImage = new ImageIcon("images/e2.png");
            else if(opt==3) itemImage = new ImageIcon("images/e3.png");
            else itemImage = new ImageIcon("images/e4.png");
        }
        else if(preference==3){ // Juices
            if(opt==1) itemImage = new ImageIcon("images/f1.png");
            else if(opt==2) itemImage = new ImageIcon("images/f2.png");
            else if(opt==3) itemImage = new ImageIcon("images/f3.png");
            else itemImage = new ImageIcon("images/f4.png");
        }
        else if(preference==4){ // Fruits
            if(opt==1) itemImage = new ImageIcon("images/g1.png");
            else if(opt==2) itemImage = new ImageIcon("images/g2.png");
            else if(opt==3) itemImage = new ImageIcon("images/g3.png");
            else itemImage = new ImageIcon("images/g4.png");
        }
        else { // Chocolates
            if(opt==1) itemImage = new ImageIcon("images/K1.png");
            else if(opt==2) itemImage = new ImageIcon("images/K2.png");
            else if(opt==3) itemImage = new ImageIcon("images/K3.png");
            else itemImage = new ImageIcon("images/K4.png");
        }

        imageLabel.setIcon(itemImage);
        mainPanel.add(imageLabel);

        // RIGHT SIDE: info + buttons
JPanel infoPanel = new JPanel(new GridLayout(5,1));
infoPanel.setBackground(Color.WHITE);

JLabel itemName = new JLabel();
JLabel itemPrice = new JLabel();


      //pref=1
      
if(preference==1 && opt==1){
    itemName.setText("Special Chicken Noodles");
    itemPrice.setText("₹120.00");
}
else if(preference==1 && opt==2){
    itemName.setText("Veg Manchurian Noodles");
    itemPrice.setText("₹100.00");
}
else if(preference==1 && opt==3){
    itemName.setText("Veg Noodles");
    itemPrice.setText("₹90.00");
}
else if(preference==1 && opt==4){
    itemName.setText("Veg Schezwan Noodles");
    itemPrice.setText("₹110.00");
}

//pref=2
  
else if(preference==2 && opt==1){
    itemName.setText("Butterscotch Cake [500 gms]");
    itemPrice.setText("₹350.00");
}
else if(preference==2 && opt==2){
    itemName.setText("Pineapple Cake [500 gms]");
    itemPrice.setText("₹300.00");
}
else if(preference==2 && opt==3){
    itemName.setText("Black Forest Cake [1 kg]");
    itemPrice.setText("₹650.00");
}
else if(preference==2 && opt==4){
    itemName.setText("Plain Chocolate Cake [500 gms]");
    itemPrice.setText("₹400.00");
}

//pref=3

  
else if(preference==3 && opt==1){
    itemName.setText("Red Bull Energy Drink, 250 ML Can");
    itemPrice.setText("₹125.00 (₹50.00 /100 ml)");
}
else if(preference==3 && opt==2){
    itemName.setText("Maaza Mango Drink, 1.2 L PET Bottle");
    itemPrice.setText("₹66.00 (₹5.50 /100 ml)");
}
else if(preference==3 && opt==3){
    itemName.setText("Paper Boat Mango Juice, 125ml");
    itemPrice.setText("₹9.00 (₹7.20 /100 ml)");
}
else if(preference==3 && opt==4){
    itemName.setText("Thums Up Soft Drink Can, 300 ml");
    itemPrice.setText("₹40.00 (₹13.33 /100 ml)");
}


//pref=4
  
else if(preference==4 && opt==1){
    itemName.setText("Fresh Onion, 1kg");
    itemPrice.setText("₹34.00 (₹3.40 /100 g)");
}
else if(preference==4 && opt==2){
    itemName.setText("Fresh Ginger (Adrak), 100g");
    itemPrice.setText("₹12.00 (₹12.00 /100 g)");
}
else if(preference==4 && opt==3){
    itemName.setText("Fresh Coriander Leaves, 100 g");
    itemPrice.setText("₹12.00 (₹12.00 /100 g)");
}
else if(preference==4 && opt==4){
    itemName.setText("Fresh Cucumber, 500g");
    itemPrice.setText("₹14.00 (₹2.80 /100 g)");
}


//pref=5
  
else if(preference==5 && opt==1){
    itemName.setText("Cadbury Dairy Milk Chocolate Bar, 20.2g");
    itemPrice.setText("₹18.00 (₹89.11 /100 g)");
}
else if(preference==5 && opt==2){
    itemName.setText("Cadbury 5 Star Chocolate Bar, 35.2 g");
    itemPrice.setText("₹20.00 (₹56.82 /100 g)");
}
else if(preference==5 && opt==3){
    itemName.setText("Bikano Diwali Gift Pack Utsav 760g");
    itemPrice.setText("₹275.00");
}
else if(preference==5 && opt==4){
    itemName.setText("Tic Tac Mint Flavor Candy, 13.7g");
    itemPrice.setText("₹18.00 (₹131.39 /100 g)");
}


      //font and colours

 itemName.setFont(new Font("Arial", Font.BOLD, 20));
itemPrice.setFont(new Font("Arial", Font.PLAIN, 18));

JButton addCartBtn = new JButton("ADD TO CART");
JButton buyBtn     = new JButton("BUY NOW");

addCartBtn.setBackground(btnColor);
addCartBtn.setForeground(Color.WHITE);

buyBtn.setBackground(btnColor);
buyBtn.setForeground(Color.WHITE);


infoPanel.add(itemName);
infoPanel.add(itemPrice);
infoPanel.add(addCartBtn);
infoPanel.add(buyBtn);




// execute 
      
addCartBtn.addActionListener(e -> {
    JOptionPane.showMessageDialog(null, itemName.getText() + " added to cart!");
});

buyBtn.addActionListener(e -> {
    JOptionPane.showMessageDialog(null, "You purchased: " + itemName.getText() + 
        "\nPrice: " + itemPrice.getText());
    // Later: can redirect to a payment screen or order summary
});

backBtn.addActionListener(e -> {
    dispose();
    new CategoriesPage(preference, name); // back to category list
});

        mainPanel.add(infoPanel);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.weightx = 1.0; gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(mainPanel, gbc);

        // Actions
        signOutBtn.addActionListener(e -> {
            dispose();
            new LoginPage(); // back to login
        });

        homeBtn.addActionListener(e -> {
            dispose();
            new HomePage(name); // back to home
        });

       

        // Frame settings
        setSize(800,600);
        setVisible(true);
        getContentPane().setBackground(bg);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DetailsPage(1, 3, "KAUSAR");
    }
}
