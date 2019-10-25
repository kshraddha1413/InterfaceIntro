
public class Main {

	public static void main(String[] args) {
           Car car=new Car(2,3);
           System.out.println("car status");
          car.applyBreak(1);
          System.out.println("Decreased speed"+car.getSpeed());
          car.speedUp(4);
          System.out.println("Increased Speed"+car.getSpeed());
          car.changeGear(2);
          System.out.println("car gear status"+car.getGear());
          System.out.println("bike ststus");
          Bike bike = new Bike(200,300);
          bike.applyBreak(100);
          System.out.println("decreased speed"+bike.getSpeed());
          bike.speedUp(200);
          System.out.println("increased speed"+bike.getSpeed());
          bike.changeGear(1);
          System.out.println("gear status"+bike.getGear());
          
           
        		   }

}
