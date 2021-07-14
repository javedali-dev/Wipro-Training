package milestone1.abstraction.interfaces.concert.music.string;

import milestone1.abstraction.interfaces.concert.music.Playable;

public class Veena implements Playable {
    @Override
    public void play(){
        System.out.println("Playing Veena");
    }
}
