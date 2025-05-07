package class_object_practice.practice03;

public class EmployeeDTO {
    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    public EmployeeDTO() {}

    public void setNumber(int number) {this.number = number;}
    public void setName(String name) {this.name = name;}
    public void setDept(String dept) {this.dept = dept;}
    public void setJob(String job) {this.job = job;}
    public void setAge(int age) {this.age = age;}
    public void setGender(char gender) {this.gender = gender;}
    public void setSalary(int salary) {this.salary = salary;}
    public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setAddress(String address) {this.address = address;}

    public int getNumber() {return this.number;}
    public String getName() {return this.name;}
    public String getDept() {return this.dept;}
    public String getJob() {return this.job;}
    public int getAge() {return this.age;}
    public char getGender() {return this.gender;}
    public int getSalary() {return this.salary;}
    public double getBonusPoint() {return this.bonusPoint;}
    public String getPhone() {return this.phone;}
    public String getAddress() {return this.address;}



}
