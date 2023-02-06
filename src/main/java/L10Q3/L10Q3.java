/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;
public class L10Q3 {
    public static void main(String[] args) {
        appointment app1 = new appointment("2023/1/12");
        app1.writeAppointment(900, 1100);
        appointment app2 = new appointment("2022/1/12");
        app2.writeAppointment(900, 1100);
    }
}

interface searchable{
    public boolean search(int dateStartTime,int dateEndTime);
}

class appointment implements searchable{
    protected int day,month,year,startTime,endTime;
    appointment(String formatDate){
        String date[] = formatDate.split("/");
        this.day = Integer.parseInt(date[2]);
        this.month = Integer.parseInt(date[1]);
        this.year = Integer.parseInt(date[0]);
    }
    
    public boolean search(int dateStartTime,int dateEndTime){
        int yearOccupied,monthOccupied,dayOccupied,startTimeOccupied,endTimeOccupied;
        boolean flag = true;
        String data[];
       try{
           Scanner sc = new Scanner(new FileReader(".\\bookingslot.txt.txt"));
           while(sc.hasNextLine()){
               data = sc.nextLine().split("/");
               dayOccupied = Integer.parseInt(data[2]);
               monthOccupied = Integer.parseInt(data[1]);
               yearOccupied = Integer.parseInt(data[0]);
               startTimeOccupied = Integer.parseInt(data[3]);
               endTimeOccupied = Integer.parseInt(data[4]);
               if(yearOccupied==this.year){
                   if(monthOccupied==this.month){
                       if(dayOccupied==this.day){
                           if(dateStartTime>=startTimeOccupied&&dateStartTime<=endTimeOccupied || dateEndTime>=startTimeOccupied&&dateEndTime<=endTimeOccupied){
                               flag = false;
                               break;
                           }else{
                               flag = true;
                           }
                       }else{
                           flag = true;
                       }
                   }else{
                       flag = true;
                   }
               }else{
                   flag = true; 
               }
           }
           sc.close();
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
       return flag;
    }
    
    public void writeAppointment(int dateStartTime,int dateEndTime){
        if(search(dateStartTime,dateEndTime)){
            try{
                PrintWriter pw = new PrintWriter(new FileWriter(".\\bookingslot.txt.txt",true));
                pw.println(this.year+"/"+this.month+"/"+this.day+"/"+dateStartTime+"/"+dateEndTime);
                pw.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("the slot is occupied, please choose another slot");
        }
    }
}

 