package L9Q2_3;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonProfile {
    static Scanner sc = new Scanner(System.in);
    protected String name;
    protected boolean gender;
    protected String dob;

    public PersonProfile(){
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter 0 for female, and 1 for male: ");
        this.gender = (sc.nextInt() == 1);
        sc.nextLine();
        System.out.print("Enter date of birth (dd/mm/yyyy): ");
        this.dob = sc.nextLine();
    }
}

class Student extends PersonProfile {
    private String filename;
    protected ArrayList<String> courseCode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<String> grade = new ArrayList<>();
    protected ArrayList<Integer> mark = new ArrayList<>();

    public Student(String filename){
        super();
        this.filename = filename;
        try {
            Scanner fin = new Scanner(new FileInputStream(filename));
            while (fin.hasNextLine()){
                courseCode.add(fin.nextLine());
                courseName.add(fin.nextLine());
                session.add(fin.nextLine());
                semester.add(fin.nextLine());
                int markinp = Integer.parseInt(fin.nextLine());
                mark.add(markinp);
                grade.add(getGrade(markinp));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    public String getGrade(int mark){
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }

    public void display(){
        for(int i=0 ; i<courseCode.size() ; i++){
            System.out.println("Course code:\t" + courseCode.get(i));
            System.out.println("Course name:\t" + courseName.get(i));
            System.out.println("Session:\t\t" + session.get(i));
            System.out.println("Semester:\t\t" + semester.get(i));
            System.out.println("Grade:\t\t\t" + grade.get(i));
            System.out.println();
        }
    }
}

class Lecturer extends PersonProfile {
    private String filename;
    protected ArrayList<String> courseCode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<Double> chour = new ArrayList<>();
    protected ArrayList<Integer> numstud = new ArrayList<>();

    public Lecturer(String filename) {
        super();
        this.filename = filename;
        try {
            Scanner fin = new Scanner(new FileInputStream(filename));
            while (fin.hasNextLine()) {
                courseCode.add(fin.nextLine());
                courseName.add(fin.nextLine());
                session.add(fin.nextLine());
                semester.add(fin.nextLine());
                int ch = Integer.parseInt(fin.nextLine());
                int num = Integer.parseInt(fin.nextLine());
                chour.add(updateCHour(ch, num));
                numstud.add(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    public double updateCHour(int ch, int num){
        if (num >= 150) return ch * 3;
        else if (num >= 100) return ch * 2;
        else if (num >= 50) return ch * 1.5;
        else return ch;
    }

    public void display(){
        System.out.println();
        for (int i=0 ; i<courseCode.size() ; i++){
            System.out.println("Course code:\t\t " + courseCode.get(i));
            System.out.println("Course name:\t\t " + courseName.get(i));
            System.out.println("Session:\t\t\t " + session.get(i));
            System.out.println("Semester:\t\t\t " + semester.get(i));
            System.out.println("Updated credit hours: " + chour.get(i));
            System.out.println("Number of students:\t " + numstud.get(i));
            System.out.println();
        }
    }
}

class l9q2 {
    public static void main(String[] args) {
        System.out.println("-----------Student-----------");
        Student s1 = new Student("C:\\Users\\jcchu\\OneDrive - Universiti Malaya\\UM2022-23\\code\\WIX1002_JC\\out\\lab7\\course.txt");
        s1.display();
        System.out.println("-----------Lecturer-----------");
        Lecturer l1 = new Lecturer("C:\\Users\\jcchu\\OneDrive - Universiti Malaya\\UM2022-23\\code\\WIX1002_JC\\out\\lab7\\lecturer.txt");
        l1.display();
    }
}
