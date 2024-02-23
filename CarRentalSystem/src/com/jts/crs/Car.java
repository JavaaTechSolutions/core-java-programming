package com.jts.crs;

public class Car {
	private String carId;

	private String brand;

	private String model;

	private double pricePerDay;

	private int noOfAvailableCar;

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public int getNoOfAvailableCar() {
		return noOfAvailableCar;
	}

	public void setNoOfAvailableCar(int noOfAvailableCar) {
		this.noOfAvailableCar = noOfAvailableCar;
	}
	
	public double calculatePrice(int days) {
		return pricePerDay * days;
	}
}
