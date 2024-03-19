package org.OOPs.InterfaceExample;

interface MusicInstrument {
   //all the methods by default will be public abstract
    //all variables in interface will be by default public static final variables

    int NO_OF_KEYS = 88;
    void play();
}
//we use implements for interfaces
class Guitar implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }
}
class Flute implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Flute");
    }
}
public class InterfaceManager {

    public static void main(String[] args) {
        //we can change flute to piano etc.

        MusicInstrument musicInstrument = new Flute();
        musicInstrument.play();
    }
}