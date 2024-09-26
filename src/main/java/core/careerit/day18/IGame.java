package core.careerit.day18;

public interface IGame {
    void display();
    void play();
    void exit();
}

class CarGame implements IGame {
    @Override
    public void display() {
        System.out.println("Car Game Display");
    }

    @Override
    public void play() {
        System.out.println("Car Game Play");
    }

    @Override
    public void exit() {
        System.out.println("Car Game Exit");
    }
}

class BikeGame implements IGame {
    @Override
    public void display() {
        System.out.println("Bike Game Display");
    }

    @Override
    public void play() {
        System.out.println("Bike Game Play");
    }

    @Override
    public void exit() {
        System.out.println("Bike Game Exit");
    }
}
class GamePlay {
    public static void main(String[] args) {
        IGame game = new CarGame();
        game.display();
        game.play();
        game.exit();

        game = new BikeGame();
        game.display();
        game.play();
        game.exit();
    }
}

