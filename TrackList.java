import java.util.HashMap;

public class TrackList {
    public void trackList(){
        // Create a trackList of type HashMap
        HashMap<String, String> tracks = new HashMap<>();
        // Add in at least 4 songs that are stored by title
        tracks.put("Shallow", "Tell me somethin' girl");
        tracks.put("Old Town Road", "It's been a hard day's night, and I've been working like a dog");
        tracks.put("7 Rings", "Yeah, breakfast at Tiffany's and bottles of bubbles");
        tracks.put("Sweet But Psycho","Oh, she's sweet but a psycho");
        // Pull out one of the songs by its track title
        System.out.println("The lyrics to Help! include: "+tracks.get("Help!"));
        // Print out all the track names and lyrics in the format Track: Lyrics
        tracks.forEach((k,v) -> System.out.println(k+": "+v));
    }
}
