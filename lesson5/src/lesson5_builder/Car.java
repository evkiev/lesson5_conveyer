package lesson5_builder;

public class Car {
	public String CarName;
	boolean carcase;
	int wheels;
	int seats;
	int doors;
	int glasses;
	String color;
	boolean polishing;

	public static class Builder {
		public String CarName;
		boolean carcase;
		int wheels;
		int seats;
		int doors;
		int glasses;
		String color;
		boolean polishing;

		public Builder(String name){this.CarName = name;}
		
		public Builder setcarcase (boolean carcase){this.carcase = carcase; return this;}
		public Builder setwheels (int wheels){this.wheels = wheels; return this;}
		public Builder setseats (int seats){this.seats = seats; return this;}
		public Builder setdoors (int doors){this.doors = doors; return this;}
		public Builder setglasses (int glasses){this.glasses = glasses; return this;}
		public Builder setcolor (String color){this.color = color; return this;}
		public Builder polishing (boolean polishing){this.polishing = polishing; return this;}
	
		
		public Car build() {
			if (this.CarName!=null & this.carcase!=false)
			{
			return new Car(this);
			}
			else{return null;}
			}
		
		
	}
private Car (Builder builder){
	this.CarName = builder.CarName;
	this.carcase = builder.carcase;
	this.wheels = builder.wheels;
	this.seats = builder.seats;
	this.doors = builder.doors;
	this.glasses = builder.glasses;
	this.color = builder.color;
	this.polishing = builder.polishing;
}
	
	
	
}
