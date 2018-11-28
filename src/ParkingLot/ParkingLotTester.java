package ParkingLot;

import java.util.concurrent.TimeUnit;

import java.util.Scanner;

public class ParkingLotTester {

	public static void main(String[] args) throws InterruptedException 
	{
		Car car1 = new Car("Max", "Johnson", "MJ12", 111, 12); //Student
		Car car2 = new Car("John", "Markson", "JM23", 222, 123);
		Car car3 = new Car("Mark", "Henry", "MH04", 333, 321); //Faculty
		Car car4 = new Car("Henry", "Luis", "HL23", 4444, 1234);
		
		Scanner sc=new Scanner(System.in);
		
		
		ParkingLot p = new ParkingLot();
		
		System.out.println("Car #1");
		p.parkCar(car1);	
		TimeUnit.SECONDS.sleep(60); //$20 per hour should be 6 cents per min
		p.getCar(12, 1);
		System.out.println("Are you a Member of Pace University? (Student of Faculty)");
		System.out.println("1: Yes");
		System.out.println("2: NO");
		int c1 = sc.nextInt();
		if( c1 == 1) {
			System.out.println("You have parked in spot #1!");
			System.out.println("Your bill is: $0");
		} else {
		System.out.println("You have parked in spot #1!");
		System.out.println("Your bill is: " + p.viewBill(12, 1));
		p.payBill(12, 1);
		System.out.println("Thank You");
		}
		System.out.println();		
		
		System.out.println("Car #2");
		p.parkCar(car2);
		TimeUnit.SECONDS.sleep(60); //$20 per hour should be 33 cents per min
		p.getCar(123, 2);
		System.out.println("Are you a Member of Pace University? (Student of Faculty)");
		System.out.println("1: Yes");
		System.out.println("2: NO");
		int c2 = sc.nextInt();
		if( c2 == 1) {
			System.out.println("You have parked in spot #2!");
			System.out.println("Your bill is: $0");
		} else {
		System.out.println("You have parked in spot #2!");
		System.out.println("Your bill is: " + p.viewBill(123, 2));
		p.payBill(123, 2);
		System.out.println("Thank You");
		}
		System.out.println();
		
		System.out.println("Car #3");
		p.parkCar(car3);	
		TimeUnit.SECONDS.sleep(120); //$20 per hour should be 33 cents per min
		p.getCar(321, 3);
		System.out.println("Are you a Member of Pace University? (Student of Faculty)");
		System.out.println("1: Yes");
		System.out.println("2: NO");
		int c3 = sc.nextInt();
		if( c3 == 1) {
			System.out.println("You have parked in spot #3!");
			System.out.println("Your bill is: $0");
		} else {
		System.out.println("You have parked in spot #3!");
		System.out.println("Your bill is: " + p.viewBill(321, 3));
		p.payBill(321, 3);
		System.out.println("Thank You");
		}
		System.out.println();
		
		System.out.println("Car #4");
		p.parkCar(car4);	
		TimeUnit.SECONDS.sleep(180); //$20 per hour should be 33 dollar per min
		p.getCar(1234, 4);
		System.out.println("Are you a Member of Pace University? (Student of Faculty)");
		System.out.println("1: Yes");
		System.out.println("2: NO");
		int c4 = sc.nextInt();
		if( c4 == 1) {
			System.out.println("You have parked in spot #4!");
			System.out.println("Your bill is: $0");
		} else {
		System.out.println("You have parked in spot #4!");
		System.out.println("Your bill is: " + p.viewBill(1234, 4));
		p.payBill(1234, 4);
		System.out.println("Thank You");
		}
		System.out.println();
		
		System.out.println("Car 5");
		p.getCar(321, 4);
		
	}

}