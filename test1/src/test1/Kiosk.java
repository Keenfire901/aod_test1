package test1;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {
	private List<String> meny;
	
	public Kiosk() {
		meny = new ArrayList<String>();
		meny.add("Korv");
		meny.add("Hamburgare");
		meny.add("Läsk");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String menyVal : meny) {
			sb.append(menyVal+", ");
		}
		return sb.substring(0, sb.length()-2);
	}

}
