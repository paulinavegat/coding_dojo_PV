import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public HashMap<String, String> trackList() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("3 ovejas", "Tengo, tengo, tengo, tú no tienes nada");
        trackList.put("Los elefantes", "Un elefante se balanceaba sobre la tela de una araña");
        trackList.put("Canción de cuna", "Cierra los ojitos mi niño de nieve");
        trackList.put("Yo tenía 10 perritos", "Yo tenía 10 perritos, Yo tenía 10 perritos");
        return trackList;
    }

    public String oneSong() {
        String song = "3 ovejas";
        String lyrics = trackList().get(song);
        String example = "The lyrics to " + song + ": " + lyrics;
        return example;
    }
    
    public void playList() {
        Set<String> tracks = trackList().keySet();
        for(String track: tracks) {
            System.out.println("Track: " + track + " Lyrics: " + trackList().get(track));
        }
    }
}