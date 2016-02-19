package lot.view;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import lot.controller.LotController;

public class LotPanel extends JPanel
{
	private LotController baseController;
	private JTable lotTable;
	private SpringLayout baseLayout;

	public LotPanel(LotController baseController)
	{
		this.baseController = baseController;
		lotTable = new JTable();
		baseLayout = new SpringLayout();

		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTable()
	{
		String[] columnHeaders = { "Column 0", "Column 1", "Column 2" };
		DefaultTableModel parkingLotTable = new DefaultTableModel(baseController.getMyLot(), columnHeaders);
		lotTable = new JTable(parkingLotTable);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(lotTable);
		this.setBackground(Color.PINK);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{

	}

}
