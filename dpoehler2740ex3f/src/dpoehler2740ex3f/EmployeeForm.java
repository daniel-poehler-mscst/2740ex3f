package dpoehler2740ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JTextField empPositionTextField;
	private JComboBox deptComboBox;
	private JScrollPane scrollPane;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JButton naArgConstructorButton;
	private JButton twoArgConstructorButton;
	private JButton fourArgConstructorButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setTitle("Ex3F: Employee Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 434, 169);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel(); // Added manually
//		employeeList = new JList();
		employeeList = new JList(employeeListModel); // Added manually
		scrollPane.setViewportView(employeeList);
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setBounds(27, 209, 90, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmployeeName = new JLabel("Employee name:");
		lblEmployeeName.setBounds(27, 238, 106, 16);
		contentPane.add(lblEmployeeName);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(27, 267, 90, 16);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(27, 297, 56, 16);
		contentPane.add(lblPosition);
		
		empIdTextField = new JTextField();
		lblNewLabel.setLabelFor(empIdTextField);
		empIdTextField.setText("101");
		empIdTextField.setBounds(145, 206, 82, 22);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		empNameTextField = new JTextField();
		lblEmployeeName.setLabelFor(empNameTextField);
		empNameTextField.setText("Daniel Poehler");
		empNameTextField.setColumns(10);
		empNameTextField.setBounds(145, 235, 116, 22);
		contentPane.add(empNameTextField);
		
		empPositionTextField = new JTextField();
		empPositionTextField.setText("Software Engineer");
		lblPosition.setLabelFor(empPositionTextField);
		empPositionTextField.setColumns(10);
		empPositionTextField.setBounds(145, 294, 116, 22);
		contentPane.add(empPositionTextField);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		deptComboBox.setBounds(145, 264, 132, 22);
		contentPane.add(deptComboBox);
		
		naArgConstructorButton = new JButton("No Arg");
		naArgConstructorButton.addActionListener(this);
		naArgConstructorButton.setBounds(330, 209, 97, 25);
		contentPane.add(naArgConstructorButton);
		
		twoArgConstructorButton = new JButton("2 Arg");
		twoArgConstructorButton.addActionListener(this);
		twoArgConstructorButton.setBounds(330, 247, 97, 25);
		contentPane.add(twoArgConstructorButton);
		
		fourArgConstructorButton = new JButton("4 Arg");
		fourArgConstructorButton.addActionListener(this);
		fourArgConstructorButton.setBounds(330, 285, 97, 25);
		contentPane.add(fourArgConstructorButton);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == fourArgConstructorButton) {
			do_fourArgConstructorButton_actionPerformed(arg0);
		}
		if (arg0.getSource() == twoArgConstructorButton) {
			do_twoArgConstructorButton_actionPerformed(arg0);
		}
		if (arg0.getSource() == naArgConstructorButton) {
			do_naArgConstructorButton_actionPerformed(arg0);
		}
	}
	protected void do_naArgConstructorButton_actionPerformed(ActionEvent arg0) {
		Employee emp = new Employee();
		employeeListModel.addElement(emp);
	}
	protected void do_twoArgConstructorButton_actionPerformed(ActionEvent arg0) {
		int id = Integer.parseInt(empIdTextField.getText());
		String name = empNameTextField.getText();
		Employee emp = new Employee(id, name);		
		employeeListModel.addElement(emp);
	}
	protected void do_fourArgConstructorButton_actionPerformed(ActionEvent arg0) {
		int id = Integer.parseInt(empIdTextField.getText());
		String name = empNameTextField.getText();		
		String dept = (String) deptComboBox.getSelectedItem();
		String position = empPositionTextField.getText();
		Employee emp = new Employee(id, name, dept, position);
		employeeListModel.addElement(emp);
	}
}
