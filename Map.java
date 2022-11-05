public class Map{

    private int width;
    private int height;
    public char[][] map;

    public Map(int width, int height){
        this.width = width;
        this.height = height;
        this.map = new char[width][height];
    }

    public void drawMap(){
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                System.out.print(map[x][y]); //Prints the current char value at coordinate x,y.
                System.out.print(" "); //Padding along the x-axis to make the map look more symmetrical

                if (y == 4){
                    System.out.println("");
                }
            }
        }
    }

    public void getCoordinate(int x, int y){
        System.out.print(map[x][y]);
    }

    public void setCoordinate(int x, int y, char c){
        map[x][y] = c;
    }
}