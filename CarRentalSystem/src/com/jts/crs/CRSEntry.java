package com.jts.crs;

public class CRSEntry {
	public static void main(String[] args) {
		Car toyotaCar = new Car();
		toyotaCar.setCarId("CAR-1");
		toyotaCar.setBrand("Toyota");
		toyotaCar.setModel("Fortuner");
		toyotaCar.setNoOfAvailableCar(1);
		toyotaCar.setPricePerDay(3000);
		
		Car tataCar = new Car();
		tataCar.setCarId("CAR-2");
		tataCar.setBrand("Tata");
		tataCar.setModel("Harier");
		tataCar.setNoOfAvailableCar(2);
		tataCar.setPricePerDay(2500);
		
		Car mahindraCar = new Car();
		mahindraCar.setCarId("CAR-3");
		mahindraCar.setBrand("Mahindra");
		mahindraCar.setModel("XUV 700");
		mahindraCar.setNoOfAvailableCar(2);
		mahindraCar.setPricePerDay(3500);
		
		CarRentalService carRentalService = new CarRentalService();
		carRentalService.addCars(toyotaCar);
		carRentalService.addCars(tataCar);
		carRentalService.addCars(mahindraCar);
		
		carRentalService.options();
		
	}
}
