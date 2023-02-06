/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

/**
 *
 * @author welcome
 */
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class node {

	JFrame f;
        static JLabel l1,  l3;
	
	public node()
	{
            
            
		f=new JFrame();
                l3=new JLabel("NODE DETAILS  ");
	 	     l3.setFont(new Font("Bell MT", Font.BOLD, 20));
	 	     l3.setBounds(20, 1, 250, 30);
                     l3.setForeground(Color.RED);
	 	     f.add(l3);
		try
		{
			Connection conn = dbcon.getConne();
                        Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select * from nodes");

		     Vector<String> v1=new Vector<String>();
		     v1.addElement("ID");
		     v1.addElement("NODES");
		     v1.addElement("ATTACK STATUS");
		     v1.addElement("DESTINATION");
                     v1.addElement("IPADDRESS");
		     v1.addElement("MACK ADDRESS");
		    
		     
		     @SuppressWarnings("rawtypes")
			 Vector<Vector<Comparable>> v3=new Vector<Vector<Comparable>>(); 
		     
		     while(rs.next())
		     {
		         @SuppressWarnings("rawtypes")
				 Vector<Comparable> v2=new Vector<Comparable>();
		         v2.addElement(rs.getInt(1));   
		         v2.addElement(rs.getString(2));
		         v2.addElement(rs.getString(3));
		         v2.addElement(rs.getString(4));
                         v2.addElement(rs.getString(5));
		         v2.addElement(rs.getString(6));
		        
		     v3.add(v2);
		     }
     
		     JTable wrkr_table=new JTable(v3, v1);
		     wrkr_table.setBackground(Color.lightGray);
		     JScrollPane scp=new JScrollPane(wrkr_table);
		     scp.setBounds(50,50,680,180);
		     
		     f.add(scp);     
		     f.setSize(800,250);
		     f.setLayout(null);
		     f.setLocationRelativeTo(null);
		     f.setVisible(true);
		
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	/*public static void main(String[] args) {
		new NodeFinder();
	}*/

}

