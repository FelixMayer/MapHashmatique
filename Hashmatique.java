import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
	public static void main(String[] args){
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Lucid Dreams", "I still see you shadows in my room");
		trackList.put("Wishing Well", "Waiting for the exhale");
		trackList.put("Robbery", "I'm a whole different person");
		trackList.put("All Girls Are The Same", "Tell me what's the secret to love");

		String song = trackList.get("Robbery");
		System.out.println("Robbery includes these lirics: " + song);

		Set<String> keys = trackList.keySet();
		for(String key: keys) {
			System.out.println(key + ": " + trackList.get(key));
		}
	}
}