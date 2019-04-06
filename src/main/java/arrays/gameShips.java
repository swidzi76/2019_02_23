package arrays;

import java.util.Scanner;

public class gameShips extends mapShips{
    private int counter = 0;
    public gameShips(mapShips map) {
        super(map);
    }
    private boolean isEndOfGame(){
        return this.isEmpty();
    }
    private int getCounter(){
        return counter;
    }

    public void startGame(){
        System.out.println(" STATKI !!!!");
        System.out.println("   Przeciwnik strzela podając rząd i koluumnę.");
        System.out.println("   +1pkt - trafienie jednomasztowca");
        System.out.println("   +2pkt - trafienie jednego pola dwumasztowca (+4pkt cały statek)");
        System.out.println("   +3pkt - trafienie jednego pola trójmasztowca (+9pkt cały statek)");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        while(!isEndOfGame()){
            System.out.println("   LICZNIK = "+ getCounter());
            this.showMap();
            System.out.print(" podaj wiersz (1 - "+this.getRows()+") : ");
            int userRow = scan.nextInt();
            System.out.print(" podaj kolumnę (1 - "+this.getColumns()+") : ");
            int userCol = scan.nextInt();
            if(this.getField(userRow - 1, userCol - 1) > 0){
                System.out.println(" TRAFIONY STAEK "+getField(userRow - 1, userCol - 1)+" masztowy !!!!");
                counter += getField(userRow - 1, userCol - 1);
                this.setField(userRow - 1, userCol -1, 0);
            }else {
                System.out.println(" NIETRAFIONY - SPRÓBÓJ PONOWNIE");
            }

        }
        System.out.println(" GRA ZAKOŃCZONA Z WYNIKIEM : "+ getCounter());
    }

}
