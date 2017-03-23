public class car implements Location {

    double[] locationsplit = new double[2];
    double[] location;
    public final int id = (int) (Math.random() * 999999) + 99999;

    public car() {
       location = new double[2];
    }

    public int getID() {
        return this.id;
    }

    public double[] getLoc() {
        return location;
    }

    public void move(int x, int y) {
        this.location[0] = x;
        this.location[1] = y;
    }
}