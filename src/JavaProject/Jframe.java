package JavaProject;

import java.awt.EventQueue;

import java.awt.Window;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import java.awt.Panel;
import java.awt.List;


public class Jframe {

	private JFrame frame;
	private JTextField textField_1;
	public JPanel frame1;
	public JPanel frame2;
	static String groups;
	static String area;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe window = new Jframe();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Jframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel frame1 = new JPanel();
		frame.getContentPane().add(frame1, "name_9084892390178");
		frame1.setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(231, 42, 39, 20);
		frame1.add(formattedTextField);
		
		
		JLabel New = new JLabel("How Big is Your Group");
		New.setBounds(10, 27, 141, 50);
		frame1.add(New);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				groups = formattedTextField.getText();
				if(Utility.numberOrNot(groups) != true)
				{
					JOptionPane.showMessageDialog(null, "Check It Out!!!");
					
					//System.out.println("Is not a number");
				}
				//else if(groups == )
				else
				{
					frame1.setVisible(false);
					//frame1.dispose();
					
					final JPanel frame2 = new JPanel();
					frame.getContentPane().add(frame2, "name_9113232328555");
					frame2.setLayout(null);
					
					 
					
					JLabel lblLocation = new JLabel("Location:-");
					lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblLocation.setBounds(39, 28, 103, 50);
					frame2.add(lblLocation);
					
					textField_1 = new JFormattedTextField();
					textField_1.setBounds(136, 42, 200, 31);
					frame2.add(textField_1);
					textField_1.setColumns(10);
					
					JTextArea textArea = new JTextArea();
					textArea.setBounds(59, 104, 220, 146);
					frame2.add(textArea);
					
					JButton btnA = new JButton("ADD");
					btnA.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("Kaam Krra saala");
							JList list_1 = new JList();
							list_1.setBounds(57, 106, 187, 110);
							frame2.add(list_1);
							String[] data = {};
							int i, loop = Integer.parseInt(groups);
							for(i = 0; i < loop; i++)
							{
								area = textField_1.getText();
								list_1.add(new JList(data));	
								list_1.setVisible(true);
							}
							System.out.println(area);
							//new city = textfield_1.getText();
						}
					});
					btnA.setBounds(355, 46, 69, 23);
					frame2.add(btnA);
					
					JButton btnNewButton_1 = new JButton("Locate On Map");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Kaam Krra saala");
						}
					});
					btnNewButton_1.setBounds(301, 150, 123, 36);
					frame2.add(btnNewButton_1);
					
									
					frame2.setVisible(true);
				}	
			}
		});
		btnNewButton.setBounds(62, 88, 89, 23);
		frame1.add(btnNewButton);
		
		
		//delete it after design
		final JPanel frame2 = new JPanel();
		frame.getContentPane().add(frame2, "name_9113232328555");
		frame2.setLayout(null);
		
		 
		
		JLabel lblLocation = new JLabel("Location:-");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLocation.setBounds(39, 28, 103, 50);
		frame2.add(lblLocation);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 42, 200, 31);
		frame2.add(textField_1);
		textField_1.setColumns(10);
		
	/*JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) */	
		
		JButton btnA = new JButton("ADD");
		btnA.setBounds(355, 46, 69, 23);
		frame2.add(btnA);
		
		JButton btnNewButton_1 = new JButton("Locate On Map");
		btnNewButton_1.setBounds(301, 150, 123, 36);
		frame2.add(btnNewButton_1);
		
		List list = new List();
		list.setBounds(51, 100, 213, 137);
		frame2.add(list);
		//till here
	}
}
