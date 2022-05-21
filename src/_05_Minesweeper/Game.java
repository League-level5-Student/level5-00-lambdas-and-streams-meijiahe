package _05_Minesweeper;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Game {

public static void main(String[] args) {
//	add(5,6);
//	System.out.println(add(1,2));
//	//JOptionPane.showMessageDialog(null, args);
//	int time =20;
//	if (time<20) {
//		JOptionPane.showMessageDialog(null, "It's time to eat");
//	}
//	else {
//		JOptionPane.showMessageDialog(null, "It's not time to eat");
//	}

	String answer = JOptionPane.showInputDialog("What is your fav color?");
	int ans = Integer.parseInt(answer);
	if (ans<=10) {
		JOptionPane.showMessageDialog(null, "It's a good number");
	}
	else {
		JOptionPane.showMessageDialog(null, "It's a good number but could be better");
	}
}

//public static int add(int a,int b) {
//	int c = a+b;
//	//in here, we used integer variable a and b and we add them together. However we need to save our
//	//result which is the sum, into another integer variable called c. 
//	return c;
//}

}

