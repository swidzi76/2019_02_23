package arrays;


public class ships {

    public static void main(String[] args) {
//        gameShips game = new gameShips(new int[][]{
//        {0, 0, 0, 0, 2, 0},
//        {1, 0, 1, 0, 2, 0},
//        {0, 2, 0, 0, 0, 0},
//        {0, 2, 0, 3, 3, 3},
//        {0, 0, 0, 0, 0, 0},
//        {1, 0, 0, 1, 0, 0}
//        });
        mapShips map1 = new mapShips(10,10);
        map1.setShip1m(2,2);
        map1.setShip(4, 4, 4, 5, 4, 6); // trzymasztowiec
        gameShips game = new gameShips(map1);
        game.startGame();
    }
}
