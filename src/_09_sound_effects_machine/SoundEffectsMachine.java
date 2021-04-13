package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {

	JButton woodbutton = new JButton("Sawing wood");
	JButton otherbutton = new JButton("Click for a surprise noise!");

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();

		frame.add(panel);
		frame.pack();
		panel.add(woodbutton);
		panel.add(otherbutton);
		frame.pack();
		woodbutton.addActionListener(this);
		otherbutton.addActionListener(this);

	}

	private void playSound(String soundFile) {
		String path = "src/_09_sound_effects_machine/";
		File sound = new File(path + soundFile);
		if (sound.exists()) {
			new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}).start();
		} else {
			System.out.println("File does not exist");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== woodbutton) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if (e.getSource() == otherbutton){
			playSound("homer-woohoo.wav");	
		}
		else {
			JOptionPane.showMessageDialog(null, "I don't recognize that button");
		}
	}
}
