package L10Q1;

public class L10Q1 {
    public static void main(String[] args) {
        permanentEmployee pe = new permanentEmployee("lampaweng",'A');
        contractStaff cs = new contractStaff("trustmebro",1000.50);
        temporaryStaff ts = new temporaryStaff("joemama",10);
    }
}

abstract class Employee{
    private String name,type;
    protected double totalSalary;
    Employee(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void displayName(){
        System.out.println("name: "+this.name);
    }
    
    public void displayType(){
        System.out.println("type: "+this.type);
    }
    
    public abstract void displayTotalSalary();
}

class permanentEmployee extends Employee{
    private char category;
    permanentEmployee(String name , char category){
        super(name,"permanent employee");
        this.category = category;
        this.displayName();
        this.displayType();
        this.displayTotalSalary();
    }
    
    public void displayTotalSalary(){
        if(Character.toLowerCase(this.category)=='a'){
            totalSalary = 4000;
            System.out.println("total salary: "+totalSalary);
        }else if(Character.toLowerCase(this.category)=='b'){
            totalSalary = 3000;
            System.out.println("total salary: "+totalSalary);
        }else if(Character.toLowerCase(this.category)=='c'){
            totalSalary = 2000;
            System.out.println("total salary: "+totalSalary);
        }else{
            System.out.println("invalid category of permanent employee");
        }
    }
}
        
class contractStaff extends Employee{
    private double totalSales;
    contractStaff(String name , double totalSales){
        super(name,"contract staff");
        this.totalSales = totalSales;
        this.displayName();
        this.displayType();
        this.displayTotalSalary();
    }
    
    public void displayTotalSalary(){
        totalSalary = 500 + this.totalSales*0.5;
        System.out.println("total salary: "+totalSalary);
    }
}

class temporaryStaff extends Employee{
    private int workHour;
    temporaryStaff(String name , int workHour){
        super(name,"temporary staff");
        this.workHour = workHour;
        this.displayName();
        this.displayType();
        this.displayTotalSalary();
    }
    
    public void displayTotalSalary(){
        totalSalary = this.workHour*15;
        System.out.println("total salary: "+totalSalary);
    }
}