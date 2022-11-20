package smJv;
import javax.swing.*;
import java.awt.event.*;
public class JCheckBoxFoodOrderingSystem implements ActionListener {
	JFrame fr;
	JCheckBox chb0,chb1,chb2,chb3,chb4,chb5,chb6,chb7,chb8,chb9,chb10,chb11,chb12;
	JLabel lbl0,lbl1;
	JButton btn0;
	public JCheckBoxFoodOrderingSystem()
	{
		fr=new JFrame();
		fr.setTitle(" <--------------------------------- JAVA SWING JCHECKBOX FOOD OORDERING SYSTEM ! ------------------------------------------------ ------------------------------------------------------------------------------>");
		lbl0=new JLabel("LIST OF AVAILABLE  FOOD  AND  BEVERAGE  SERVICES !");
		lbl1=new JLabel("FOOD ORDERING SYSTEM");
		chb0=new JCheckBox("Pizza @ 100 ETB");
		chb1=new JCheckBox("Burger  @ 30 ETB");
		chb2=new JCheckBox("Coffee @ 15 ETB");
		chb3=new JCheckBox("Tea @ 10 ETB");
		chb4=new JCheckBox("Doro Wot @ 500 ETB");
		chb5=new JCheckBox("Kitfo @ 300 ETB");
		chb6=new JCheckBox("Tibs @ 350 ETB");
		chb7=new JCheckBox("Beer  @ 50 ETB");
		chb8=new JCheckBox("Sofi Malt @ 45 ETB");
		chb9=new JCheckBox("Enkulal Firfir @ 100 ETB");
		chb10=new JCheckBox("Key Wot @ 200 ETB");
		chb11=new JCheckBox("Special Shiro @ 100 ETB");
		chb12=new JCheckBox("Mahiberawi @ 450 ETB");
		btn0=new JButton("Order");
		lbl0.setBounds(60,80,400,30);
		chb1.setBounds(80,120,220,30);
		chb2.setBounds(80,160,220,30);
		chb3.setBounds(80,200,220,30);
		chb4.setBounds(80,240,220,30);
		chb5.setBounds(80,280,220,30);
		chb6.setBounds(80,320,220,30);
		chb7.setBounds(80,360,220,30);
		chb8.setBounds(80,400,220,30);
		chb9.setBounds(80,440,220,30);
		chb10.setBounds(80,480,220,30);
		chb11.setBounds(80,520,220,30);
		chb12.setBounds(80,520,220,30);
		btn0.setBounds(120,570,80,30);
		fr.add(lbl0);
		fr.add(btn0);
		fr.add(chb0);
		fr.add(chb1);
		fr.add(chb2);
		fr.add(chb3);
		fr.add(chb4);
		fr.add(chb5);
		fr.add(chb6);
		fr.add(chb7);
		fr.add(chb8);
		fr.add(chb9);
		fr.add(chb10);
		fr.add(chb12);
		btn0.addActionListener(this);
		fr.setSize(500,500);
		fr.setLayout(null);
		fr.setVisible(true);
//		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ev)
	{
		double charge=0.0;
		String msg="";
		if(chb0.isSelected())
		{
			charge+=100;
			msg+="Pizza : 100 ETB\n";
		}
		if(chb1.isSelected())
		{
			charge+=30;
			msg+="Burger : 30 ETB\n";
		}
		if(chb2.isSelected())
		{
			charge+=10;
			msg+="Coffee : 15 ETB\n";
		}
		if(chb3.isSelected())
		{
			charge+=10;
			msg+="Tea : 10 ETB\n";
		}
		if(chb4.isSelected())
		{
			charge+=500;
			msg+="Doro Wot : 500 ETB\n";
		}
		if(chb5.isSelected())
		{
			charge+=100;
			msg+="Kitfo : 300 ETB\n";
		}
		if(chb6.isSelected())
		{
			charge+=350;
			msg+="Tibs : 350 ETB\n";
		}
		if(chb7.isSelected())
		{
			charge+=100;
			msg+="Beer : 50 ETB\n";
		}
		if(chb8.isSelected())
		{
			charge+=45;
			msg+="Sofi Malt : 45 ETB\n";
		}
		if(chb9.isSelected())
		{
			charge+=100;
			msg+="Enkulal Firfir : 100 ETB\n";
		}
		if(chb10.isSelected())
		{
			charge+=100;
			msg+="Key Wot : 200 ETB\n";
		}
		if(chb11.isSelected())
		{
			charge+=100;
			msg+="Special Shiro : 100 ETB\n";
		}
		if(chb12.isSelected())
		{
			charge+=100;
			msg+="Mahiberawi : 450 ETB\n";
		}
		msg+="--------------------------------\n";
		JOptionPane.showMessageDialog(fr,msg+"Total charge : "+charge);
	}
	public static void main(String[] args) {
		JCheckBoxFoodOrderingSystem Obj=new JCheckBoxFoodOrderingSystem();
	}
}
