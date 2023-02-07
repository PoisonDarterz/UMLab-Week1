package pastyear;
import java.util.Scanner;
import java.lang.Math;

public class CoordDist {
    public static Scanner sc = new Scanner(System.in);
    private char dir;
    private int deg;
    private int min;
    private int sec;
    private double decDeg;

    public CoordDist(){
        System.out.print("Enter direction (N, S, E, W): ");
        dir = sc.next().charAt(0);
        while (!(dir == 'N' || dir == 'S' || dir == 'E' || dir == 'W')){
            System.out.print("Invalid input! Enter direction N/S/E/W: ");
            dir = sc.next().charAt(0);
        }
        System.out.print("Enter deg, min and sec: ");
        deg = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        while (deg >= 180 || min >=60 || sec >= 60){
            System.out.print("Invalid input! Enter deg, min and sec: ");
            deg = sc.nextInt();
            min = sc.nextInt();
            sec = sc.nextInt();
        }
        decDeg = convertDec(dir, deg, min, sec);
    }

    public double convertDec(char dir, int deg, int min, int sec) {
        int sign = (dir == 'S' || dir == 'W') ? -1 : 1;
        double deci = (double)(sign * (deg + (min * 60 + sec) / 3600.0));
        return deci;
    }

    public static double calcDist(double lon1, double lat1, double lon2, double lat2){
        final double R = 6371.0;
        double a = Math.pow(Math.sin(Math.abs(lat2-lat1) /2), 2) + Math.cos(lat1)*Math.cos(lat2)*(Math.pow(Math.sin(Math.abs(lon2-lon1) /2), 2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = R*c;
        return d;
    }

    public double getDecDeg(){
        return this.decDeg;
    }

    public double toRadian(double deg){
        return deg * Math.PI / 180;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("Enter Location 1");
        CoordDist ax = new CoordDist();
        CoordDist ay = new CoordDist();
        System.out.println("Enter Location 2");
        CoordDist bx = new CoordDist();
        CoordDist by = new CoordDist();
        System.out.println("Location 1: " + ax.getDecDeg() + "Latitude, " + ay.getDecDeg() + "Longitude");
        System.out.println("Location 2: " + bx.getDecDeg() + "Latitude, " + by.getDecDeg() + "Longitude");
        double distance = CoordDist.calcDist(ay.toRadian(ay.getDecDeg()),  ax.toRadian(ax.getDecDeg()), by.toRadian(by.getDecDeg()), bx.toRadian(bx.getDecDeg()));
        System.out.println("Distance: " + distance + "KM");
    }
}