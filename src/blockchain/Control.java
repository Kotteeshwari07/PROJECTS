package blockchain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.awt.*;
public class Control {
	static JFrame frame;
	static JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10;
	
	static JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	static JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	static JLabel c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	static JLabel d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
	
	static JLabel aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9,aa10;
	static JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10;
	static JLabel cc1,cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9,cc10;
	static JLabel dd1,dd2,dd3,dd4,dd5,dd6,dd7,dd8,dd9,dd10;
	
	static JLabel aaa1,aaa2,aaa3,aaa4,aaa5,aaa6,aaa7,aaa8,aaa9,aaa10;
	static JLabel bbb1,bbb2,bbb3,bbb4,bbb5,bbb6,bbb7,bbb8,bbb9,bbb10;
	static JLabel ccc1,ccc2,ccc3,ccc4,ccc5,ccc6,ccc7,ccc8,ccc9,ccc10;
	static JLabel ddd1,ddd2,ddd3,ddd4,ddd5,ddd6,ddd7,ddd8,ddd9,ddd10;
	
	static JButton butt1, butt2;
	
	int lod;
	String val;
	String status;
	public Control()
    { 
		frame=new  JFrame("ROUTER");
		/*for(int i = 50; i < 1000; i+=50){
			//System.out.println(i);
			JLabel l1=new JLabel("");
	        l1.setIcon(new ImageIcon("Image//Control//5.png"));
		    l1.setBounds(i,50,190,50);
		    frame.add(l1);
		}*/
		
		lab1=new JLabel("SOURCE");
            lab1.setIcon(new ImageIcon("Image//Control//4.png"));
	    lab1.setBounds(50,200,190,50);
	    frame.add(lab1);
	    
	    lab5=new JLabel("SOURCE");
	    lab5.setIcon(new ImageIcon("Image//Control//5.png"));
	    lab5.setBounds(50,200,190,50);
	    frame.add(lab5);
	    lab5.setVisible(false);
	    
	    lab4=new JLabel("Passive IP Traceback: Disclosing the Locations of IP Spoofers from Path Backscatter",SwingConstants.CENTER);
	   // lab4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	    lab4.setOpaque(true);
	    lab4.setBackground(Color.gray);
	    lab4.setFont(new Font("Papyrus", Font.BOLD, 19));
	    lab4.setForeground(Color.WHITE);
	    
	    //lab4.setBackground(Color.WHITE);
	    lab4.setBounds(0, 0, 1200, 50);
	    frame.add(lab4);
	    
	    
        /*-------------------------------------------*/		
		a1=new JLabel("N1");
        a1.setIcon(new ImageIcon("Image//Control//8.png"));
	    a1.setBounds(150,50,190,50);
	    frame.add(a1);
		
	    a2=new JLabel("N2");
        a2.setIcon(new ImageIcon("Image//Control//8.png"));
	    a2.setBounds(250,50,190,50);
	    frame.add(a2);
	    
	    a3=new JLabel("N3");
        a3.setIcon(new ImageIcon("Image//Control//8.png"));
	    a3.setBounds(350,50,190,50);
	    frame.add(a3);
	    
	    a4=new JLabel("N4");
        a4.setIcon(new ImageIcon("Image//Control//8.png"));
	    a4.setBounds(450,50,190,50);
	    frame.add(a4);
	    
	    a5=new JLabel("N5");
        a5.setIcon(new ImageIcon("Image//Control//8.png"));
	    a5.setBounds(550,50,190,50);
	    frame.add(a5);
	    
	    a6=new JLabel("N6");
	    a6.setIcon(new ImageIcon("Image//Control//8.png"));
	    a6.setBounds(650,50,190,50);
	    frame.add(a6);
	    
	    a7=new JLabel("N7");
	    a7.setIcon(new ImageIcon("Image//Control//8.png"));
	    a7.setBounds(750,50,190,50);
	    frame.add(a7);
	    
	    a8=new JLabel("N8");
	    a8.setIcon(new ImageIcon("Image//Control//8.png"));
	    a8.setBounds(850,50,190,50);
	    frame.add(a8);
	    
	    a9=new JLabel("N9");
	    a9.setIcon(new ImageIcon("Image//Control//8.png"));
	    a9.setBounds(950,50,190,50);
	    frame.add(a9);
	    
	    /*`````````````````````````````````````*/
		aa1=new JLabel("N1");
        aa1.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa1.setBounds(150,50,190,50);
	    frame.add(aa1);
	    aa1.setVisible(false);
	    aa2=new JLabel("N2");
        aa2.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa2.setBounds(250,50,190,50);
	    frame.add(aa2);
	    aa2.setVisible(false);
	    aa3=new JLabel("N3");
        aa3.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa3.setBounds(350,50,190,50);
	    frame.add(aa3);
	    aa3.setVisible(false);
	    aa4=new JLabel("N4");
        aa4.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa4.setBounds(450,50,190,50);
	    frame.add(aa4);
	    aa4.setVisible(false);
	    aa5=new JLabel("N5");
        aa5.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa5.setBounds(550,50,190,50);
	    frame.add(aa5);
	    aa5.setVisible(false);
	    aa6=new JLabel("N6");
	    aa6.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa6.setBounds(650,50,190,50);
	    frame.add(aa6);
	    aa6.setVisible(false);
	    aa7=new JLabel("N7");
	    aa7.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa7.setBounds(750,50,190,50);
	    frame.add(aa7);
	    aa7.setVisible(false);
	    aa8=new JLabel("N8");
	    aa8.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa8.setBounds(850,50,190,50);
	    frame.add(aa8);
	    aa8.setVisible(false);
	    aa9=new JLabel("N9");
	    aa9.setIcon(new ImageIcon("Image//Control//9.png"));
	    aa9.setBounds(950,50,190,50);
	    frame.add(aa9);
	    aa9.setVisible(false);
	    /*`````````````````````````````````````*/
		aaa1=new JLabel("N1");
        aaa1.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa1.setBounds(150,50,190,50);
	    frame.add(aaa1);
	    aaa1.setVisible(false);
	    aaa2=new JLabel("N2");
        aaa2.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa2.setBounds(250,50,190,50);
	    frame.add(aaa2);
	    aaa2.setVisible(false);
	    aaa3=new JLabel("N3");
        aaa3.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa3.setBounds(350,50,190,50);
	    frame.add(aaa3);
	    aaa3.setVisible(false);
	    aaa4=new JLabel("N4");
        aaa4.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa4.setBounds(450,50,190,50);
	    frame.add(aaa4);
	    aaa4.setVisible(false);
	    aaa5=new JLabel("N5");
        aaa5.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa5.setBounds(550,50,190,50);
	    frame.add(aaa5);
	    aaa5.setVisible(false);
	    aaa6=new JLabel("N6");
	    aaa6.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa6.setBounds(650,50,190,50);
	    frame.add(aaa6);
	    aaa6.setVisible(false);
	    aaa7=new JLabel("N7");
	    aaa7.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa7.setBounds(750,50,190,50);
	    frame.add(aaa7);
	    aaa7.setVisible(false);
	    aaa8=new JLabel("N8");
	    aaa8.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa8.setBounds(850,50,190,50);
	    frame.add(aaa8);
	    aaa8.setVisible(false);
	    aaa9=new JLabel("N9");
	    aaa9.setIcon(new ImageIcon("Image//Control//5.png"));
	    aaa9.setBounds(950,50,190,50);
	    frame.add(aaa9);
	    aaa9.setVisible(false);
	    /*--------------------------*/
	    b1=new JLabel("N10");
	    b1.setIcon(new ImageIcon("Image//Control//8.png"));
	    b1.setBounds(150,150,190,50);
	    frame.add(b1);
	    
	    b2=new JLabel("N11");
	    b2.setIcon(new ImageIcon("Image//Control//8.png"));
	    b2.setBounds(250,150,190,50);
	    frame.add(b2);
	    
	    b3=new JLabel("N12");
	    b3.setIcon(new ImageIcon("Image//Control//8.png"));
	    b3.setBounds(350,150,190,50);
	    frame.add(b3);
	    
	    b4=new JLabel("N13");
	    b4.setIcon(new ImageIcon("Image//Control//8.png"));
	    b4.setBounds(450,150,190,50);
	    frame.add(b4);
	    
	    b5=new JLabel("N14");
	    b5.setIcon(new ImageIcon("Image//Control//8.png"));
	    b5.setBounds(550,150,190,50);
	    frame.add(b5);
	    
	    b6=new JLabel("N15");
	    b6.setIcon(new ImageIcon("Image//Control//8.png"));
	    b6.setBounds(650,150,190,50);
	    frame.add(b6);
	    
	    b7=new JLabel("N16");
	    b7.setIcon(new ImageIcon("Image//Control//8.png"));
	    b7.setBounds(750,150,190,50);
	    frame.add(b7);
	    
	    b8=new JLabel("N17");
	    b8.setIcon(new ImageIcon("Image//Control//8.png"));
	    b8.setBounds(850,150,190,50);
	    frame.add(b8);
	    
	    b9=new JLabel("N18");
	    b9.setIcon(new ImageIcon("Image//Control//8.png"));
	    b9.setBounds(950,150,190,50);
	    frame.add(b9);
	    	    
	    /*```````````````````````````````````*/
	    bb1=new JLabel("N10");
	    bb1.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb1.setBounds(150,150,190,50);
	    frame.add(bb1);
	    bb1.setVisible(false);
	    bb2=new JLabel("N11");
	    bb2.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb2.setBounds(250,150,190,50);
	    frame.add(bb2);
	    bb2.setVisible(false);
	    bb3=new JLabel("N12");
	    bb3.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb3.setBounds(350,150,190,50);
	    frame.add(bb3);
	    bb3.setVisible(false);
	    bb4=new JLabel("N13");
	    bb4.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb4.setBounds(450,150,190,50);
	    frame.add(bb4);
	    bb4.setVisible(false);
	    bb5=new JLabel("N14");
	    bb5.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb5.setBounds(550,150,190,50);
	    frame.add(bb5);
	    bb5.setVisible(false);
	    bb6=new JLabel("N15");
	    bb6.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb6.setBounds(650,150,190,50);
	    frame.add(bb6);
	    bb6.setVisible(false);
	    bb7=new JLabel("N16");
	    bb7.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb7.setBounds(750,150,190,50);
	    frame.add(bb7);
	    bb7.setVisible(false);
	    bb8=new JLabel("N17");
	    bb8.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb8.setBounds(850,150,190,50);
	    frame.add(bb8);
	    bb8.setVisible(false);
	    bb9=new JLabel("N18");
	    bb9.setIcon(new ImageIcon("Image//Control//9.png"));
	    bb9.setBounds(950,150,190,50);
	    frame.add(bb9);
	    bb9.setVisible(false);
	    /*```````````````````````````````````*/
	    bbb1=new JLabel("N10");
	    bbb1.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb1.setBounds(150,150,190,50);
	    frame.add(bbb1);
	    bbb1.setVisible(false);
	    bbb2=new JLabel("N11");
	    bbb2.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb2.setBounds(250,150,190,50);
	    frame.add(bbb2);
	    bbb2.setVisible(false);
	    bbb3=new JLabel("N12");
	    bbb3.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb3.setBounds(350,150,190,50);
	    frame.add(bbb3);
	    bbb3.setVisible(false);
	    bbb4=new JLabel("N13");
	    bbb4.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb4.setBounds(450,150,190,50);
	    frame.add(bbb4);
	    bbb4.setVisible(false);
	    bbb5=new JLabel("N14");
	    bbb5.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb5.setBounds(550,150,190,50);
	    frame.add(bbb5);
	    bbb5.setVisible(false);
	    bbb6=new JLabel("N15");
	    bbb6.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb6.setBounds(650,150,190,50);
	    frame.add(bbb6);
	    bbb6.setVisible(false);
	    bbb7=new JLabel("N16");
	    bbb7.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb7.setBounds(750,150,190,50);
	    frame.add(bbb7);
	    bbb7.setVisible(false);
	    bbb8=new JLabel("N17");
	    bbb8.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb8.setBounds(850,150,190,50);
	    frame.add(bbb8);
	    bbb8.setVisible(false);
	    bbb9=new JLabel("N18");
	    bbb9.setIcon(new ImageIcon("Image//Control//5.png"));
	    bbb9.setBounds(950,150,190,50);
	    frame.add(bbb9);
	    bbb9.setVisible(false);
	    /*--------------------------*/
	    c1=new JLabel("N19");
	    c1.setIcon(new ImageIcon("Image//Control//8.png"));
	    c1.setBounds(150,250,190,50);
	    frame.add(c1);
	    
	    c2=new JLabel("N20");
	    c2.setIcon(new ImageIcon("Image//Control//8.png"));
	    c2.setBounds(250,250,190,50);
	    frame.add(c2);
	    
	    c3=new JLabel("N21");
	    c3.setIcon(new ImageIcon("Image//Control//8.png"));
	    c3.setBounds(350,250,190,50);
	    frame.add(c3);
	    
	    c4=new JLabel("N22");
	    c4.setIcon(new ImageIcon("Image//Control//8.png"));
	    c4.setBounds(450,250,190,50);
	    frame.add(c4);
	    
	    c5=new JLabel("N23");
	    c5.setIcon(new ImageIcon("Image//Control//8.png"));
	    c5.setBounds(550,250,190,50);
	    frame.add(c5);
	    
	    c6=new JLabel("N24");
	    c6.setIcon(new ImageIcon("Image//Control//8.png"));
	    c6.setBounds(650,250,190,50);
	    frame.add(c6);
	    
	    c7=new JLabel("N25");
	    c7.setIcon(new ImageIcon("Image//Control//8.png"));
	    c7.setBounds(750,250,190,50);
	    frame.add(c7);
	    
	    c8=new JLabel("N26");
	    c8.setIcon(new ImageIcon("Image//Control//8.png"));
	    c8.setBounds(850,250,190,50);
	    frame.add(c8);
	    
	    c9=new JLabel("N27");
	    c9.setIcon(new ImageIcon("Image//Control//8.png"));
	    c9.setBounds(950,250,190,50);
	    frame.add(c9);
	    /*`````````````````````````````````````*/
	    cc1=new JLabel("N19");
	    cc1.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc1.setBounds(150,250,190,50);
	    frame.add(cc1);
	    cc1.setVisible(false);
	    cc2=new JLabel("N20");
	    cc2.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc2.setBounds(250,250,190,50);
	    frame.add(cc2);
	    cc2.setVisible(false);
	    cc3=new JLabel("N21");
	    cc3.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc3.setBounds(350,250,190,50);
	    frame.add(cc3);
	    cc3.setVisible(false);
	    cc4=new JLabel("N22");
	    cc4.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc4.setBounds(450,250,190,50);
	    frame.add(cc4);
	    cc4.setVisible(false);
	    cc5=new JLabel("N23");
	    cc5.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc5.setBounds(550,250,190,50);
	    frame.add(cc5);
	    cc5.setVisible(false);
	    cc6=new JLabel("N24");
	    cc6.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc6.setBounds(650,250,190,50);
	    frame.add(cc6);
	    cc6.setVisible(false);
	    cc7=new JLabel("N25");
	    cc7.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc7.setBounds(750,250,190,50);
	    frame.add(cc7);
	    cc7.setVisible(false);
	    cc8=new JLabel("N26");
	    cc8.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc8.setBounds(850,250,190,50);
	    frame.add(cc8);
	    cc8.setVisible(false);
	    cc9=new JLabel("N27");
	    cc9.setIcon(new ImageIcon("Image//Control//9.png"));
	    cc9.setBounds(950,250,190,50);
	    frame.add(cc9);
	    cc9.setVisible(false);
	    /*`````````````````````````````````````*/
	    ccc1=new JLabel("N19");
	    ccc1.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc1.setBounds(150,250,190,50);
	    frame.add(ccc1);
	    ccc1.setVisible(false);
	    ccc2=new JLabel("N20");
	    ccc2.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc2.setBounds(250,250,190,50);
	    frame.add(ccc2);
	    ccc2.setVisible(false);
	    ccc3=new JLabel("N21");
	    ccc3.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc3.setBounds(350,250,190,50);
	    frame.add(ccc3);
	    ccc3.setVisible(false);
	    ccc4=new JLabel("N22");
	    ccc4.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc4.setBounds(450,250,190,50);
	    frame.add(ccc4);
	    ccc4.setVisible(false);
	    ccc5=new JLabel("N23");
	    ccc5.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc5.setBounds(550,250,190,50);
	    frame.add(ccc5);
	    ccc5.setVisible(false);
	    ccc6=new JLabel("N24");
	    ccc6.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc6.setBounds(650,250,190,50);
	    frame.add(ccc6);
	    ccc6.setVisible(false);
	    ccc7=new JLabel("N25");
	    ccc7.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc7.setBounds(750,250,190,50);
	    frame.add(ccc7);
	    ccc7.setVisible(false);
	    ccc8=new JLabel("N26");
	    ccc8.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc8.setBounds(850,250,190,50);
	    frame.add(ccc8);
	    ccc8.setVisible(false);
	    ccc9=new JLabel("N27");
	    ccc9.setIcon(new ImageIcon("Image//Control//5.png"));
	    ccc9.setBounds(950,250,190,50);
	    frame.add(ccc9);
	    ccc9.setVisible(false);
	    /*--------------------------*/
	    d1=new JLabel("N28");
	    d1.setIcon(new ImageIcon("Image//Control//8.png"));
	    d1.setBounds(150,350,190,50);
	    frame.add(d1);
	    
	    d2=new JLabel("N29");
	    d2.setIcon(new ImageIcon("Image//Control//8.png"));
	    d2.setBounds(250,350,190,50);
	    frame.add(d2);
	    
	    d3=new JLabel("N30");
	    d3.setIcon(new ImageIcon("Image//Control//8.png"));
	    d3.setBounds(350,350,190,50);
	    frame.add(d3);
	    
	    d4=new JLabel("N31");
	    d4.setIcon(new ImageIcon("Image//Control//8.png"));
	    d4.setBounds(450,350,190,50);
	    frame.add(d4);
	    
	    d5=new JLabel("N32");
	    d5.setIcon(new ImageIcon("Image//Control//8.png"));
	    d5.setBounds(550,350,190,50);
	    frame.add(d5);
	    
	    d6=new JLabel("N33");
	    d6.setIcon(new ImageIcon("Image//Control//8.png"));
	    d6.setBounds(650,350,190,50);
	    frame.add(d6);
	    
	    d7=new JLabel("N34");
	    d7.setIcon(new ImageIcon("Image//Control//8.png"));
	    d7.setBounds(750,350,190,50);
	    frame.add(d7);
	    
	    d8=new JLabel("N35");
	    d8.setIcon(new ImageIcon("Image//Control//8.png"));
	    d8.setBounds(850,350,190,50);
	    frame.add(d8);
	    
	    d9=new JLabel("N36");
	    d9.setIcon(new ImageIcon("Image//Control//8.png"));
	    d9.setBounds(950,350,190,50);
	    frame.add(d9);
	    /*````````````````````````````*/
	    dd1=new JLabel("N28");
	    dd1.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd1.setBounds(150,350,190,50);
	    frame.add(dd1);
	    dd1.setVisible(false);
	    dd2=new JLabel("N29");
	    dd2.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd2.setBounds(250,350,190,50);
	    frame.add(dd2);
	    dd2.setVisible(false);
	    dd3=new JLabel("N30");
	    dd3.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd3.setBounds(350,350,190,50);
	    frame.add(dd3);
	    dd3.setVisible(false);
	    dd4=new JLabel("N31");
	    dd4.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd4.setBounds(450,350,190,50);
	    frame.add(dd4);
	    dd4.setVisible(false);
	    dd5=new JLabel("N32");
	    dd5.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd5.setBounds(550,350,190,50);
	    frame.add(dd5);
	    dd5.setVisible(false);
	    dd6=new JLabel("N33");
	    dd6.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd6.setBounds(650,350,190,50);
	    frame.add(dd6);
	    dd6.setVisible(false);
	    dd7=new JLabel("N34");
	    dd7.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd7.setBounds(750,350,190,50);
	    frame.add(dd7);
	    dd7.setVisible(false);
	    dd8=new JLabel("N35");
	    dd8.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd8.setBounds(850,350,190,50);
	    frame.add(dd8);
	    dd8.setVisible(false);
	    dd9=new JLabel("N36");
	    dd9.setIcon(new ImageIcon("Image//Control//9.png"));
	    dd9.setBounds(950,350,190,50);
	    frame.add(dd9);
	    dd9.setVisible(false);
	    
	    /*````````````````````````````*/
	    ddd1=new JLabel("N28");
	    ddd1.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd1.setBounds(150,350,190,50);
	    frame.add(ddd1);
	    ddd1.setVisible(false);
	    ddd2=new JLabel("N29");
	    ddd2.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd2.setBounds(250,350,190,50);
	    frame.add(ddd2);
	    ddd2.setVisible(false);
	    ddd3=new JLabel("N30");
	    ddd3.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd3.setBounds(350,350,190,50);
	    frame.add(ddd3);
	    ddd3.setVisible(false);
	    ddd4=new JLabel("N31");
	    ddd4.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd4.setBounds(450,350,190,50);
	    frame.add(ddd4);
	    ddd4.setVisible(false);
	    ddd5=new JLabel("N32");
	    ddd5.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd5.setBounds(550,350,190,50);
	    frame.add(ddd5);
	    ddd5.setVisible(false);
	    ddd6=new JLabel("N33");
	    ddd6.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd6.setBounds(650,350,190,50);
	    frame.add(ddd6);
	    ddd6.setVisible(false);
	    ddd7=new JLabel("N34");
	    ddd7.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd7.setBounds(750,350,190,50);
	    frame.add(ddd7);
	    ddd7.setVisible(false);
	    ddd8=new JLabel("N35");
	    ddd8.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd8.setBounds(850,350,190,50);
	    frame.add(ddd8);
	    ddd8.setVisible(false);
	    ddd9=new JLabel("N36");
	    ddd9.setIcon(new ImageIcon("Image//Control//5.png"));
	    ddd9.setBounds(950,350,190,50);
	    frame.add(ddd9);
	    ddd9.setVisible(false);
	    /*--------------------------*/
		
	  /*  lab2=new JLabel("");
	    lab2.setIcon(new ImageIcon("Image//Control//4.png"));
	    lab2.setBounds(240,120,190,50);
	    frame.add(lab2);*/
	    
	    lab3=new JLabel("DESTINATION");
	    lab3.setIcon(new ImageIcon("Image//Control//3.png"));
	    lab3.setBounds(1050,200,190,50);
	    frame.add(lab3);
	    
	    lab4=new JLabel("DESTINATION");
	    lab4.setIcon(new ImageIcon("Image//Control//5.png"));
	    lab4.setBounds(1050,200,190,50);
	    frame.add(lab4);
	     
	    
	    butt1=new JButton("VIEW THE NODES INFORMATION");
	    butt1.setBounds(450, 440, 250, 25);
	    frame.add(butt1);
	    
	    butt2=new JButton("REFRESH");
	    butt2.setBounds(1050, 440, 100, 25);
	    frame.add(butt2);
	    
	    butt2.addActionListener( new ActionListener(){ 
			public void actionPerformed( ActionEvent e1) {
				//System.out.println("Welcome to Refresh!");
				
				lab4.setVisible(false);lab3.setVisible(true);
				lab5.setVisible(false);lab1.setVisible(true);
				
				a1.setVisible(true);aa1.setVisible(false);aaa1.setVisible(false);
				b1.setVisible(true);bb1.setVisible(false);bbb1.setVisible(false);
				c1.setVisible(true);cc1.setVisible(false);ccc1.setVisible(false);
				d1.setVisible(true);dd1.setVisible(false);ddd1.setVisible(false);
				
				a2.setVisible(true);aa2.setVisible(false);aaa2.setVisible(false);
				b2.setVisible(true);bb2.setVisible(false);bbb2.setVisible(false);
				c2.setVisible(true);cc2.setVisible(false);ccc2.setVisible(false);
				d2.setVisible(true);dd2.setVisible(false);ddd2.setVisible(false);
				
				a3.setVisible(true);aa3.setVisible(false);aaa3.setVisible(false);
				b3.setVisible(true);bb3.setVisible(false);bbb3.setVisible(false);
				c3.setVisible(true);cc3.setVisible(false);ccc3.setVisible(false);
				d3.setVisible(true);dd3.setVisible(false);ddd3.setVisible(false);
				
				a4.setVisible(true);aa4.setVisible(false);aaa4.setVisible(false);
				b4.setVisible(true);bb4.setVisible(false);bbb4.setVisible(false);
				c4.setVisible(true);cc4.setVisible(false);ccc4.setVisible(false);
				d4.setVisible(true);dd4.setVisible(false);ddd4.setVisible(false);
				
				a5.setVisible(true);aa5.setVisible(false);aaa5.setVisible(false);
				b5.setVisible(true);bb5.setVisible(false);bbb5.setVisible(false);
				c5.setVisible(true);cc5.setVisible(false);ccc5.setVisible(false);
				d5.setVisible(true);dd5.setVisible(false);ddd5.setVisible(false);
				
				a6.setVisible(true);aa6.setVisible(false);aaa6.setVisible(false);
				b6.setVisible(true);bb6.setVisible(false);bbb6.setVisible(false);
				c6.setVisible(true);cc6.setVisible(false);ccc6.setVisible(false);
				d6.setVisible(true);dd6.setVisible(false);ddd6.setVisible(false);
				
				a7.setVisible(true);aa7.setVisible(false);aaa7.setVisible(false);
				b7.setVisible(true);bb7.setVisible(false);bbb7.setVisible(false);
				c7.setVisible(true);cc7.setVisible(false);ccc7.setVisible(false);
				d7.setVisible(true);dd7.setVisible(false);ddd7.setVisible(false);
				
				a8.setVisible(true);aa8.setVisible(false);aaa8.setVisible(false);
				b8.setVisible(true);bb8.setVisible(false);bbb8.setVisible(false);
				c8.setVisible(true);cc8.setVisible(false);ccc8.setVisible(false);
				d8.setVisible(true);dd8.setVisible(false);ddd8.setVisible(false);
				
				a9.setVisible(true);aa9.setVisible(false);aaa9.setVisible(false);
				b9.setVisible(true);bb9.setVisible(false);bbb9.setVisible(false);
				c9.setVisible(true);cc9.setVisible(false);ccc9.setVisible(false);
				d9.setVisible(true);dd9.setVisible(false);ddd9.setVisible(false);
			}
	    });
	    
	    butt1.addActionListener( new ActionListener(){ 
			public void actionPerformed( ActionEvent e1) {				
				 

				
				    Random t = new Random();
				    System.out.println("Random: "+t.nextInt(10));
				    
				    //lod=t.nextInt(10);
				    lod=10;
				    Thread t0 = new Thread(){  
						  public void run(){ 
							  try {
								sleep(1000);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							lab1.setVisible(false);
							lab5.setVisible(true);
						  }  
						   };
				    
				Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(2000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
						 
						 if(lod==1){
							 status=getRecord("Node1");
							 System.out.println(status);
							 if(status.equals("normal")){
								 aaa1.setVisible(true); 
								 a1.setVisible(false);
							 }else{
								 aaa1.setVisible(false); 
								 a1.setVisible(false);
								 aa1.setVisible(true);
							 }
							 
						 }else if(lod==2){
							 status=getRecord("Node10");
							 System.out.println(status);
							 if(status.equals("normal")){
								 bbb1.setVisible(true); 
								 b1.setVisible(false);
							 }else{
								 bbb1.setVisible(false); 
								 b1.setVisible(false);
								 bb1.setVisible(true);
							 }
						 }
						 else if(lod==3){
							 status=getRecord("Node28");
							 System.out.println(status);
							 if(status.equals("normal")){
							 ddd1.setVisible(true); 
							 d1.setVisible(false);
							 }else{
								 ddd1.setVisible(false); 
								 d1.setVisible(false);
								 dd1.setVisible(true);
							 }
						 }
						else if(lod==4){
							status=getRecord("Node19");
							 System.out.println(status);
							 if(status.equals("normal")){
								ccc1.setVisible(true); 
								 c1.setVisible(false);		
							 }else{
								 ccc1.setVisible(false); 
								 c1.setVisible(false);
								 cc1.setVisible(true); 
							 }
						}
						else if(lod==5){
							status=getRecord("Node28");
							 System.out.println(status);
							 if(status.equals("normal")){
								ddd1.setVisible(true); 
								 d1.setVisible(false);
							 }else{
								 ddd1.setVisible(false); 
								 d1.setVisible(false);
								 dd1.setVisible(true); 
							 }
						}
						else if(lod==6){
							status=getRecord("Node19");
							 System.out.println(status);
							 if(status.equals("normal")){
							ccc1.setVisible(true); 
							 c1.setVisible(false);
							 }else{
								 ccc1.setVisible(false); 
								 c1.setVisible(false);
								 cc1.setVisible(true);
							 }
						}
						else if(lod==7){
							status=getRecord("Node19");
							 System.out.println(status);
							 if(status.equals("normal")){
								ccc1.setVisible(true); 
								 c1.setVisible(false);
							 }else{
								 ccc1.setVisible(false); 
								 c1.setVisible(false);
								 cc1.setVisible(true); 
							 }
						}
						else if(lod==8){
							status=getRecord("Node10");
							 System.out.println(status);
							 if(status.equals("normal")){
								 bbb1.setVisible(true); 
								 b1.setVisible(false);
							 }else{
								 bbb1.setVisible(false); 
								 b1.setVisible(false);
								 bb1.setVisible(true); 
							 }
						}
						else if(lod==9){
							status=getRecord("Node1");
							 System.out.println(status);
							 if(status.equals("normal")){
							aaa1.setVisible(true); 
							 a1.setVisible(false);
							 }else{
								 aaa1.setVisible(false); 
								 a1.setVisible(false);
								 aa1.setVisible(true); 
							 }
						}
						else if(lod==10){
							status=getRecord("Node10");
							 System.out.println(status);
							 if(status.equals("normal")){
							 bbb1.setVisible(true); 
							 b1.setVisible(false);
							 }else{
								 bbb1.setVisible(false); 
								 b1.setVisible(false);
								 bb1.setVisible(true);
							 }
						}
					  }  
					   };
					   
					   
			   Thread t2 = new Thread(){  
					  public void run(){  
						  try {
								sleep(4000);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
						  						  
						  	if(lod==1){
							  	  status=getRecord("Node11");
							  	System.out.println(status);
							  	  if(status.equals("normal")){
							  		  bbb2.setVisible(true); 
									  b2.setVisible(false);
							  	  }
							  	  else{
							  		  bbb2.setVisible(false); 
									  b2.setVisible(false);
									  bb2.setVisible(true);
							  	  }
								  
							 }else if(lod==2){
								 status=getRecord("Node2");
								  	System.out.println(status);
								  	  if(status.equals("normal")){
										  aaa2.setVisible(true); 
										  a2.setVisible(false);
								  	  }else{
								  		  aaa2.setVisible(false); 
										  a2.setVisible(false);
										  aa2.setVisible(true);
								  	  }
							 }
							 else if(lod==3){
								 status=getRecord("Node29");
								 System.out.println(status);
								 if(status.equals("normal")){
								 ddd2.setVisible(true); 
								 d2.setVisible(false);
								 }else{
									 ddd2.setVisible(false); 
									 d2.setVisible(false); 
									 dd2.setVisible(true);
								 }
							 }
							else if(lod==4){
								status=getRecord("Node11");
								 System.out.println(status);
								 if(status.equals("normal")){
									bbb2.setVisible(true); 
									 b2.setVisible(false);	
								 }else{
									 bbb2.setVisible(false); 
									 b2.setVisible(false);
									 bb2.setVisible(true);
								 }
							}
							else if(lod==5){
								status=getRecord("Node29");
								 System.out.println(status);
								 if(status.equals("normal")){
									ddd2.setVisible(true); 
									 d2.setVisible(false);
								 }else{
									 ddd2.setVisible(false); 
									 d2.setVisible(false);
									 dd2.setVisible(true);
								 }
							}
							else if(lod==6){
								status=getRecord("Node11");
							  	System.out.println(status);
							  	  if(status.equals("normal")){
								bbb2.setVisible(true); 
								  b2.setVisible(false);
							  	  }else{
							  		bbb2.setVisible(false); 
									  b2.setVisible(false);
									  bb2.setVisible(true); 
							  	  }
							}
							else if(lod==7){
								status=getRecord("Node20");
							  	System.out.println(status);
							  	  if(status.equals("normal")){
								ccc2.setVisible(true); 
								  c2.setVisible(false);
							  	  }else{
							  		ccc2.setVisible(false); 
									  c2.setVisible(false);
									  cc2.setVisible(true); 
							  	  }
							}
							else if(lod==8){
								status=getRecord("Node11");
							  	System.out.println(status);
							  	  if(status.equals("normal")){
									bbb2.setVisible(true); 
									  b2.setVisible(false);
							  	  }else{
							  		bbb2.setVisible(false); 
									  b2.setVisible(false);
									  bb2.setVisible(true);
							  	  }
							}
							else if(lod==9){
								status=getRecord("Node11");
							  	System.out.println(status);
							  	  if(status.equals("normal")){
								bbb2.setVisible(true); 
								  b2.setVisible(false);
							  	  }else{
							  		bbb2.setVisible(false); 
									  b2.setVisible(false);
									  bb2.setVisible(true);
							  	  }
							}
							else if(lod==10){
								status=getRecord("Node11");
								 System.out.println(status);
								 if(status.equals("normal")){
								bbb2.setVisible(true); 
								  b2.setVisible(false);
								 }else{
									 bbb2.setVisible(false); 
									  b2.setVisible(false);
									  bb2.setVisible(true);
								 }
							}
					  }  
					   };
							   
							   
			   Thread t3 = new Thread() {  
					  public void run(){  
						  try {
								sleep(6000);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
						 						  
						  if(lod==1){
							  	status=getRecord("Node12");
							  	System.out.println(status);
							  	 if(status.equals("normal")){
							  		bbb3.setVisible(true); 
									  b3.setVisible(false);
							  	 }else{
							  		bbb3.setVisible(false); 
									  b3.setVisible(false);
									  bb3.setVisible(true);
							  	 }
								 
							 }else if(lod==2){
								 status=getRecord("Node3");
								  	System.out.println(status);
								  	  if(status.equals("normal")){
										 aaa3.setVisible(true); 
										  a3.setVisible(false);
								  	  }else{
								  		aaa3.setVisible(false); 
										  a3.setVisible(false);
										  aa3.setVisible(true);
								  	  }
							 }
							 else if(lod==3){
								 status=getRecord("Node30");
								  	System.out.println(status);
								  	  if(status.equals("normal")){
											 ddd3.setVisible(true); 
											 d3.setVisible(false);
								  	  }else{
								  		 ddd3.setVisible(false);
								  		dd3.setVisible(true); 
										 d3.setVisible(false);
								  	  }
							 }
							else if(lod==4){
								status=getRecord("Node21");
								 System.out.println(status);
								 if(status.equals("normal")){
									ccc3.setVisible(true); 
									 c3.setVisible(false);	
								 }else{
									 ccc3.setVisible(false); 
									 c3.setVisible(false);
									 cc3.setVisible(true);
								 }
							}
							else if(lod==5){
								status=getRecord("Node30");
								 System.out.println(status);
								 if(status.equals("normal")){
									ddd3.setVisible(true); 
									 d3.setVisible(false);
								 }else{
									 ddd3.setVisible(false); 
									 d3.setVisible(false);
									 dd3.setVisible(true); 
								 }
							}
							else if(lod==6){
								 status=getRecord("Node3");
								  	System.out.println(status);
								  	  if(status.equals("normal")){
								aaa3.setVisible(true); 
								  a3.setVisible(false);
								  	  }else{
								  		aaa3.setVisible(false); 
										  a3.setVisible(false);
										  aa3.setVisible(true); 
								  	  }
							}
							else if(lod==7){
								status=getRecord("Node21");
								 System.out.println(status);
								 if(status.equals("normal")){
								ccc3.setVisible(true); 
								 c3.setVisible(false);
								 }else{
									 ccc3.setVisible(false); 
									 c3.setVisible(false);
									 cc3.setVisible(true);
								 }
							}
							else if(lod==8){
								status=getRecord("Node21");
								 System.out.println(status);
								 if(status.equals("normal")){
									ccc3.setVisible(true); 
									 c3.setVisible(false);
								 }else{
									 ccc3.setVisible(false); 
									 c3.setVisible(false);
									 cc3.setVisible(true);
								 }
							}
							else if(lod==9){
								status=getRecord("Node21");
								 System.out.println(status);
								 if(status.equals("normal")){
								ccc3.setVisible(true); 
								 c3.setVisible(false);
								 }else{
									 ccc3.setVisible(false); 
									 c3.setVisible(false);
									 cc3.setVisible(true); 
								 }
							}
							else if(lod==10){
								status=getRecord("Node3");
							  	System.out.println(status);
							  	  if(status.equals("normal")){
								aaa3.setVisible(true); 
								  a3.setVisible(false);
							  	  }else{
							  		aaa3.setVisible(false); 
									  a3.setVisible(false);
									  aa3.setVisible(true); 
							  	  }
							}
					  }  
					   };
					   
					   Thread t4 = new Thread() {  
							  public void run(){  
								  try {
										sleep(8000);
									} catch (InterruptedException e) {

										e.printStackTrace();
									}
								 /* aaa4.setVisible(true);  
								  a4.setVisible(false);*/
								  
								  if(lod==1){
									 
									  status=getRecord("Node13");
									  System.out.println(status);
									  if(status.equals("normal")){
										  bbb4.setVisible(true); 
										  b4.setVisible(false);
									  }else{
										  bbb4.setVisible(false); 
										  b4.setVisible(false);
										  bb4.setVisible(true);
									  }
										 
									 }else if(lod==2){
										 status=getRecord("Node4");
										  System.out.println(status);
										  if(status.equals("normal")){
										 aaa4.setVisible(true); 
										  a4.setVisible(false);
										  }else{
											  aaa4.setVisible(false); 
											  a4.setVisible(false);
											  aa4.setVisible(true); 
										  }
									 }
									 else if(lod==3){
										 status=getRecord("Node22");
										  System.out.println(status);
										  if(status.equals("normal")){
										 ccc4.setVisible(true); 
										 c4.setVisible(false);
										  }else{
											  ccc4.setVisible(false); 
												 c4.setVisible(false);
												 cc4.setVisible(true);
										  }
									 }
									else if(lod==4){
										status=getRecord("Node22");
										 System.out.println(status);
										 if(status.equals("normal")){
											ccc4.setVisible(true); 
											 c4.setVisible(false);	
										 }else{
											 ccc4.setVisible(false); 
											 c4.setVisible(false);
											 cc4.setVisible(true); 
										 }
									}
									else if(lod==5){
										status=getRecord("Node22");
										 System.out.println(status);
										 if(status.equals("normal")){
										ccc4.setVisible(true); 
										 c4.setVisible(false);
										 }else{
											 ccc4.setVisible(false); 
											 c4.setVisible(false);
											 cc4.setVisible(true); 
										 }
									}
									else if(lod==6){
										status=getRecord("Node13");
										  System.out.println(status);
										  if(status.equals("normal")){
										 bbb4.setVisible(true); 
										  b4.setVisible(false);
										  }else{
											  bbb4.setVisible(false); 
											  b4.setVisible(false);
											  bb4.setVisible(true); 
										  }
									}
									else if(lod==7){
										 status=getRecord("Node13");
										  System.out.println(status);
										  if(status.equals("normal")){
										 bbb4.setVisible(true); 
										  b4.setVisible(false);
										  }else{
											  bbb4.setVisible(false); 
											  b4.setVisible(false);
											  bb4.setVisible(true); 
										  }
									}
									else if(lod==8){
										status=getRecord("Node22");
										  System.out.println(status);
										  if(status.equals("normal")){
											ccc4.setVisible(true); 
											 c4.setVisible(false);
										  }else{
											  ccc4.setVisible(false); 
												 c4.setVisible(false);
												 cc4.setVisible(true); 
										  }
									}
									else if(lod==9){
										status=getRecord("Node31");
										  System.out.println(status);
										  if(status.equals("normal")){
										ddd4.setVisible(true); 
										 d4.setVisible(false);
										  }else{
											  ddd4.setVisible(false); 
												 d4.setVisible(false);
												 dd4.setVisible(true);
										  }
									}
									else if(lod==10){
										status=getRecord("Node4");
										  System.out.println(status);
										  if(status.equals("normal")){
										aaa4.setVisible(true); 
										  a4.setVisible(false);
										  }else{
											  aaa4.setVisible(false); 
											  a4.setVisible(false);
											  aa4.setVisible(true); 
											
										  }
									}
							  }  
							   };
							   Thread t5 = new Thread() {  
									  public void run(){  
										  try {
												sleep(10000);
											} catch (InterruptedException e) {

												e.printStackTrace();
											}
										
										  if(lod==1){
											  status=getRecord("Node23");
											  System.out.println(status);
											  if(status.equals("normal")){
												  ccc5.setVisible(true); 
												  c5.setVisible(false);
											  }else{
												  ccc5.setVisible(false); 
												  c5.setVisible(false);
												  cc5.setVisible(true);
											  }
												 
											 }else if(lod==2){
												 status=getRecord("Node14");
												  System.out.println(status);
												  if(status.equals("normal")){
													  bbb5.setVisible(true); 
													  b5.setVisible(false);
												  }else{
													  bbb5.setVisible(false); 
													  b5.setVisible(false);
													  bb5.setVisible(true);
												  }
											 }
											 else if(lod==3){
												 status=getRecord("Node23");
												  System.out.println(status);
												  if(status.equals("normal")){
														 ccc5.setVisible(true); 
														 c5.setVisible(false);
												  }else{
													  ccc5.setVisible(false); 
														 c5.setVisible(false);
														 cc5.setVisible(true); 
												  }
											 }
											else if(lod==4){
												status=getRecord("Node32");
												  System.out.println(status);
												  if(status.equals("normal")){
													ddd5.setVisible(true); 
													 d5.setVisible(false);	
												  }else{
													  ddd5.setVisible(false); 
														 d5.setVisible(false);
														 dd5.setVisible(true); 
												  }
											}
											else if(lod==5){
												 status=getRecord("Node14");
												  System.out.println(status);
												  if(status.equals("normal")){
												bbb5.setVisible(true); 
												  b5.setVisible(false);
												  }else{
													  bbb5.setVisible(false); 
													  b5.setVisible(false);
													  bb5.setVisible(true); 
												  }
											}
											else if(lod==6){
												status=getRecord("Node23");
												  System.out.println(status);
												  if(status.equals("normal")){
													 ccc5.setVisible(true); 
													 c5.setVisible(false);
												  }else{
													  ccc5.setVisible(false); 
														 c5.setVisible(false);
														 cc5.setVisible(true); 
												  }
											}
											else if(lod==7){
												status=getRecord("Node5");
												  System.out.println(status);
												  if(status.equals("normal")){
														 aaa5.setVisible(true); 
														 a5.setVisible(false);
												  }else{
													     aaa5.setVisible(false); 
														 a5.setVisible(false);
														 aa5.setVisible(true); 
												  }
											}
											else if(lod==8){
												status=getRecord("Node32");
												  System.out.println(status);
												  if(status.equals("normal")){
												ddd5.setVisible(true); 
												 d5.setVisible(false);	
												  }else{
													  ddd5.setVisible(false); 
														 d5.setVisible(false);	
														 dd5.setVisible(true);
												  }
											}
											else if(lod==9){
												status=getRecord("Node23");
												  System.out.println(status);
												  if(status.equals("normal")){
												 ccc5.setVisible(true); 
												 c5.setVisible(false);
												  }else{
													  ccc5.setVisible(false); 
														 c5.setVisible(false);
														 cc5.setVisible(true); 														 
												  }
											}
											else if(lod==10){
												 status=getRecord("Node14");
												  System.out.println(status);
												  if(status.equals("normal")){
												 bbb5.setVisible(true); 
												  b5.setVisible(false);
												  }else{
													  bbb5.setVisible(false); 
													  b5.setVisible(false);
													  bb5.setVisible(true); 
													  
												  }
											}
									  }  
									   };
									   
									   Thread t6 = new Thread() {  
											  public void run(){  
												  try {
														sleep(12000);
													} catch (InterruptedException e) {

														e.printStackTrace();
													}
												
												  if(lod==1){
													  status=getRecord("Node33");
													  System.out.println(status);
													  if(status.equals("normal")){
														  ddd6.setVisible(true); 
														  d6.setVisible(false);
													  }else{
														  ddd6.setVisible(false); 
														  d6.setVisible(false);
														  dd6.setVisible(true);														  
													  }
														 
													 }else if(lod==2){
														 status=getRecord("Node24");
														  System.out.println(status);
														  if(status.equals("normal")){
																 ccc6.setVisible(true); 
																  c6.setVisible(false);
														  }else{
															  ccc6.setVisible(false); 
															  c6.setVisible(false);
															  cc6.setVisible(true); 
														  }
													 }
													 else if(lod==3){
														 status=getRecord("Node15");
														  System.out.println(status);
														  if(status.equals("normal")){
															 bbb6.setVisible(true); 
															 b6.setVisible(false);
														  }else{
															  bbb6.setVisible(false); 
																 b6.setVisible(false);
																 bb6.setVisible(true); 
														  }
													 }
													else if(lod==4){
														status=getRecord("Node33");
														  System.out.println(status);
														  if(status.equals("normal")){
															ddd6.setVisible(true); 
															 d6.setVisible(false);	
														  }else{
															  ddd6.setVisible(false); 
																 d6.setVisible(false);
																 dd6.setVisible(true); 
														  }
													}
													else if(lod==5){
														status=getRecord("Node6");
														  System.out.println(status);
														  if(status.equals("normal")){
														aaa6.setVisible(true); 
														 a6.setVisible(false);
														  }else{
															  aaa6.setVisible(false); 
																 a6.setVisible(false);
																 aa6.setVisible(true);
														  }
													}
													else if(lod==6){
														status=getRecord("Node33");
														  System.out.println(status);
														  if(status.equals("normal")){
														ddd6.setVisible(true); 
														  d6.setVisible(false);
														  }else{
															  ddd6.setVisible(false); 
															  d6.setVisible(false);
															  dd6.setVisible(true); 
														  }
													}
													else if(lod==7){
														status=getRecord("Node15");
														  System.out.println(status);
														  if(status.equals("normal")){
															bbb6.setVisible(true); 
															 b6.setVisible(false);
														  }else{
															  bbb6.setVisible(false); 
																 b6.setVisible(false);
																 bb6.setVisible(true); 
														  }
													}
													else if(lod==8){
														  status=getRecord("Node33");
														  System.out.println(status);
														  if(status.equals("normal")){
														ddd6.setVisible(true); 
														  d6.setVisible(false);
														  }else{
															  ddd6.setVisible(false); 
															  d6.setVisible(false);
															  dd6.setVisible(true); 
														  }
													}
													else if(lod==9){
														status=getRecord("Node15");
														  System.out.println(status);
														  if(status.equals("normal")){
														bbb6.setVisible(true); 
														 b6.setVisible(false);
														  }else{
															  bbb6.setVisible(false); 
																 b6.setVisible(false);
																 bb6.setVisible(true); 
														  }
													}
													else if(lod==10){
														status=getRecord("Node24");
														  System.out.println(status);
														  if(status.equals("normal")){
														ccc6.setVisible(true); 
														  c6.setVisible(false);
														  }else{
															  ccc6.setVisible(false); 
															  c6.setVisible(false);
															  cc6.setVisible(true); 
															  
														  }
													}
											  }  
											   };
											   
											   Thread t7 = new Thread() {  
													  public void run(){  
														  try {
																sleep(14000);
															} catch (InterruptedException e) {

																e.printStackTrace();
															}
														  if(lod==1){
															  status=getRecord("Node16");
															  System.out.println(status);
															  if(status.equals("normal")){
																  bbb7.setVisible(true); 
																  b7.setVisible(false); 
															  }else{
																  bbb7.setVisible(false); 
																  b7.setVisible(false);
																  bb7.setVisible(true);
															  }
																 
															 }else if(lod==2){
																  status=getRecord("Node16");
																  System.out.println(status);
																  if(status.equals("normal")){
																	 bbb7.setVisible(true); 
																	  b7.setVisible(false);
																  }else{
																	  bbb7.setVisible(false); 
																	  b7.setVisible(false);
																	  bb7.setVisible(true); 
																  }
															 }
															 else if(lod==3){
																 status=getRecord("Node7");
																  System.out.println(status);
																  if(status.equals("normal")){
																	 aaa7.setVisible(true); 
																	 a7.setVisible(false);
																  }else{
																	  aaa7.setVisible(false); 
																		 a7.setVisible(false);
																		 aa7.setVisible(true);
																  }
															 }
															else if(lod==4){
																status=getRecord("Node34");
																  System.out.println(status);
																  if(status.equals("normal")){
																	ddd7.setVisible(true); 
																	 d7.setVisible(false);
																  }else{
																	  ddd7.setVisible(false); 
																		 d7.setVisible(false);
																		 dd7.setVisible(true); 
																  }
															}
															else if(lod==5){
																status=getRecord("Node16");
																  System.out.println(status);
																  if(status.equals("normal")){
																bbb7.setVisible(true); 
																  b7.setVisible(false);
																  }else{
																	  bbb7.setVisible(false); 
																	  b7.setVisible(false);
																	  bb7.setVisible(true);
																  }
															}
															else if(lod==6){
																status=getRecord("Node34");
																  System.out.println(status);
																  if(status.equals("normal")){
																ddd7.setVisible(true); 
																 d7.setVisible(false);	
																  }else{
																	  ddd7.setVisible(false); 
																		 d7.setVisible(false);
																		 dd7.setVisible(true); 
																  }
															}
															else if(lod==7){
																status=getRecord("Node25");
																  System.out.println(status);
																  if(status.equals("normal")){
																ccc7.setVisible(true); 
																 c7.setVisible(false);
																  }else{
																	  ccc7.setVisible(false); 
																		 c7.setVisible(false);
																		 cc7.setVisible(true); 
																  }
															}
															else if(lod==8){
																status=getRecord("Node25");
																  System.out.println(status);
																  if(status.equals("normal")){
																	ccc7.setVisible(true); 
																	 c7.setVisible(false);
																  }else{
																	  ccc7.setVisible(false); 
																		 c7.setVisible(false);
																		 cc7.setVisible(true); 
																  }
															}
															else if(lod==9){
																status=getRecord("Node7");
																  System.out.println(status);
																  if(status.equals("normal")){
																 aaa7.setVisible(true); 
																 a7.setVisible(false);
																  }else{
																	  aaa7.setVisible(false); 
																		 a7.setVisible(false);
																		 aa7.setVisible(true); 
																		 
																  }
															}
															else if(lod==10){
																status=getRecord("Node34");
																  System.out.println(status);
																  if(status.equals("normal")){
																ddd7.setVisible(true); 
																 d7.setVisible(false);
																  }else{
																	  ddd7.setVisible(false); 
																		 d7.setVisible(false);
																		 dd7.setVisible(true); 
																		
																  }
															}
													  }  
													   };
													   
													   Thread t8 = new Thread() {  
															  public void run(){  
																  try {
																		sleep(16000);
																	} catch (InterruptedException e) {

																		e.printStackTrace();
																	}
																
																  if(lod==1){
																	  status=getRecord("Node26");
																	  System.out.println(status);
																	  if(status.equals("normal")){
																		  ccc8.setVisible(true); 
																		  c8.setVisible(false); 
																	  }else{
																		  ccc8.setVisible(false); 
																		  c8.setVisible(false);
																		  cc8.setVisible(true);
																	  }
																		 
																	 }else if(lod==2){
																		 status=getRecord("Node8");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																			 aaa8.setVisible(true); 
																			  a8.setVisible(false);
																		  }else{
																			  aaa8.setVisible(false); 
																			  a8.setVisible(false);
																			  aa8.setVisible(true);
																		  }
																	 }
																	 else if(lod==3){
																		 status=getRecord("Node8");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																				 aaa8.setVisible(true); 
																				 a8.setVisible(false);
																		  }else{
																			  aaa8.setVisible(false); 
																				 a8.setVisible(false);
																				 aa8.setVisible(true); 
																		  }
																	 }
																	else if(lod==4){
																		status=getRecord("Node35");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																		ddd8.setVisible(true); 
																		 d8.setVisible(false);	
																		  }else{
																			  ddd8.setVisible(false); 
																				 d8.setVisible(false);	
																				 dd8.setVisible(true); 
																		  }
																	}
																	else if(lod==5){
																		status=getRecord("Node26");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																		ccc8.setVisible(true); 
																		  c8.setVisible(false);
																		  }else{
																			  ccc8.setVisible(false); 
																			  c8.setVisible(false);
																			  cc8.setVisible(true); 
																		  }
																	}
																	else if(lod==6){
																		status=getRecord("Node35");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																		ddd8.setVisible(true); 
																		 d8.setVisible(false);
																		  }else{
																			  ddd8.setVisible(false); 
																				 d8.setVisible(false);
																				 dd8.setVisible(true); 
																		  }
																	}
																	else if(lod==7){
																		status=getRecord("Node35");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																			ddd8.setVisible(true); 
																			 d8.setVisible(false);
																		  }else{
																			  ddd8.setVisible(false); 
																			  d8.setVisible(false);
																			  dd8.setVisible(true);
																		  }
																	}
																	else if(lod==8){
																		status=getRecord("Node26");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																		ccc8.setVisible(true); 
																		  c8.setVisible(false);
																		  }else{
																			  ccc8.setVisible(false); 
																			  c8.setVisible(false);
																			  cc8.setVisible(true); 
																		  }
																	}
																	else if(lod==9){
																		status=getRecord("Node17");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																		bbb8.setVisible(true); 
																		  b8.setVisible(false);
																		  }else{
																			  bbb8.setVisible(false); 
																			  b8.setVisible(false);
																			  bb8.setVisible(true); 
																			
																		  }
																	}
																	else if(lod==10){
																		status=getRecord("Node35");
																		  System.out.println(status);
																		  if(status.equals("normal")){
																		ddd8.setVisible(true); 
																		 d8.setVisible(false);
																		  }else{
																			  ddd8.setVisible(false); 
																				 d8.setVisible(false);
																				 dd8.setVisible(true); 
																		  }
																	}
															  }  
															   };
															   
															   Thread t9 = new Thread() {  
																	  public void run(){  
																		  try {
																				sleep(18000);
																			} catch (InterruptedException e) {

																				e.printStackTrace();
																			}
																																				  
																		  if(lod==1){
																			  	status=getRecord("Node27");
																			  	System.out.println(status);
																			  	if(status.equals("normal")){
																			  		ccc9.setVisible(true); 
																					  c9.setVisible(false);	
																			  	}else{
																			  		ccc9.setVisible(false); 
																					  c9.setVisible(false);
																					  cc9.setVisible(true);
																			  	}
																				 
																			 }else if(lod==2){
																				 status=getRecord("Node18");
																				  	System.out.println(status);
																				  	if(status.equals("normal")){
																						 bbb9.setVisible(true); 
																						  b9.setVisible(false);
																				  	}else{
																				  		bbb9.setVisible(false); 
																						  b9.setVisible(false);
																						  bb9.setVisible(true);
																				  	}
																			 }
																			 else if(lod==3){
																				 status=getRecord("Node18");
																				  	System.out.println(status);
																				  	if(status.equals("normal")){
																						 bbb9.setVisible(true); 
																						 b9.setVisible(false);
																				  	}else{
																				  		bbb9.setVisible(false); 
																						 b9.setVisible(false);
																						 bb9.setVisible(true);
																				  	}
																			 }
																			else if(lod==4){
																				status=getRecord("Node36");
																				  System.out.println(status);
																				  if(status.equals("normal")){
																				ddd9.setVisible(true); 
																				 d9.setVisible(false);	
																				  }else{
																					  ddd9.setVisible(false); 
																						 d9.setVisible(false);	
																						 dd9.setVisible(true); 
																						 	 
																				  }
																			}
																			else if(lod==5){
																				status=getRecord("Node27");
																				  System.out.println(status);
																				  if(status.equals("normal")){
																				ccc9.setVisible(true); 
																				  c9.setVisible(false);
																				  }else{
																					  ccc9.setVisible(false); 
																					  c9.setVisible(false);
																					  cc9.setVisible(true); 
																				  }
																			}
																			else if(lod==6){
																				status=getRecord("Node27");
																			  	System.out.println(status);
																			  	if(status.equals("normal")){
																				ccc9.setVisible(true); 
																				  c9.setVisible(false);
																			  	}else{
																			  		ccc9.setVisible(false); 
																					  c9.setVisible(false);
																					  cc9.setVisible(true); 
																			  	}
																			}
																			else if(lod==7){
																				status=getRecord("Node36");
																				  System.out.println(status);
																				  if(status.equals("normal")){
																				ddd9.setVisible(true); 
																				 d9.setVisible(false);
																				  }else{
																					  ddd9.setVisible(false); 
																						 d9.setVisible(false);
																						 ddd9.setVisible(true); 
																				  }
																			}
																			else if(lod==8){
																				status=getRecord("Node18");
																			  	System.out.println(status);
																			  	if(status.equals("normal")){
																				bbb9.setVisible(true); 
																				  b9.setVisible(false);
																			  	}else{
																			  		bbb9.setVisible(false); 
																					  b9.setVisible(false);
																					  bb9.setVisible(true);
																			  	}
																			}
																			else if(lod==9){
																				status=getRecord("Node27");
																			  	System.out.println(status);
																			  	if(status.equals("normal")){
																				ccc9.setVisible(true); 
																				  c9.setVisible(false);
																			  	}else{
																			  		ccc9.setVisible(false); 
																					  c9.setVisible(false);
																					  cc9.setVisible(true); 
																					  
																			  	}
																			}
																			else if(lod==10){
																				status=getRecord("Node36");
																				  System.out.println(status);
																				  if(status.equals("normal")){
																				ddd9.setVisible(true); 
																				 d9.setVisible(false);
																				  }else{
																					  ddd9.setVisible(false); 
																						 d9.setVisible(false);
																						 dd9.setVisible(true); 																						 
																				  }
																			}
																	  }  
																	   };
																	   
																	   
																	   Thread t10 = new Thread() {  
																			  public void run(){  
																				  try {
																						sleep(20000);
																					} catch (InterruptedException e) {

																						e.printStackTrace();
																					}
																							
																				  lab4.setVisible(true); 
																				  lab3.setVisible(false);
																				  JOptionPane.showMessageDialog(null,"File Recived Sucessfully!");
																				  //frame.dispose();
//																				  new Viewcontent();																				  
																				 /* if(lod==1){
																						 ccc9.setVisible(true); 
																						  c9.setVisible(false);
																					 }else if(lod==2){
																						 
																					 }
																					 else if(lod==3){
																						 
																					 }
																					else if(lod==4){
																												 
																					}
																					else if(lod==5){
																						 
																					}
																					else if(lod==6){
																						 
																					}
																					else if(lod==7){
																						 
																					}
																					else if(lod==8){
																						 
																					}
																					else if(lod==9){
																						 
																					}
																					else if(lod==10){
																						 
																					}*/
																			  }  
																			   };
																			   
			   t0.start();													   
			   t1.start();  
			   t2.start(); 
			   t3.start(); 
			   t4.start();
			   t5.start();
			   t6.start();
			   t7.start();
			   t8.start();
			   t9.start();
			   t10.start();
					}
			  });
	    
	   /* lab2.setVisible(false);
	    lab3.setVisible(false);
	    lab1.setVisible(false);*/
	    
	    
	    frame.setLayout(null);   
        frame.setSize(1180,530);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       
    }
	 public String getRecord(String str1){
		 try{
			    Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/passiveip","root","root");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select Nodename, Attackerip, DataIntegrity from nodefinder where Nodename='"+str1+"'");
				while(rs.next()){
				/*	System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));*/
					String s="null";
					String ss;
					if(rs.getString(2).equals(s) && rs.getString(3).equals(s)){
						ss="normal";
					}
					else{
						ss="attack";
					}
					val=ss;					
				}				
		  }catch(Exception ex1){ex1.printStackTrace();}
		 return val;
    }
public static void main(String args[]){
		new Control();
	}

}
