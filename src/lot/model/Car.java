package lot.model;

import java.awt.Color;

public class Car
{
	private String carModel;
	private Color carColor;
	
	public Car()
	{
		
	}
	
	public Car(String carModel, Color carColor)
	{
		
	}
	
	public String toString()
	{
		String carInfo = "This car is a " + carColor + " " + carModel + ".";
		return carInfo;
	}
}
