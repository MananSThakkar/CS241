package ParkingLot;

import java.time.*;

public class Car {
		
		private String FirstName;
		private String LastName;
		private int PhoneNo;
		private int PlateNo;
		private double Balance;
		private String Email;	
		private int timeInHours;
		private int timeInMinutes;
		private int ParkingLocation;	
		private boolean paid;
		
	    
		public Car(String firstName, String lastName, String email, int phoneNo, int plateNo) 
		{
			this.FirstName = firstName;
			this.LastName = lastName;
			this.Email = email;
			this.PhoneNo = phoneNo;
			this.PlateNo = plateNo;
			
			this.paid = false;
		}
		
		public void setTime()
		{
			LocalTime t = LocalTime.now();
			this.timeInHours = t.getHour();
			this.timeInMinutes = t.getMinute();
		}
		
		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public int getPlateNo() {
			return PlateNo;
		}

		public void setPlateNo(int plateNo) {
			PlateNo = plateNo;
		}
		
		public String getTime()
		{
			return this.timeInHours+":"+this.timeInMinutes;
		}	
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
		public int getParkingLocation() {
			return ParkingLocation;
		}
		public void setParkingLocation(int parkingLocation) {
			ParkingLocation = parkingLocation;
		}
		public boolean Paid() {
			return paid;
		}
		public void setPaid(boolean paid) {
			this.paid = paid;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		
		public boolean equals(Object A) {
			Car car = (Car)A;
			return car.PlateNo == this.PlateNo && car.ParkingLocation == this.ParkingLocation;		
		}
		public String toString()
		{
			return this.FirstName+";"+this.LastName+";"+this.Email+";"+this.PhoneNo+";"+this.PlateNo;
		}
		
}
