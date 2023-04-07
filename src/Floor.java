public class Floor {

    double width;
    double length;

    public Floor(double width, double lenth){
        if (width < 0) {
            this.width = 0;
        }else {
            this.width = width;
        }
        if (lenth < 0) {
            this.length = 0;
        }else {
            this.length = lenth;
        }
    }
    public double getArea() {
        return this.width * this.length;
    }
}
