public class Program_16_Point {
    //instance variable
    int x;
    int y;

    //constructor with zero args
    Program_16_Point(){

    }
    //parameterised constructor
    Program_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return  x;
    }
    public  int getY(){
        return y;
    }
    public void setX(int a) {
        this.x = a;
    }
    public void setY(int b) {
        this.y = b;
    }
    public double distance() {
        return  distance(0, 0);

    }
    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }
    public double distance(Program_16_Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Program_16_Point first = new Program_16_Point(6,5);
        Program_16_Point second = new Program_16_Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Program_16_Point point = new Program_16_Point();
        System.out.println("distance()= " + point.distance());
    }
}
