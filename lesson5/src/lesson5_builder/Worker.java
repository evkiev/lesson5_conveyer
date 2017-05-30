package lesson5_builder;

import lesson5_builder.Car.Builder;

public class Worker {
	
	public Builder docarcase_wheel (String CarName, boolean carcase, int wheels){
	Car.Builder docarcase = new Car.Builder(CarName).setcarcase(carcase).setwheels(wheels);
	return docarcase;
	}
	
	public Builder do_seats_doors_glasses (Car.Builder docarcase, int seats, int doors, int glasses){
	Car.Builder do_sdg = docarcase.setseats(seats).setdoors(doors).setglasses(glasses);
	return do_sdg;	
	}
	
	public Builder do_color_polishing (Car.Builder do_sdg, String color, boolean polishing){
	Car.Builder do_cp = do_sdg.setcolor(color).polishing(polishing);
		return do_cp;}
	
	public Car finalcar (Car.Builder do_cp){
		Car final_car = do_cp.build();
		return final_car;}
	
	
	
}