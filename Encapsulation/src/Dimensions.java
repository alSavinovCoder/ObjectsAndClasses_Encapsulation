public class Dimensions {
    public final int width;
    public final int height;
    public final int length;

    public  Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getCargoVolume() {
        int volume = width * height * length;
        return volume;
    }
}
