
public class Car implements Vehicle {
	private int gear;
	private int speed;

	public Car(int gear, int speed) {

		this.gear = gear;
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}

	@Override

	public void changeGear(int newgear) {
		this.gear = newgear;

	}

	@Override
	public void applyBreak(int decrement) {
		this.speed = speed - decrement;

	}

	@Override
	public void speedUp(int increment) {
		this.speed = speed + increment;

	}

}
