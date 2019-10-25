
public class Bike implements Vehicle{
	private int speed;
	private int gear;
	public Bike(int speed, int gear) {
		
		this.speed = speed;
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	
	public int getGear() {
		return gear;
	}
	@Override
	public void changeGear(int newGear) {
		
		this.gear = newGear;

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
