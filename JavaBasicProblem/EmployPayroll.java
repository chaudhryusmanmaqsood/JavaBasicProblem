package JavaBasicProblem;

public class EmployPayroll {
    private String empName;
    private int id;
    private double empPayrate;
    private double empHoursworked;

    public void empPayroll(String empName ,int id){
      this.empName = empName;
      this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEmpPayrate() {
        return empPayrate;
    }

    public void setEmpPayrate(double empPayrate) {
        this.empPayrate = empPayrate;
    }

    public double getEmpHoursworked() {
        return empHoursworked;
    }

    public void setEmpHoursworked(double empHoursworked) {
        this.empHoursworked = empHoursworked;
    }
}
