package aggregation;

public class Student {
    String studentName;
    int telNumber;
    Address address;

    public Student(String studentName, int telNumber, Address address) {
        this.studentName = studentName;
        this.telNumber = telNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", telNumber=" + telNumber +
                ", address=" + address +
                '}';
    }
}
