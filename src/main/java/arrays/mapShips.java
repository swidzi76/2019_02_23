package arrays;

public class mapShips {
    private int rows;
    private int columns;
    private int[][] map;

    public mapShips(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        map = new int[rows][columns];
    }

    public mapShips(int[][] map1) {
        this.rows = map1.length;
        this.columns = map1[0].length;
        map = map1;
    }
    public mapShips(mapShips mapS){
        this.rows = mapS.getRows();
        this.columns = mapS.getColumns();
        map = mapS.map;
    }


    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public void setShip1m(int row, int column){
        if((row > 0) && (row <= getRows()) && (column > 0) && (column <= getColumns())  )
            map[row-1][column-1] = 1;
    }
    public void setShip2m(int row1m, int column1m,
                          int row2m, int column2m){
        map[row1m][column1m] = 2;
        map[row2m][column2m] = 2;
    }
    public void setShip(int... coordinats){
        if(coordinats.length == 0){
            System.out.println(" brak wspórzędnych dla statku !!");
            return;
        }
        if (coordinats.length % 2 != 0){
            System.out.println(" nieparzysta liczba współrzędnych !!! ");
            return;
        }
        for (int i = 0; i < coordinats.length ; i+=2) {
            map[coordinats[i]-1][coordinats[i+1]-1] = coordinats.length / 2;
        }
    }
    public void setField(int row, int column, int val){
        map[row][column] = val;
    }
    public int getField(int row, int column){
        return map[row][column];
    }

    public void showMap() {

        for (int i = 0; i < rows; i++) {
            System.out.print("{");
            for (int j = 0; j < columns-1; j++) {
                System.out.print(map[i][j]+", ");
            }
            System.out.println(map[i][columns-1]+"}");

        }
    }
    public boolean isEmpty(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(map[i][j] != 0)
                    return false;
                }
        }
        return true;
    }
}
