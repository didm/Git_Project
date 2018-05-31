package Git_Project.Git_Project;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	int choix = 0;
    	
    	do {
    	System.out.println("Que voulez-vous voir ?");
    	System.out.println("1- Groot");
    	System.out.println("2- Une surprise");
    	
    	choix = sc.nextInt();

    	}while(choix != 1 && choix != 2);
    	
	    	if (choix == 1) {
	    		JeSAppelleGroot groot = new JeSAppelleGroot();
	    		groot.commentJeMAppelle();
	    	}else if (choix == 2) {
	    		ImageMystere img = new ImageMystere();
	    		img.Surprise();
	    	}
    }
}
