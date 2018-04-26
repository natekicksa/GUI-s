import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class retailPrice extends JFrame{
	private JPanel p;
	private JLabel item_label;
	private JLabel markup_label;
	private JTextField itemCost; //text field1
	private JTextField markup; // text field2
	private JButton calcRetail;
	final int WIN_WIDTH = 550;
	final int WIN_HEIGHT = 450;
	
	public retailPrice(){
		
		setTitle("Retail Price Calculator");
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(p);
		setVisible(true);
	}
	
	private void buildPanel(){
		item_label = new JLabel("Enter the retail price: ");
		itemCost = new JTextField(10);
		
		markup_label = new JLabel("Enter the % markup: ");
		markup = new JTextField(10);
		
		calcRetail = new JButton("Calculate Retail Price");
		calcRetail.addActionListener(new CalcRetailListener());
		
		p = new JPanel();
		p.add(item_label);
		p.add(itemCost);
		p.add(markup_label);
		p.add(markup);
		p.add(calcRetail);
		
	}
	
	private class CalcRetailListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			String price;
			String percent;
			double retail_price;
			
			price = itemCost.getText();
			percent = markup.getText();
			
			retail_price = Double.parseDouble(price) + (Double.parseDouble(price) * (Double.parseDouble(percent)/100));
			JOptionPane.showMessageDialog(null, retail_price + " Is the retail price");
		}
	}
	
	
	
	public static void main(String[] args){
		new retailPrice();
	}

}
