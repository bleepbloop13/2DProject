package lot.controller;

import lot.view.LotFrame;

public class LotController
{

	private LotFrame parkingFrame;
	private String[][] myLot;

	public LotController()
	{
		parkingFrame = new LotFrame(this);
		setupArray();
		myLot = new String[2][6];
	}

	public void start()
	{

	}

	private void setupArray()
	{

	}

	public String[][] getMyLot()
	{
		return myLot;
	}

}
