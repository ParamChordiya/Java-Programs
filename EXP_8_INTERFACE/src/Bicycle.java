
public class Bicycle implements vehicle{
	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear=newGear;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyBrakes(int decrement) {
		speed=speed-decrement;
		// TODO Auto-generated method stub
		
	}
	public void printStates() {
		System.out.println("speed: "+speed+" gear: "+gear);
	}
	
	

}
