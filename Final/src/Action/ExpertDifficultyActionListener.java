package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Main.mainUI;

public class ExpertDifficultyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mainUI.setDifficulty(3);
		mainUI.setTimer("0");
		mainUI.getTimerThread().activate = false;
		mainUI.getTimerThread().gameover = false;
	}

}
