package milestone1.abstraction.interfaces.concert.music.wind;

import milestone1.abstraction.interfaces.concert.music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play(){
        System.out.println("playing Saxophone");
    }
}
