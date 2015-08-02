import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import other.Cell;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow extends JFrame {

	private JPanel contentPane;
	
	private Cell[][] cells;
	
	
	int row=0,clm=0,rowVal=0,clmVal=0,dia=0,diaVal=0,diaNo=0;
    int row1[]=new int[3],clm1[]=new int[3];
    int[] dia1 = new int[3];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Create buttons for each cell in the game
		
		JButton btn3_3 = new JButton("");
		btn3_3.setBounds(380, 264, 83, 59);
		contentPane.add(btn3_3);
		
		JButton btn3_2 = new JButton("");
		btn3_2.setBounds(271, 264, 83, 59);
		contentPane.add(btn3_2);
		
		JButton btn3_1 = new JButton("");
		btn3_1.setBounds(156, 264, 83, 59);
		contentPane.add(btn3_1);
		
		JButton btn2_3 = new JButton("");
		btn2_3.setBounds(380, 182, 83, 59);
		contentPane.add(btn2_3);
		
		JButton btn2_2 = new JButton("");
		btn2_2.setBounds(271, 182, 83, 59);
		contentPane.add(btn2_2);
		
		JButton btn2_1 = new JButton("");
		btn2_1.setBounds(156, 182, 83, 59);
		contentPane.add(btn2_1);
		
		JButton btn1_3 = new JButton("");
		btn1_3.setBounds(380, 100, 83, 59);
		contentPane.add(btn1_3);
		
		JButton btn1_2 = new JButton("");
		
		
		btn1_2.setBounds(271, 100, 83, 59);
		contentPane.add(btn1_2);
		
		JButton btn1_1 = new JButton("");
		
		
		
		
		
		btn1_1.setBounds(156, 100, 83, 59);
		contentPane.add(btn1_1);
		
		cells=new Cell[3][3];
		
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				cells[i][j]=new Cell();
			}
		}
		
		cells[0][0].setButton(btn1_1);
		cells[0][1].setButton(btn1_2);
		cells[0][2].setButton(btn1_3);
		
		
		cells[1][0].setButton(btn2_1);
		cells[1][1].setButton(btn2_2);
		cells[1][2].setButton(btn2_3);
		
		
		cells[2][0].setButton(btn3_1);
		cells[2][1].setButton(btn3_2);
		cells[2][2].setButton(btn3_3);
		
		
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cells[0][0].setStatus(true);
				cells[0][0].setValue(1);
				
				
				checkCells();
				
			
			}
		});
		
		btn1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		btn1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			}
		});
		
		btn2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		btn2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		
		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			}
		});
		
		btn3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		btn3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		JLabel lblMainWindow = new JLabel("");
		lblMainWindow.setIcon(new ImageIcon(MainWindow.class.getResource("/Images/A.jpg")));
		lblMainWindow.setBounds(5, 5, 624, 401);
		//lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/Images/MainWindow.jpg")));
		//lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/Images/MainWindow.jpg")));
		contentPane.add(lblMainWindow);
	}
	
	
	
	
	
	
	
	private void checkCells(){
		
		
		//check rows
		
		int tot[]=new int[3];
        tot[0]=0;
        tot[1]=0;
        tot[2]=0;
        int max=0;
                int totr2=0,totr3=0,tot1=0,numOfTrue=0;
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                if (cells[i][j].getValue()==1) 
                {
                 tot[i]++; 
                }
            }
            if(tot[i]>max)
            {
                max=tot[i];
                row=i;
                rowVal=max;
            }
		
        }
        
        
        
        //check colomns
        
        
        tot[0]=0;
        tot[1]=0;
        tot[2]=0;
        max=0;
                totr2=0;
                totr3=0;
                tot1=0;
                numOfTrue=0;
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                if (cells[j][i].getValue()==1) 
                {
                 tot[i]++; 
                }
            }
            if(tot[i]>max)
            {
                
                max=tot[i];
                System.out.println(max+"fxfh"+i);
                clm=i;
                clmVal=max;
            }
        }
		
        
        int dia1=0,dia2=0;
        for (int i = 0; i < 3; i++) {
            if (cells[i][i].getValue()==1) {
                dia1++;
            }
        }
//        for (int i = 0; i < 3; i++) 
//        {
        int i=0,j=0;
            for (i=0,j = 2; j >=0; i++,j--) 
            {
                if (cells[i][i].getValue()==1) 
                {
                dia2++;
            }
            }
            if(dia1>dia2)
            {
                diaVal=dia1;
                diaNo=1;
                dia=i;
            }
            else
            {
                diaVal=dia2;
                diaNo=2;
                dia=i;
            }
	
		
	}
	
	
	
	
	private void checkWinner(){
		
		
		
		
		
		
	}

}
