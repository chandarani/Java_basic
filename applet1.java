import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
//import java.awt.Graphics;
//import javax.swing.JApplet;
abstract public class applet1 extends Applet implements ActionListener,ItemListener
{
	private Label ln,lr,lg,lm,lc1,lc2,lc3,lc4,lc5,ln1,lr1,lg1,lcc1,lcc2,lcc3,lcc4,lcc5,total;
	private Checkbox c1,c2,c3;
	private CheckboxGroup cb;
	private TextField txtname,txtreg,txtcs1,txtcs2,txtcs3,txtcs4,txtcs5;
	private String name,reg,m1,m2,m3,m4,m5,tot,gender;
	private Button b1;
	
	public void init()
	{
		ln=new Label("Name");
		lr=new Label("Regis No.");
		lg=new Label("Gender");
		cb=new CheckboxGroup();
		c1=new Checkbox("Male",cb,false);
		c2=new Checkbox("Female",cb,false);
		c3=new Checkbox("Others",cb,false);
		lm=new Label("Marks");
		lc1=new Label("CS-31");
		lc2=new Label("CS-32");
		lc3=new Label("CS-33");
		lc4=new Label("CS-34");
		lc5=new Label("CS-35");
		b1=new Button("Submit");
		txtname=new TextField();
		txtreg=new TextField();
		txtcs1=new TextField();
		txtcs2=new TextField();
		txtcs3=new TextField();
		txtcs4=new TextField();
		txtcs5=new TextField();
		add(ln);add(txtname);add(lr);add(txtreg);add(lg);add(c1);add(c2);add(c3);add(lm);add(lc1);add(txtcs1);
		add(lc2);add(txtcs2);add(lc3);add(txtcs3);add(lc4);add(txtcs4);add(lc5);add(txtcs5);add(b1);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		b1.addActionListener(this);
		
		name=null;reg=null;m1=null;m2=null;m3=null;
		m4=null;m5=null;tot=null;gender=null;
	}
	
	public void itemStateChange(ItemEvent e)
	{
		if(c1.getState()==true)
			gender="male";
		else if(c2.getState()==true)
			gender="female";
		else if(c3.getState()==true)
			gender="others";
	}
			
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			name=txtname.getText();
			reg=txtreg.getText();
			m1=txtcs1.getText();
			m2=txtcs2.getText();		
			m3=txtcs3.getText();
			m4=txtcs4.getText();
			m5=txtcs5.getText();
			tot=m1+m2+m3+m4+m5;
			
			ln1.setText(""+name);
			lr1.setText(""+reg);
			//lg1=gender;
			lcc1.setText(""+m1);
			lcc2.setText(""+m2);
			lcc3.setText(""+m3);
			lcc4.setText(""+m4);
			lcc5.setText(""+m5);
			total.setText(""+tot);
		}
	}
	/*
	<applet code="applet1.class" width="500" height="400">
	     
	</applet> 
	
	*/
}
			
		
		
		
		
	
