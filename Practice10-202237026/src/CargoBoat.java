
public class CargoBoat {

	
	
	int realContent; //Load weight
	int maxContent; //Maximum loading capacity
	public void setMaxContent(int c) {
	maxContent =c;
	}
	public void loading (int m) throws DangerException {
	realContent += m;
	if (realContent>maxContent) {
	throw new DangerException();
	}
	}
	
}
