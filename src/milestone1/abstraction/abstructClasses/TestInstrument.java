package milestone1.abstraction.abstructClasses;

import java.util.Random;

abstract class Instrument{
    abstract void play();
}

class Piano extends Instrument{
    void play(){
        System.out.println("Piano is playing  tan tan tan tan");
    }
}
class Flute extends Instrument{
    void play(){
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

public class TestInstrument {
    public static void main(String[] args) {
        Instrument[] arrayOfInstrument = new Instrument[10];
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            int r = random.nextInt(3);
            switch (r+1){
                case 1:
                    Instrument piano = new Piano();
                    arrayOfInstrument[i] = piano;
                    break;
                case 2:
                    Instrument flute = new Flute();
                    arrayOfInstrument[i] = flute;
                    break;
                case 3:
                    Instrument guitar = new Guitar();
                    arrayOfInstrument[i] = guitar;
                    break;

            }
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println( arrayOfInstrument[i] instanceof Piano);
        }
        for (int i = 0; i <10 ; i++) {
             arrayOfInstrument[i].play();
        }
    }
}
