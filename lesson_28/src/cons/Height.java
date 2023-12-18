package cons;

public class Height {
    int height;
    String unitOfMeasure;

    public Height(int height, String unitOfMeasure) {
        this.height = height;
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return height + " " + unitOfMeasure;
    }
}
