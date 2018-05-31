package Git_Project.Git_Project;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageMystere {
	public void Surprise() {
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++) {
				JFrame fenetre = new JFrame();
				
				 String chars = "abcdefghijklmnopqrstuvwxyz";
				    String pass = "";
				    for(int x=0;x<5;x++)
				    {
				       int w = (int)Math.floor(Math.random() * 26);
				       pass += chars.charAt(w);
				    }
				    
			    fenetre.setSize((int)(Math.random() * 1000), (int)(Math.random() * 1000));
			    fenetre.setTitle(pass);
			    fenetre.setLocation((int)(Math.random() * 1600), (int)(Math.random() * 1000)); 
			    
			   
			    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    JPanel pan = (JPanel)fenetre.getContentPane();
			    
		        JLabel label = new JLabel();
		        label.setIcon(new ImageIcon("ressources/imageMystere.jpg"));
		        pan.add(label);
		        
			    
			    fenetre.setContentPane(pan);               
			    fenetre.setVisible(true);
			}
		}
	}
}
