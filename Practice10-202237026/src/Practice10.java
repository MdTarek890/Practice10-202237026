
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CargoBoat ship = new CargoBoat();
		ship. setMaxContent (1000);
		int m=0;
		try{
		m=600;
		ship. loading(m);
		m=400;
		ship. loading(m);
		m=367;
		ship. loading(m);
		m=555;
		ship. loading(m);
		}
		catch(DangerException e) {
		System. out. println (e. warnMess());
		System. out. println("Unable to load containers weighing"+m+"tons anymore");
		try {
		ship. loading(-m);//Unloading goods
		}
		catch(DangerException exp) {
		System.exit (0);//Program exit,ro more opportunities given
		}
		}
		finally {
		System. out. printf("The cargo ship will set sail on time\n");
		System. out. println("Currentlyloaded with"+ship. realContent+"tons of cargo");
		
		
	}
	}
}
