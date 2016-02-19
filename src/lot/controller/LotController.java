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
		for(int row = 0; row < myLot.length; row++)
		{
			for(int col = 0; col < myLot[0].length; col++)
			{
				
			}
		}
	}

	public String[][] getMyLot()
	{
		return myLot;
	}

}
