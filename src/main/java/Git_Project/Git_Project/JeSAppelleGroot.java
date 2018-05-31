package Git_Project.Git_Project;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JeSAppelleGroot {
	
	private String nom = "Je s'appelle Groot";
	
	public void commentJeMAppelle () {
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++) {
				JFrame fenetre = new JFrame();
				
				    
			    fenetre.setSize((int)(Math.random() * 1000), (int)(Math.random() * 1000));
			    fenetre.setTitle(nom);
			    fenetre.setLocation((int)(Math.random() * 1600), (int)(Math.random() * 1000)); 
			    
			   
			    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    JPanel pan = (JPanel)fenetre.getContentPane();
			    
		        JLabel label = new JLabel();
		        label.setIcon(new ImageIcon("ressources/groot.jpg"));
		        pan.add(label);
		        
			    
			    fenetre.setContentPane(pan);               
			    fenetre.setVisible(true);
			}
		}
	}
}
