package pacman;

import javax.swing.JFrame;

public class pacman extends JFrame{

	public pacman() {
		add(new Model());
	}
	
	
	public static void main(String[] args) {
		pacman pac = new pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(360,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}