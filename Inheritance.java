import java.util.Scanner;

class Employee{
    String Emp_name, Emp_id, Addr, Mail, Mobile;
    Scanner s = new Scanner(System.in);

    public void payslip(String name,double bp, double da, double hra, double pf, double scf, double gross, double net){
        System.out.println("=====================================");
        System.out.println("Pay Slip: "+name);
        System.out.println("Employee Name       : "+Emp_name);
        System.out.println("Employee Id         : "+Emp_id);
        System.out.println("Employee Address    : "+Addr);
        System.out.println("Employee Mail ID    : "+Mail);
        System.out.println("Employee Mobile     : "+Mobile);
        System.out.println("Basic Pay           : "+bp);
        System.out.println("Dearness Allowance  : "+da);
        System.out.println("House Rent Allowance: "+hra);
        System.out.println("Provident Fund      : "+pf);
        System.out.println("Staff Club Fund     : "+scf);
        System.out.println("Gross Salary        : "+gross);
        System.out.println("Net Salary          : "+net);
        System.out.println("=====================================");
    }

    public void getData(){
        System.out.print("Enter Employee name: ");
        Emp_name = s.nextLine();
        System.out.print("Enter Employee id: ");
        Emp_id = s.nextLine();
        System.out.print("Enter Employee Address: ");
        Addr = s.nextLine();
        System.out.print("Enter Employee Mail id: ");
        Mail = s.nextLine();
        System.out.print("Enter employee mobile number: ");
        Mobile = s.nextLine();
    }
}

class Programmer extends Employee{
    double bp, da, hra, pf, scf, gross, net;
    public Programmer(){
        super.getData();
        System.out.println("Enter the basic pay: ");
        bp = s.nextDouble();
        da = 0.97*bp;
        hra = 0.01*bp;
        pf = 0.12*bp;
        scf = 0.01*bp;
        gross = bp + da + pf + hra + scf;
        net = gross - (pf + scf); 
        super.payslip("Programmer", bp, da, hra, pf, scf, gross, net);
    }
    
}


public class Inheritance {
    public static void main(String[]  args) {
        Programmer p = new Programmer();
    }
}
