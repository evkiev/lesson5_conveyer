package lesson5_builder;

public class conveyer {

	public static void main(String[] args) {

		Worker worker1 = new Worker();
		Worker worker2 = new Worker();
		Worker worker3 = new Worker();
		Worker worker4 = new Worker();

		/*Car.Builder stage1 = worker1.docarcase_wheel("Audi", true, 4);
		Car.Builder stage2 = worker2.do_seats_doors_glasses(stage1, 5, 5, 7);
		Car.Builder stage3 = worker3.do_color_polishing(stage2, "red", true);
		Car car1 = worker4.finalcar(stage3);*/

		Car car1 = worker4.finalcar(worker3.do_color_polishing(
				worker2.do_seats_doors_glasses(worker1.docarcase_wheel("Audi", true, 4), 5, 5, 7), "red", true));

		System.out.println("Car\n" + "CarName:\t" + car1.CarName + "\ncarcase:\t" + car1.carcase + "\nwheels:  \t"
				+ car1.wheels + "\nseats:  \t" + car1.seats + "\ndoors:   \t" + car1.doors + "\nglasses:\t"
				+ car1.glasses + "\ncolor:  \t" + car1.color + "\npolishing:\t" + car1.polishing);

		
		Car car2 = worker4.finalcar(worker3.do_color_polishing(
				worker2.do_seats_doors_glasses(worker1.docarcase_wheel("Mersedess", true, 4), 5, 5, 7), "blue", true));

		System.out.println("Car\n" + "CarName:\t" + car2.CarName + "\ncarcase:\t" + car2.carcase + "\nwheels:  \t"
				+ car2.wheels + "\nseats:  \t" + car2.seats + "\ndoors:   \t" + car2.doors + "\nglasses:\t"
				+ car2.glasses + "\ncolor:  \t" + car2.color + "\npolishing:\t" + car2.polishing);
		
		
	}

}
