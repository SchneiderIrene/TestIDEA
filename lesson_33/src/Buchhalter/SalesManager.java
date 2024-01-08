package Buchhalter;

public class SalesManager extends Employee{
    double percent;
    double salesVolume;


    public SalesManager(int id, String name, String secondName, double hour,  double salesVolume, double percent) {
        super(id, name, secondName, hour);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    @Override
    public String toString() {
        return "SaleManager: " +  super.toString() + ", percent of Sale: " + percent*100 + "%" + ", Volume of sales: " + salesVolume;
    }

    @Override
    public double salary() {
      double salary = salesVolume * percent;
      if (salary<getHour()*StateConstant.MIN_SALARY){
          salary = getHour()*StateConstant.MIN_SALARY;
      }
      return salary;
    }
}
