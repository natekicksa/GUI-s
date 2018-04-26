import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tax extends JFrame{
	private JPanel p;
	private JLabel sales_total;
	private JTextField sales_field; // text field1
	private JButton sales_tax_button; //button
	
	final int WIN_WIDTH = 550;
	final int WIN_HEIGHT = 450;
	
	public tax(){
		setTitle("Sales Tax Calculator");
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(p);
		setVisible(true);
	}
	
	private void buildPanel(){
		sales_total = new JLabel("Enter the sales total: ");
		sales_field = new JTextField(10);
		
		
		sales_tax_button = new JButton("Calculate Taxes");
		sales_tax_button.addActionListener(new CalcTaxListener());
		
		p = new JPanel();
		p.add(sales_total);
		p.add(sales_field);
		p.add(sales_tax_button);
	}
	
	private class CalcTaxListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			String sales;
			double countyTax;
			double stateTax;
			double totalTax;
			
			sales = sales_field.getText();
			countyTax = Double.parseDouble(sales) * 0.02;
			stateTax = Double.parseDouble(sales) * 0.04;
			totalTax = countyTax + stateTax;
			
			
			
			JOptionPane.showMessageDialog(null, countyTax+ "->County Tax \n" + stateTax +"->state tax \n"+totalTax+"-->Total tax" );
		}
	}
	
	
	public static void main(String[] args){
		new tax();
	}
}
