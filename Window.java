import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class Window {

		private JFrame o;
		private JButton but1, but2, but3;
		private JLabel pole;
		
		Los s = new Los();
		
		public void createGUI() {
			o = new JFrame ("Losuj i zamieniaj");
	        o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        o.setSize (600,400);
	        o.setLocation(300,200);
	        GridBagConstraints param = new GridBagConstraints();
	        o.setLayout(new GridBagLayout());
	      
	        
	        
	        pole = new JLabel(s.GetDec());
	        param.gridx=1;
	        param.gridy=0;
	        param.ipadx=50;
	        param.gridwidth=2;
	        param.fill= GridBagConstraints.HORIZONTAL;
	        o.add(pole,param);
	        
	        JPanel para=new JPanel();
	        param.gridx=1;
	        param.gridy=1;
	        param.ipadx=2;
	        o.add(para, param);
	       
	        param.ipady=0;
	        param.gridy=2;
	        param.gridwidth=1;
	       
	        but1= new JButton("Losuj");
	        o.add(but1, param);
	       
	        param.gridx = 2;
	        but2=new JButton("DEC");
	        o.add(but2,param);
	        o.setVisible(true);
	        
	        param.gridx = 3;
	        but3=new JButton("HEX");
	        o.add(but3,param);
	        o.setVisible(true);
	        
	        but1.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		s.SetLos();
	        		pole.setText(s.GetDec());
	        	}
	        });
	        
	        but2.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {

	        		pole.setText(s.GetDec());
	        	}
	        });
	        
	        but3.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {

	        		pole.setText(s.GetHex());
	        	}
	        });
		}

		
	 public static void main(String [] args) {
	    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
	    		@Override
	    		public void run() {
	    			Window app = new Window();
	    			app.createGUI();
	    		}
	    	});
	    }

}
