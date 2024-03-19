package org.OOPs.InterfaceExample;

interface Game{
    void start();
    void play();
    void stop();
}
abstract class AbstractGame implements Game{
    //since start and stop methods are same for all other extended methods we are defining in abstract class
    @Override
    public void start(){
        System.out.println("The Game "+this.getClass().getSimpleName()+" started");
    }
    @Override
    public void stop(){
        System.out.println("The Game "+this.getClass().getSimpleName()+" stopped");
    }
}
class Car extends AbstractGame implements Game{

    @Override
    public void play(){
        System.out.println("You are playing game "+this.getClass().getSimpleName()+", Please wear seat belt and drive safely");
    }

}
class Bike extends AbstractGame implements Game{

    @Override
    public void play(){
        System.out.println("You are playing game "+this.getClass().getSimpleName()+", Please wear helmet and drive safely");
    }

}
class Ship extends AbstractGame implements Game{

    @Override
    public void play(){
        System.out.println("You are playing game "+this.getClass().getSimpleName()+", Please wear life jacket and drive safely");
    }
}
public class InterfaceAndAbstractEx {

    public static void main(String[] args) {

        Game game = new Bike();
        game.start();
        game.play();
        game.stop();
    }
}
