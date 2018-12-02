import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;

public class Client {
	
	private JFrame frame;
	private JButton obj1, obj2, obj3, obj4, obj5, obj6, obj7;
	private JLabel status_des;
	
	private int[] status = new int[7];
	private int valueCheck = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		initialize();
	}
	
	public void changeButtonBackground(){
		
		Image checkImage = new ImageIcon(this.getClass().getResource("check.png")).getImage();
		Image uncheckImage = new ImageIcon(this.getClass().getResource("uncheck.png")).getImage();
		Image neutralImage = new ImageIcon(this.getClass().getResource("neutral.png")).getImage();
		
			if(status[0] == 1){
				obj1.setIcon(new ImageIcon(checkImage));
			}else if(status[0] == 2){
				obj1.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj1.setIcon(new ImageIcon(neutralImage));
			}
			
			if(status[1] == 1){
				obj2.setIcon(new ImageIcon(checkImage));
			}else if(status[1] == 2){
				obj2.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj2.setIcon(new ImageIcon(neutralImage));
			}
			
			if(status[2] == 1){
				obj3.setIcon(new ImageIcon(checkImage));
			}else if(status[2] == 2){
				obj3.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj3.setIcon(new ImageIcon(neutralImage));
			}
			
			if(status[3] == 1){
				obj4.setIcon(new ImageIcon(checkImage));
			}else if(status[3] == 2){
				obj4.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj4.setIcon(new ImageIcon(neutralImage));
			}
			
			if(status[4] == 1){
				obj5.setIcon(new ImageIcon(checkImage));
			}else if(status[4] == 2){
				obj5.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj5.setIcon(new ImageIcon(neutralImage));
			}
			
			if(status[5] == 1){
				obj6.setIcon(new ImageIcon(checkImage));
			}else if(status[5] == 2){
				obj6.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj6.setIcon(new ImageIcon(neutralImage));
			}
			
			if(status[6] == 1){
				obj7.setIcon(new ImageIcon(checkImage));
			}else if(status[6] == 2){
				obj7.setIcon(new ImageIcon(uncheckImage));
			}else{
				obj7.setIcon(new ImageIcon(neutralImage));
			}
	}
	
	public void simpleRenderer(){
		
		Image checkImage = new ImageIcon(this.getClass().getResource("check.png")).getImage();
		Image uncheckImage = new ImageIcon(this.getClass().getResource("uncheck.png")).getImage();
		Image neutralImage = new ImageIcon(this.getClass().getResource("neutral.png")).getImage();
		
		obj1.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[0] == 0){
					obj1.setIcon(new ImageIcon(checkImage));
				}else if(status[0] == 1){
					obj1.setIcon(new ImageIcon(uncheckImage));
				}else if(status[0] == 2){
					obj1.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[0] == 0){
					obj1.setIcon(new ImageIcon(neutralImage));
				}else if(status[0] == 1){
					obj1.setIcon(new ImageIcon(checkImage));
				}else if(status[0] == 2){
					obj1.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
		
		obj2.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[1] == 0){
					obj2.setIcon(new ImageIcon(checkImage));
				}else if(status[1] == 1){
					obj2.setIcon(new ImageIcon(uncheckImage));
				}else if(status[1] == 2){
					obj2.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[1] == 0){
					obj2.setIcon(new ImageIcon(neutralImage));
				}else if(status[1] == 1){
					obj2.setIcon(new ImageIcon(checkImage));
				}else if(status[1] == 2){
					obj2.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
		
		obj3.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[2] == 0){
					obj3.setIcon(new ImageIcon(checkImage));
				}else if(status[2] == 1){
					obj3.setIcon(new ImageIcon(uncheckImage));
				}else if(status[2] == 2){
					obj3.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[2] == 0){
					obj3.setIcon(new ImageIcon(neutralImage));
				}else if(status[2] == 1){
					obj3.setIcon(new ImageIcon(checkImage));
				}else if(status[2] == 2){
					obj3.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
		
		obj4.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[3] == 0){
					obj4.setIcon(new ImageIcon(checkImage));
				}else if(status[3] == 1){
					obj4.setIcon(new ImageIcon(uncheckImage));
				}else if(status[3] == 2){
					obj4.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[3] == 0){
					obj4.setIcon(new ImageIcon(neutralImage));
				}else if(status[3] == 1){
					obj4.setIcon(new ImageIcon(checkImage));
				}else if(status[3] == 2){
					obj4.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
		
		obj5.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[4] == 0){
					obj5.setIcon(new ImageIcon(checkImage));
				}else if(status[4] == 1){
					obj5.setIcon(new ImageIcon(uncheckImage));
				}else if(status[4] == 2){
					obj5.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[4] == 0){
					obj5.setIcon(new ImageIcon(neutralImage));
				}else if(status[4] == 1){
					obj5.setIcon(new ImageIcon(checkImage));
				}else if(status[4] == 2){
					obj5.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
		
		obj6.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[5] == 0){
					obj6.setIcon(new ImageIcon(checkImage));
				}else if(status[5] == 1){
					obj6.setIcon(new ImageIcon(uncheckImage));
				}else if(status[5] == 2){
					obj6.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[5] == 0){
					obj6.setIcon(new ImageIcon(neutralImage));
				}else if(status[5] == 1){
					obj6.setIcon(new ImageIcon(checkImage));
				}else if(status[5] == 2){
					obj6.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
		
		obj7.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				if(status[6] == 0){
					obj7.setIcon(new ImageIcon(checkImage));
				}else if(status[6] == 1){
					obj7.setIcon(new ImageIcon(uncheckImage));
				}else if(status[6] == 2){
					obj7.setIcon(new ImageIcon(checkImage));
				}
			}
			
			public void mouseExited(MouseEvent e){
				if(status[6] == 0){
					obj7.setIcon(new ImageIcon(neutralImage));
				}else if(status[6] == 1){
					obj7.setIcon(new ImageIcon(checkImage));
				}else if(status[6] == 2){
					obj7.setIcon(new ImageIcon(uncheckImage));
				}
			}
		});
	}
	
	public void updateData(int id, int status){
		Connection client = null;
		try{
			client = DriverManager.getConnection("jdbc:", "", "");
			Statement power = client.createStatement();
			power.executeUpdate("Update days SET dayStatus= '" + status + "' WHERE id= '" + id+ "'");
			power.close();
			
			simpleRenderer();
			
		}catch(Exception error){
			status_des.setText("Can't connect to Mysql database.");
		}finally{
			if(client != null){
				try{
					client.close();
				}catch(Exception error){
					status_des.setText("Can't close connection with Mysql database.");
				}
			}
		}
	}
	
	public void connect(){
		Connection clientConnect = null;
		try{
			clientConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employercalendar", "root", "");
			Statement power = clientConnect.createStatement();
			ResultSet set = power.executeQuery("Select * from days");
			
				while(set.next()){
					status[valueCheck] = set.getInt("dayStatus");
					valueCheck++;
				}
				
			set.close();
			power.close();
		}catch(Exception error){
			status_des.setText("Can't connect to Mysql database.");
		}finally{
			if(clientConnect != null){
				try{
					clientConnect.close();
				}catch(SQLException error){
					status_des.setText("Can't close connection with Mysql database.");
				}
			}
		}
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Image logo = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		
		frame = new JFrame();
		frame.setTitle("Employer Calendar");
		frame.setIconImage(logo);
		frame.setResizable(false);
		frame.setBounds(0, 0, 615, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(0,11,1));
		
		JLabel Montag = new JLabel("Pirmad");
		Montag.setForeground(new Color(0,216,193));
		Montag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Montag.setBounds(24, 40, 70, 20);
		frame.getContentPane().add(Montag);
		
		JLabel Dienstag = new JLabel("Antrad");
		Dienstag.setForeground(new Color(0,216,193));
		Dienstag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Dienstag.setBounds(113, 40, 70, 20);
		frame.getContentPane().add(Dienstag);
		
		JLabel Mittwosch = new JLabel("Trečia");
		Mittwosch.setForeground(new Color(0,216,193));
		Mittwosch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Mittwosch.setBounds(199, 40, 60, 20);
		frame.getContentPane().add(Mittwosch);
		
		JLabel Donnerstag = new JLabel("Ketvir");
		Donnerstag.setForeground(new Color(0,216,193));
		Donnerstag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Donnerstag.setBounds(283, 40, 60, 20);
		frame.getContentPane().add(Donnerstag);
		
		JLabel Freitag = new JLabel("Penkta");
		Freitag.setForeground(new Color(0,216,193));
		Freitag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Freitag.setBounds(365, 40, 60, 20);
		frame.getContentPane().add(Freitag);
		
		JLabel Samstag = new JLabel("Šeštad");
		Samstag.setForeground(new Color(0,216,193));
		Samstag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Samstag.setBounds(450, 40, 70, 20);
		frame.getContentPane().add(Samstag);
		
		JLabel Sonntag = new JLabel("Sekmad");
		Sonntag.setForeground(new Color(0,216,193));
		Sonntag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Sonntag.setBounds(531, 40, 70, 20);
		frame.getContentPane().add(Sonntag);
		
		obj1 = new JButton("");
		obj1.setBorderPainted(false);
		obj1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[0] == 0){
					status[0] = 1;
					updateData(2, status[0]);
				}else if(status[0] == 1){
					status[0] = 2;
					updateData(2, status[0]);
				}else if(status[0] == 2){
					status[0] = 1;
					updateData(2, status[0]);
				}
			}
		});
		obj1.setBounds(15, 71, 76, 67);
		frame.getContentPane().add(obj1);
		
		obj2 = new JButton("");
		obj2.setBorderPainted(false);
		obj2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[1] == 0){
					status[1] = 1;
					updateData(3, status[1]);
				}else if(status[1] == 1){
					status[1] = 2;
					updateData(3, status[1]);
				}else if(status[1] == 2){
					status[1] = 1;
					updateData(3, status[1]);
				}
			}
		});
		obj2.setBounds(100, 71, 76, 67);
		frame.getContentPane().add(obj2);
		
		obj3 = new JButton("");
		obj3.setBorderPainted(false);
		obj3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[2] == 0){
					status[2] = 1;
					updateData(4, status[2]);
				}else if(status[2] == 1){
					status[2] = 2;
					updateData(4, status[2]);
				}else if(status[2] == 2){
					status[2] = 1;
					updateData(4, status[2]);
				}
			}
		});
		obj3.setBounds(185, 71, 76, 67);
		frame.getContentPane().add(obj3);
		
		obj4 = new JButton("");
		obj4.setBorderPainted(false);
		obj4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[3] == 0){
					status[3] = 1;
					updateData(5, status[3]);
				}else if(status[3] == 1){
					status[3] = 2;
					updateData(5, status[3]);
				}else if(status[3] == 2){
					status[3] = 1;
					updateData(5, status[3]);
				}
			}
		});
		obj4.setBounds(270, 71, 76, 67);
		frame.getContentPane().add(obj4);
		
		obj5 = new JButton("");
		obj5.setBorderPainted(false);
		obj5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[4] == 0){
					status[4] = 1;
					updateData(6, status[4]);
				}else if(status[4] == 1){
					status[4] = 2;
					updateData(6, status[4]);
				}else if(status[4] == 2){
					status[4] = 1;
					updateData(6, status[4]);
				}
			}
		});
		obj5.setBounds(355, 71, 76, 67);
		frame.getContentPane().add(obj5);
		
		obj6 = new JButton("");
		obj6.setBorderPainted(false);
		obj6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[5] == 0){
					status[5] = 1;
					updateData(7, status[5]);
				}else if(status[5] == 1){
					status[5] = 2;
					updateData(7, status[5]);
				}else if(status[5] == 2){
					status[5] = 1;
					updateData(7, status[5]);
				}
			}
		});
		obj6.setBounds(440, 71, 76, 67);
		frame.getContentPane().add(obj6);
		
		obj7 = new JButton("");
		obj7.setBorderPainted(false);
		obj7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(status[6] == 0){
					status[6] = 1;
					updateData(8, status[6]);
				}else if(status[6] == 1){
					status[6] = 2;
					updateData(8, status[6]);
				}else if(status[6] == 2){
					status[6] = 1;
					updateData(8, status[6]);
				}
			}
		});
		obj7.setBounds(525, 71, 76, 67);
		frame.getContentPane().add(obj7);
		
		status_des = new JLabel();
		status_des.setHorizontalAlignment(SwingConstants.CENTER);
		status_des.setForeground(Color.RED);
		status_des.setBounds(15, 11, 582, 14);
		frame.getContentPane().add(status_des);
		
		connect();
		changeButtonBackground();
		simpleRenderer();
	}
}
