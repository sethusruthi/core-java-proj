package org.OOPs.Abstract;

import java.util.Scanner;
//since we are miking super class as sealed class so we should make the inherited classes as final
sealed abstract class Game permits Car, Bike, Ship{
   //since start,shop methods are same for all classes we made them normal classes and not abstract.
    public void start(){
        System.out.println("You have started the game "+this.getClass().getSimpleName());
    }
    //since play is an abstract class it should be overriden by the inherited classes
    public abstract void play();
    public void stop(){
        System.out.println("You have stopped the game "+this.getClass().getSimpleName());
    }
}
final class Car extends Game{
    public void play(){
        System.out.println("You are playing the game "+this.getClass().getSimpleName()+", Please wear seat belt and drive safely");
    }

}
final class Bike extends Game{
    @Override
    public void play(){
        System.out.println("You are playing the game "+this.getClass().getSimpleName()+", Please wear helmet and drive safely");
    }
}

final class Ship extends Game{
    @Override
    public void play(){
        System.out.println("You are playing the game "+this.getClass().getSimpleName()+", Please wear life jacket and drive safely");
    }
}
public class GameManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Car 2. Bike 3. Ship 4.Exit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            if (ch == 4) {
                System.out.println("Thanks for playing the game");
                System.exit(0);
            }
            //since game is an abstract class we did not create obj but we created reference variable
            Game game = getGame(ch);
            game.start();
            game.play();
            game.stop();
            System.out.println("Do you want to play again (yes/no):");
            String option = sc.next();
            if(option.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing the game");
                System.exit(0);
            }
        }
    }

    //since game is super class and holds care,bike ship we are creating reference variable for game.
    public static Game getGame(int ch){
        return switch (ch) {
            case 1 -> new Car();
            case 2 -> new Bike();
            case 3 -> new Ship();
            default -> throw new IllegalArgumentException("Invalid choice");
        };
    }
}
