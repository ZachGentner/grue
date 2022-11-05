public class Main{
    public static void main(String args[]){
        Map m = new Map(5,5);
        m.setCoordinate(1,3,'#');
        m.drawMap();
        m.setCoordinate(3,3,'x');
        m.drawMap();
        m.getCoordinate(1,0);
    }
}