package cons;

import java.util.Comparator;

public class MakeComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMake().compareTo(o2.getMake());
    }
}
