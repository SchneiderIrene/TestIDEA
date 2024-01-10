package cons;

import java.util.Comparator;

public class YearMakeComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int sortYear = Integer.compare(o1.getYear(), o2.getYear());
        int sortMake = o1.getMake().compareTo(o2.getMake());
        return  sortYear == 0 ? sortMake : sortYear;
    }
}
