package models;

public class CameraMaker {
	public static void main(String[] Args) {
		Camera dota = new Camera();
		Camera dota2 = new Camera("Nicon", 1000, 3, 12);
		Camera dota4 = new Camera("Phillips", 1000, 4, 12, "GPS,WI-FI,Micro USB", "China", "Black");
		System.out.println(dota);
		System.out.println("---------------------------------");
		System.out.println(dota2);
		System.out.println("---------------------------------");
		System.out.println(dota4);
		System.out.println("---------------------------------");
		Camera.PrintStaticBatteryCapacityInMilliamperes();
		dota.PrintBatteryCapacityInMilliamperes();
		int i=0;
		Camera[] cameras=new Camera[4];
		while(i<4) {
		   cameras[i]=new Camera();
		   i++;
		}
		System.out.println("---------------------------------");
		for(Camera unit:cameras) {
			System.out.println(unit);
		}
	}
}
