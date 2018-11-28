package ParkingLot;

import java.util.List;

import DLL.DLList;

import java.time.LocalTime;
import java.util.ArrayList;

public class ParkingLot 
{
	private DLList<Car> cars;
	private List<Integer> unavaliableSpaces;
	private int currentDefinitelyAvaliableSpot;
	
	public ParkingLot() 
	{
		cars = new DLList<>();
		unavaliableSpaces = new ArrayList<>();
		currentDefinitelyAvaliableSpot = 1;
	}
	
	public void parkCar(Car c)
	{
		int spot = this.getNextAvaliableSpace();
		c.setParkingLocation(spot);
		c.setTime();
		cars.add(c);
		System.out.println("Your car is parked in spot #"+spot);
	}
	
	private int getNextAvaliableSpace()
	{
		if(this.unavaliableSpaces.isEmpty()==true)
		{
			this.unavaliableSpaces.add(currentDefinitelyAvaliableSpot);
			currentDefinitelyAvaliableSpot ++;
			return currentDefinitelyAvaliableSpot-1;
		}
		else
		{
			int num = currentDefinitelyAvaliableSpot;
			for(int i=1; i<currentDefinitelyAvaliableSpot; i++)
			{
				boolean found = false;
				for(int e:this.unavaliableSpaces)	
				{
					if(i==e)
						found = true;
				}
				if(found == false)
				{
					num = i;
				}
			}
			if(num == currentDefinitelyAvaliableSpot)
				currentDefinitelyAvaliableSpot++;
			this.unavaliableSpaces.add(num);			
			return num;
		}
	}
	
	public Car getCar(int plateNum, int spot)
	{
		Car c = new Car("temp", "temp", "temp", 0, plateNum);
		c.setParkingLocation(spot);
		if(cars.search(c)!=null)
		{
			if(cars.search(c).getData().Paid() == true)
			{
				this.unavaliableSpaces.remove((Integer)spot);
				return cars.remove(c);
			}
			else
			{
				return null;
			}
		}
		System.out.println("Car does not exist");
		return null;
	}
	
	public String viewBill(int plateNum, int spot)
	{
		Car c = new Car("temp", "temp", "temp", 0, plateNum);
		c.setParkingLocation(spot);
		if(cars.search(c)!=null)
		{
			calculateBill(c);
			return "$"+cars.search(c).getData().getBalance();
		}
		else
			return "Car does not exist";
	}
	
	public void payBill(int plateNum, int spot)
	{
		Car c = new Car("temp", "temp", "temp", 0, plateNum);
		c.setParkingLocation(spot);
		if(cars.search(c)!=null)
		{
			calculateBill(c);
			cars.search(c).getData().Paid();
			System.out.println("You paid $"+cars.search(c).getData().getBalance());
		}
		else
			System.out.println("Car does not exist");
	}
	
	private void calculateBill(Car c)
	{
		String tIn = cars.search(c).getData().getTime();
		String[] arr = tIn.split(":");
		int tInH = Integer.parseInt(arr[0]);
		int tInM = Integer.parseInt(arr[1]);
		
		LocalTime t = LocalTime.now();
		int tOutH = t.getHour();
		int tOutM = t.getMinute();
		
		int totalMin = ((tOutH-tInH)*60)+ (tOutM-tInM);
		double totalHours = (double)totalMin/60.0;
				
		cars.search(c).getData().setBalance(totalHours*20);
	}
	
}
