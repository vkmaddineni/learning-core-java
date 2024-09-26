package core.careerit.day18;

abstract class Game {
    public void Start() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is going to start");
    }
    public void Stop() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is going to stop");
    }
   public abstract void Play();
}
class Car extends Game {
 @Override
    public void Play() {
        System.out.println("Car game is playing");
    }
}
class Bike extends Game {
    @Override
    public void Play() {
        System.out.println("Bike game is playing");
    }
}
class Cricket extends Game {
    @Override
    public void Play() {
        System.out.println("Cricket game is playing");
    }
}
class ship extends Game {
    @Override
    public void Play() {
        System.out.println("Ship game is playing");
    }
}

class GameManager {
    public static void main(String[] args) {
        Game[] games = new Game[]{new Car(), new Bike(), new Cricket(), new ship(),new Car(), new Bike(), new Cricket(), new ship(),
                new Car(), new Bike(), new Cricket(), new ship()};
        int count = 0;
        for (Game g : games) {
            if(g instanceof Car){
                count++;
            }

          }
        System.out.println("Total Number of Car games: "+count);

    }
}
