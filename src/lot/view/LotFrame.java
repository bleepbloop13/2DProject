package lot.view;

import javax.swing.JFrame;

import lot.controller.LotController;

public class LotFrame extends JFrame
{
	private LotController baseController;
	private LotPanel basePanel;

	public LotFrame(LotController baseController)
	{
		this.baseController = baseController;
		basePanel = new LotPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
	}
}
