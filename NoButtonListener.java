import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NoButtonListener implements ActionListener{
	private RunLoop programLoop;
	private JButton yesBtn;
	private JButton noBtn;
	
	public NoButtonListener(RunLoop programLoop, JButton yesBtn, JButton noBtn){
		this.programLoop = programLoop;
		this.yesBtn= yesBtn;
		this.noBtn = noBtn;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//yes button was pressed
		//show answer / question
		//mark a point for the question asked
		programLoop.setButtonPressed(false);
		noBtn.setEnabled(false);
		yesBtn.setEnabled(false);
		
	}

}

