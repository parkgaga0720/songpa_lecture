package class_object_practice.practice03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int number = sc.nextInt();
        sc.nextLine(); //엔터 제거

        System.out.print("");
        String name = sc.nextLine();

        System.out.print("");
        String dept = sc.nextLine();

        System.out.print("");
        String job = sc.nextLine();

        System.out.print("");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("");
        int salary = sc.nextInt();

        System.out.print("");
        double bonusPoint = sc.nextDouble();
        sc.nextLine();

        System.out.print("");
        String phone = sc.nextLine();

        System.out.print("");
        String address = sc.nextLine();

        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
        EmployeeDTO emp = new EmployeeDTO();
        emp.setNumber(number);
        emp.setName(name);
        emp.setDept(dept);
        emp.setJob(job);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setSalary(salary);
        emp.setBonusPoint(bonusPoint);
        emp.setPhone(phone);
        emp.setAddress(address);

        //getter를 이용하여 모든 필드 값 출력
        System.out.println(emp.getNumber());
        System.out.println(emp.getName());
        System.out.println(emp.getDept());
        System.out.println(emp.getJob());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
        System.out.println(emp.getSalary());
        System.out.println(emp.getBonusPoint());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());
    }
}
