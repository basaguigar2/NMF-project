package operations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import objects.Matrix_Object;
import objects.Muscles_selected;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;

public class Interface_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, option_p1, option_p2, option_p3, option_p4, graphic1, graphic6, graphic2,
			graphic7,panel_3,panel_4,graphic3,graphic4,graphic5,panel,graphic4_2;
	private JButton btnNewButton;
	private double[][] x, w, h, x_next, w_next, h_next;
	private JTabbedPane tabbedPane_main;
	private JLabel graphic_1, graohic_6, graphic_2, graphic_7,Option_1,Option_2,Option_3,Option_4,graphic_3, graphic_4, 
				   lblMatrixesSavedCorrectly, graphic_5,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,
				   lblNewLabel_6,lblNewLabel_7,lblNewLabel_8,lblNewLabel_11,lblNewLabel_12,lblNewLabel_13,
				   lblNewLabel_14,lblNewLabel_15,lblNewLabel_16,lblNewLabel_17,lblNewLabel_18,lblNewLabel_19,lblNewLabel_20,
				   lblNewLabel_21,title,Changing_Label;
	private JButton checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6, checkbox7;;
	private JTabbedPane tabbed_save;
	private JTextField textField,textField2;
	Muscles_selected musc = new Muscles_selected();
	Interface_methods op = new Interface_methods();
	Matrix_Object mat = new Matrix_Object();
	Matrix m = new Matrix();
	Files f = new Files();
	private JPanel graphic4_1;
	private JLabel graphic;
	private JLabel lblNewLabel_22;

	/**
	 * Create the frame.
	 */
	public Interface_2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(165, 42, 42));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Menu();
		Charge();
		Select();
		Show();
		Save();
		tab_panel();
	}
	
	public void Menu() {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, -28, 1145, 629);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 130, 238));
		panel_2.setBounds(0, 23, 311, 584);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		title = new JLabel("NMF \r\nAlgorithm\r\n\r\n");
		title.setToolTipText("NMF Algorithm\r\n\r\nBasilio Aguirre Garc\u00EDa\r\n");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Times New Roman", Font.BOLD, 40));
		title.setBounds(20, 41, 341, 150);
		panel_2.add(title);

		option_p1 = new JPanel();
		option_p1.setBackground(new Color(102, 0, 153));
		option_p1.setBounds(10, 211, 244, 51);
		panel_2.add(option_p1);
		option_p1.setLayout(null);

		Option_1 = new JLabel("1. Charge");
		Option_1.setBackground(new Color(153, 0, 153));
		Option_1.setBounds(7, 0, 244, 51);
		Option_1.setHorizontalAlignment(SwingConstants.LEFT);
		Option_1.setForeground(new Color(255, 255, 255));
		Option_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		option_p1.add(Option_1);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_5.setBounds(0, 0, 244, 51);
		option_p1.add(lblNewLabel_5);

		option_p2 = new JPanel();
		option_p2.setBounds(10, 294, 244, 51);
		panel_2.add(option_p2);
		option_p2.setBackground(new Color(255, 255, 224));
		option_p2.setLayout(null);

		Option_2 = new JLabel("2. Select");
		Option_2.setBounds(7, 10, 123, 34);
		Option_2.setHorizontalAlignment(SwingConstants.LEFT);
		Option_2.setForeground(new Color(255, 255, 255));
		Option_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		option_p2.add(Option_2);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(-2, -175, 264, 264);
		option_p2.add(lblNewLabel_6);

		option_p3 = new JPanel();
		option_p3.setBounds(10, 383, 244, 51);
		panel_2.add(option_p3);
		option_p3.setBackground(new Color(255, 255, 224));
		option_p3.setLayout(null);

		Option_3 = new JLabel("3. Graphics");
		Option_3.setBounds(7, 10, 123, 34);
		Option_3.setHorizontalAlignment(SwingConstants.LEFT);
		Option_3.setForeground(new Color(255, 255, 255));
		Option_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		option_p3.add(Option_3);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_7.setBounds(0, -320, 244, 390);
		option_p3.add(lblNewLabel_7);

		option_p4 = new JPanel();
		option_p4.setBounds(10, 470, 244, 51);
		panel_2.add(option_p4);
		option_p4.setBackground(new Color(255, 255, 224));
		option_p4.setLayout(null);
		
	    Option_4 = new JLabel("4. Save");
		Option_4.setBounds(7, 10, 104, 34);
		Option_4.setHorizontalAlignment(SwingConstants.LEFT);
		Option_4.setForeground(new Color(255, 255, 255));
		Option_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		option_p4.add(Option_4);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_8.setBounds(0, -461, 244, 512);
		option_p4.add(lblNewLabel_8);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_3.setBounds(0, 0, 314, 574);
		panel_2.add(lblNewLabel_3);
		
		tabbedPane_main = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_main.setBounds(227, -28, 767, 647);
		panel_1.add(tabbedPane_main);
		tabbedPane_main.setForeground(new Color(0, 0, 0));
		tabbedPane_main.setBackground(new Color(255, 255, 255));
		JPanel main_page = new JPanel();
		main_page.setBackground(new Color(255, 255, 255));
		tabbedPane_main.addTab("New tab", null, main_page, null);
		main_page.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\musculos45.jpg"));
		lblNewLabel_1.setBounds(-44, 53, 693, 510);
		main_page.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Basilio Aguirre Garc\u00EDa");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(522, 534, 360, 76);
		main_page.add(lblNewLabel_2);
	}
	
	public void Charge() {
		JPanel Charge = new JPanel();
		Charge.setLayout(null);
		Charge.setBackground(Color.WHITE);
		tabbedPane_main.addTab("New tab", null, Charge, null);

		JLabel Checkpoint = new JLabel("Matrixes charged correctly");
		Checkpoint.setHorizontalAlignment(SwingConstants.CENTER);
		Checkpoint.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		Checkpoint.setBounds(217, 320, 360, 216);
		Charge.add(Checkpoint);
		
		lblNewLabel_4 = new JLabel("\r\n");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\tick.jpg"));
		lblNewLabel_4.setBounds(280, 156, 658, 286);
		Charge.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 795, 153);
		Charge.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("1. Charge");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(98, 21, 627, 153);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_9.setBounds(68, 10, 640, 181);
		panel_1.add(lblNewLabel_9);
	}
	
	public void Show() {
		JPanel Show = new JPanel();
		Show.setLayout(null);
		Show.setBackground(new Color(255, 255, 255));
		tabbedPane_main.addTab("New tab", null, Show, null);

		graphic6 = new JPanel();
		graphic6.setLayout(null);
		graphic6.setBackground(new Color(135, 206, 250));
		graphic6.setBounds(418, 239, 247, 51);
		Show.add(graphic6);

		graohic_6 = new JLabel("Straight Femoral");
		graohic_6.setHorizontalAlignment(SwingConstants.CENTER);
		graohic_6.setForeground(Color.WHITE);
		graohic_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graohic_6.setBounds(10, 10, 227, 34);
		graphic6.add(graohic_6);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_11.setBounds(0, 0, 247, 51);
		graphic6.add(lblNewLabel_11);

		graphic2 = new JPanel();
		graphic2.setLayout(null);
		graphic2.setBackground(new Color(135, 206, 250));
		graphic2.setBounds(123, 239, 247, 51);
		Show.add(graphic2);

		graphic_2 = new JLabel("Medial Gastrocnemius");
		graphic_2.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_2.setForeground(Color.WHITE);
		graphic_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_2.setBounds(10, 10, 227, 34);
		graphic2.add(graphic_2);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_12.setBounds(0, 0, 276, 51);
		graphic2.add(lblNewLabel_12);

		graphic7 = new JPanel();
		graphic7.setLayout(null);
		graphic7.setBackground(new Color(135, 206, 250));
		graphic7.setBounds(418, 314, 247, 51);
		Show.add(graphic7);

		graphic_7 = new JLabel("Lateral Semitendonous");
		graphic_7.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_7.setForeground(Color.WHITE);
		graphic_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_7.setBounds(0, 10, 247, 34);
		graphic7.add(graphic_7);
		
		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_13.setBounds(0, 0, 247, 51);
		graphic7.add(lblNewLabel_13);

		graphic1 = new JPanel();
		graphic1.setBounds(123, 163, 247, 51);
		Show.add(graphic1);
		graphic1.setLayout(null);
		graphic1.setBackground(new Color(135, 206, 250));

		graphic_1 = new JLabel("Anterior Tibial");
		graphic_1.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_1.setForeground(Color.WHITE);
		graphic_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_1.setBackground(Color.WHITE);
		graphic_1.setBounds(49, 10, 141, 34);
		graphic1.add(graphic_1);
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_14.setBounds(0, 0, 247, 51);
		graphic1.add(lblNewLabel_14);
		
		graphic3 = new JPanel();
		graphic3.setLayout(null);
		graphic3.setBackground(new Color(135, 206, 250));
		graphic3.setBounds(123, 314, 247, 51);
		Show.add(graphic3);
		
		graphic_3 = new JLabel("Lateral Gastrocnemius");
		graphic_3.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_3.setForeground(Color.WHITE);
		graphic_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_3.setBounds(10, 10, 227, 34);
		graphic3.add(graphic_3);
		
		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_15.setBounds(0, 0, 247, 51);
		graphic3.add(lblNewLabel_15);
		
		graphic4 = new JPanel();
		graphic4.setLayout(null);
		graphic4.setBackground(new Color(221, 160, 221));
		graphic4.setBounds(273, 390, 247, 51);
		Show.add(graphic4);
		
		graphic_4 = new JLabel("Soleus\r\n");
		graphic_4.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_4.setForeground(Color.WHITE);
		graphic_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_4.setBounds(10, 10, 227, 34);
		graphic4.add(graphic_4);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_16.setBounds(0, 0, 247, 51);
		graphic4.add(lblNewLabel_16);
		
		graphic5 = new JPanel();
		graphic5.setLayout(null);
		graphic5.setBackground(new Color(135, 206, 250));
		graphic5.setBounds(418, 163, 247, 51);
		Show.add(graphic5);
		
		graphic_5 = new JLabel("Peronaeus");
		graphic_5.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_5.setForeground(Color.WHITE);
		graphic_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_5.setBounds(10, 10, 227, 34);
		graphic5.add(graphic_5);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_17.setBounds(0, 0, 247, 51);
		graphic5.add(lblNewLabel_17);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 795, 153);
		Show.add(panel_1);
		
		JLabel lblNewLabel_10 = new JLabel("3. Graphics");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel_10.setBounds(94, 29, 627, 124);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_9.setBounds(68, 10, 640, 304);
		panel_1.add(lblNewLabel_9);
		
		graphic4_1 = new JPanel();
		graphic4_1.setLayout(null);
		graphic4_1.setBackground(new Color(221, 160, 221));
		graphic4_1.setBounds(123, 490, 247, 51);
		Show.add(graphic4_1);
		
		graphic = new JLabel("Matrix W\r\n");
		graphic.setHorizontalAlignment(SwingConstants.CENTER);
		graphic.setForeground(Color.WHITE);
		graphic.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic.setBounds(10, 10, 227, 34);
		graphic4_1.add(graphic);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_22.setBounds(0, 0, 247, 51);
		graphic4_1.add(lblNewLabel_22);
		
		graphic4_2 = new JPanel();
		graphic4_2.setLayout(null);
		graphic4_2.setBackground(new Color(221, 160, 221));
		graphic4_2.setBounds(418, 489, 247, 51);
		Show.add(graphic4_2);
		
		JLabel graphic_4_1 = new JLabel("Matrix H");
		graphic_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		graphic_4_1.setForeground(Color.WHITE);
		graphic_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		graphic_4_1.setBounds(10, 10, 227, 34);
		graphic4_2.add(graphic_4_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("");
		lblNewLabel_16_1.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_16_1.setBounds(0, 0, 247, 51);
		graphic4_2.add(lblNewLabel_16_1);
	}
	
	public void Save() {
		
				JPanel Select = new JPanel();
				Select.setLayout(null);
				Select.setBackground(Color.WHITE);
				tabbedPane_main.addTab("New tab", null, Select, null);
				
						checkbox1 = new JButton("Anterior Tibial");
						checkbox1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
						checkbox1.setForeground(new Color(255, 255, 255));
						checkbox1.setBackground(new Color(139, 0, 139));
						checkbox1.setBounds(134, 229, 237, 73);
						Select.add(checkbox1);
						action_select(checkbox1, 0);
						
								checkbox2 = new JButton("Medial Gastrocnemius\r\n");
								checkbox2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
								checkbox2.setForeground(new Color(255, 255, 255));
								checkbox2.setBackground(new Color(139, 0, 139));
								checkbox2.setBounds(134, 312, 237, 73);
								Select.add(checkbox2);
								action_select(checkbox2, 1);
								
										checkbox3 = new JButton("Lateral Gastrocnemius\r\n");
										checkbox3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
										checkbox3.setForeground(new Color(255, 255, 255));
										checkbox3.setBackground(new Color(139, 0, 139));
										checkbox3.setBounds(134, 395, 237, 73);
										Select.add(checkbox3);
										action_select(checkbox3, 2);
										
												checkbox4 = new JButton("Soleus");
												checkbox4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
												checkbox4.setBackground(new Color(139, 0, 139));
												checkbox4.setForeground(new Color(255, 255, 255));
												checkbox4.setBounds(134, 478, 237, 73);
												Select.add(checkbox4);
												action_select(checkbox4, 3);
												checkbox5 = new JButton("Peronaeus ");
												checkbox5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
												checkbox5.setForeground(new Color(255, 255, 255));
												checkbox5.setBackground(new Color(139, 0, 139));
												checkbox5.setBounds(391, 265, 237, 73);
												Select.add(checkbox5);
												action_select(checkbox5, 4);
												checkbox6 = new JButton("Straight Femoral");
												checkbox6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
												checkbox6.setBackground(new Color(139, 0, 139));
												checkbox6.setForeground(new Color(255, 255, 255));
												checkbox6.setBounds(391, 348, 237, 73);
												Select.add(checkbox6);
												action_select(checkbox6, 5);
												checkbox7 = new JButton("Lateral Semitendinosus ");
												checkbox7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
												checkbox7.setForeground(new Color(255, 255, 255));
												checkbox7.setBackground(new Color(139, 0, 139));
												checkbox7.setBounds(391, 431, 237, 73);
												Select.add(checkbox7);
												action_select(checkbox7, 6);
												
												JPanel panel_1 = new JPanel();
												panel_1.setLayout(null);
												panel_1.setBounds(0, 0, 795, 219);
												Select.add(panel_1);
												
												Changing_Label = new JLabel("Select 4 muscles");
												Changing_Label.setHorizontalAlignment(SwingConstants.CENTER);
												Changing_Label.setForeground(new Color(255, 255, 255));
												Changing_Label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
												Changing_Label.setBounds(150, 127, 463, 82);
												panel_1.add(Changing_Label);
												
												JLabel lblNewLabel_10 = new JLabel("2. Select");
												lblNewLabel_10.setForeground(Color.WHITE);
												lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 34));
												lblNewLabel_10.setBounds(98, 21, 627, 153);
												panel_1.add(lblNewLabel_10);
												
												JLabel lblNewLabel_9 = new JLabel("");
												lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
												lblNewLabel_9.setBounds(68, 10, 640, 222);
												panel_1.add(lblNewLabel_9);
		JPanel Save = new JPanel();
		Save.setLayout(null);
		Save.setBackground(Color.WHITE);
		tabbedPane_main.addTab("New tab", null, Save, null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 795, 153);
		Save.add(panel);
		
		lblNewLabel_18 = new JLabel("4. Save");
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel_18.setBounds(92, 29, 627, 124);
		panel.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_19.setBounds(68, 10, 640, 304);
		panel.add(lblNewLabel_19);

		tabbed_save = new JTabbedPane(JTabbedPane.TOP);
		tabbed_save.setBounds(0, 0, 762, 610);
		Save.add(tabbed_save);

		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		tabbed_save.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);

		lblMatrixesSavedCorrectly = new JLabel("Matrixes saved correctly!!");
		lblMatrixesSavedCorrectly.setBounds(283, 398, 225, 26);
		lblMatrixesSavedCorrectly.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel_4.add(lblMatrixesSavedCorrectly);
		
		lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\tick.jpg"));
		lblNewLabel_20.setBounds(125, 123, 512, 321);
		panel_4.add(lblNewLabel_20);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbed_save.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 250));
		panel_5.setBounds(105, 151, 576, 325);
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		textField2 = new JTextField();
		panel_5.add(textField2);
		textField2.setColumns(10);
		textField2.setBounds(32, 199, 300, 41);

		JLabel lblNewLabel = new JLabel("Name new matrix W");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_5.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 10, 326, 64);

		textField = new JTextField();
		panel_5.add(textField);
		textField.setBounds(32, 80, 300, 40);
		textField.setColumns(10);

		JLabel lblNameNewMatrix = new JLabel("Name new matrix X (W*H)");
		lblNameNewMatrix.setForeground(new Color(255, 255, 255));
		panel_5.add(lblNameNewMatrix);
		lblNameNewMatrix.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNameNewMatrix.setBounds(32, 130, 326, 64);
		
		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\basag\\OneDrive\\Escritorio\\Proyectos II\\29-291217_morado-liso-fondos-de-pantalla-morados.jpg"));
		lblNewLabel_21.setBounds(0, 0, 576, 325);
		panel_5.add(lblNewLabel_21);

		btnNewButton = new JButton("Submit\r\n\r\n");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(139, 0, 139));
		btnNewButton.setBounds(271, 486, 240, 70);
		panel_3.add(btnNewButton);
		action();

	}	

	public void Select() {

	}
	
	public void action_select(JButton box, int n) {
		ArrayList<Integer> num = musc.getNum();
		ActionListener charged2 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (num.size() < 4) {
				num.add(n);
				Changing_Label.setText("Selected " + num.size() + " muscle/s, " + (4 - num.size()) + " left...");
				box.setEnabled(false);
			}else {
				Changing_Label.setText("There are more than 4 muscles");
				System.exit(0);
			}

		}
	};
	box.addActionListener(charged2);
	}
	
	public void tab_panel() {
		option_p1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane_main.setSelectedIndex(1);
				charge();
			}
		});

		option_p1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Option_1.setForeground(new Color(128,128,128));
			}
		});
		option_p1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Option_1.setForeground(new Color(255, 255, 255));
			}
		});

		option_p2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane_main.setSelectedIndex(3);
				
			}
		});

		option_p2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Option_2.setForeground(new Color(128,128,128));
			}
		});
		option_p2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Option_2.setForeground(new Color(255, 255, 255));
			}
		});
		option_p3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane_main.setSelectedIndex(2);
				h = op.muscle_select(x, musc.getNum());
				mat = op.iteration(x, h, w);
				w_next = mat.getM1();
				h_next = mat.getM2();
				x_next = m.multiply(w_next,h_next);
				tab_pane2();
			}
		});

		option_p3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Option_3.setForeground(new Color(128,128,128));
			}
		});
		option_p3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Option_3.setForeground(new Color(255, 255, 255));
			}
		});
		option_p4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane_main.setSelectedIndex(4);
				tabbed_save.setSelectedIndex(1);
			}
		});

		option_p4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Option_4.setForeground(new Color(128,128,128));
			}
		});
		option_p4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Option_4.setForeground(new Color(255, 255, 255));
			}
		});
	}

	private void charge() {
		x = m.traspose(f.entrada("X_TABLE_2.txt"));
		w = m.traspose(f.entrada("W_TABLE.txt"));
	}

	protected void tab_pane2() {
		graphic1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,0);
			}
		});
		graphic2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,1);
			}
		});
		graphic3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,2);
			}
		});
		graphic4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,3);
			}
		});
		graphic5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,4);
			}
		});
		graphic6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,5);
			}
		});
		graphic7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.show_graphics(x, x_next,6);
			}
		});
		graphic4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double [][] m_aux = m.traspose(w_next);
				m.printMatriz(m_aux);
				for (int j = 0; j<m_aux.length ;j++) {
				String nm = "Matrix W row " + j;
				op.show_matrixW(m_aux,nm, j);
			}
				}
		});
		graphic4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int j = 0; j<h_next.length ;j++) {
					String nm = "Matrix H row " + j;
					op.show_matrixH(h_next,nm, j);
				}
			}
		});
	}

	public void action() {
		ActionListener charged = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Files f = new Files();
				f.salida(w_next, textField.getText());
				f.salida(m.multiply(w_next, h_next), textField2.getText());
				tabbed_save.setSelectedIndex(0);
			}
		};
		btnNewButton.addActionListener(charged);
	}
}
