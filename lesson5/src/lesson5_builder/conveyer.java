package lesson5_builder;

public class conveyer {

	public static void main(String[] args) {

		Worker worker1 = new Worker();
		Worker worker2 = new Worker();
		Worker worker3 = new Worker();
		Worker worker4 = new Worker();

		Car.Builder stage1 = worker1.docarcase_wheel("Audi", true, 4);
		Car.Builder stage2 = worker2.do_seats_doors_glasses(stage1, 5, 5, 7);
		Car.Builder stage3 = worker3.do_color_polishing(stage2, "red", true);
		Car car1 = worker4.finalcar(stage3);

		System.out.println("Car\n" + "CarName:\t" + car1.CarName + "\ncarcase:\t" + car1.carcase + "\nwheels:  \t"
				+ car1.wheels + "\nseats:  \t" + car1.seats + "\ndoors:   \t" + car1.doors + "\nglasses:\t" + car1.glasses + "\ncolor:  \t"
				+ car1.color + "\npolishing:\t" + car1.polishing);

		
		//Car car2 = worker4.finalcar(stage1);
		
		
	}

}
