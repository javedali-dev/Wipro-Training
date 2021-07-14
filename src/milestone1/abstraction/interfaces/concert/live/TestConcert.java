package milestone1.abstraction.interfaces.concert.live;

import milestone1.abstraction.interfaces.concert.music.Playable;
import milestone1.abstraction.interfaces.concert.music.string.Veena;
import milestone1.abstraction.interfaces.concert.music.wind.Saxophone;

public class TestConcert {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        Playable playable = veena;
        playable.play();

    }
}
