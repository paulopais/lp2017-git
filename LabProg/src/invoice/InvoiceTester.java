package invoice;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import sibs.sibs;

public class InvoiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice novoInvoice= new Invoice();
		InvoiceFormatter invoiceFormatter = new HtmlFormatter();
	
		JTextArea textAreaFactura = new JTextArea(10,10);
		
		
		textAreaFactura.setVisible(true);
		ChangeListener listenerFactura = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				textAreaFactura.setText(novoInvoice.format(invoiceFormatter));
				
			}
		};
		novoInvoice.addChangeListener(listenerFactura);
		
		Product hammer = new Product("Hammer", 19.95);
		Product nails = new Product("nails", 9.95);
		
		Bundle bundle= new Bundle();
		bundle.add(nails);
		bundle.add(hammer);
		
		JComboBox boxProduto= new JComboBox();
		boxProduto.addItem(nails);
		boxProduto.addItem(hammer);
		boxProduto.addItem(bundle);
		System.out.println("ola");
		
		ActionListener listener = new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				LineItem itemPoduto = (LineItem) boxProduto.getSelectedItem();
				novoInvoice.addItem(itemPoduto);
				
			}
		};

		
		JButton buttonactionPerformed = new JButton("Adicionar");
		buttonactionPerformed.addActionListener(listener);
		JPanel jprincipal = new JPanel();
		jprincipal.add(textAreaFactura);
		jprincipal.add(buttonactionPerformed);
		jprincipal.add(boxProduto);
		
		
		JFrame jframePrincipal = new JFrame();
		jframePrincipal.setLayout(new FlowLayout());
		jframePrincipal.add(jprincipal);
		jframePrincipal.pack();
		jframePrincipal.setVisible(true);
		
	}
	

}
