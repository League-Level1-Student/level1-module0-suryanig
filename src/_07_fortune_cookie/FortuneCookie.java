package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Click me for a fortune!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Everyone around you will give you lots of gifts.");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will become very rich one day.");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will get your dream pet soon.");
		}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You should be making a new friend soon.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You will get a good grade on an upcoming test.");
		}
	}
}
