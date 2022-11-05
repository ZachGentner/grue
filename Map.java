public class Map{

    private int width;
    private int height;
    public Tile[][] map;

    public Map(int width, int height){
        this.width = width;
        this.height = height;
        this.map = new Tile[width][height];
    }

    public void drawMap(){
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                map[x][y] = new Tile();
                map[x][y].getIcon(); //Prints the current icon value at coordinate x,y.
                System.out.print(" "); //Padding along the x-axis to make the map look more symmetrical

                if (y == 4){
                    System.out.println("");
                }
            }
        }
    }

    public void getCoordinate(int x, int y){
        map[x][y].getIcon();
    }
}