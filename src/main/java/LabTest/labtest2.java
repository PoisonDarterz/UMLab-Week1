package LabTest;

class Cloud {
    protected String cloud;
    protected double totalCost;
    public Cloud(String cloud) {
        this.cloud = cloud;
    }
    public String getCloud() {
        return cloud;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public String toString() {
        return String.format("Cloud Package: %s Total Cost = %.2f\n", cloud, totalCost); //extra \n added
    }
}

class Job {
    protected String jobName;
    protected int numTask;
    protected int memory;
    public Job(String jobName, int numTask, int memory) {
        this.jobName = jobName;
        this.numTask = numTask;
        this.memory = memory;
    }
    public String getJobName() {
        return jobName;
    }
    public int getNumTask() {
        return numTask;
    }
    public int getMemory() {
        return memory;
    }
    public String toString() {
        return String.format("Job Name: %s Memory = %dGB Number of Task = %d", jobName, memory, numTask);
    }
}

class CloudPackage extends Cloud {
    protected int numCore;
    protected int memory;
    protected double pricePerHr;
    public CloudPackage(String cloud, int nc, int m, double pph) {
        super(cloud);
        numCore = nc;
        memory = m;
        pricePerHr = pph;
    }

    public boolean check(Job j) {
        return (j.getMemory() <= memory);
    }

    public void totalCost(Job j) {
        int numHour = (int) Math.ceil((double) j.getNumTask() / numCore);
        totalCost = numHour * pricePerHr;
    }
}
public class labtest2 {
    // la Copy Paste
    public static void main(String[] args) {
        Job j1 = new Job("J1", 252, 20);
        Job j2 = new Job("J2", 108, 10);
        Job j3 = new Job("J3", 72, 25);
        CloudPackage[] cp = new CloudPackage[4];
        cp[0] = new CloudPackage("P2-15", 4, 15, 1.24);
        cp[1] = new CloudPackage("P2-30", 6, 30, 2.11);
        cp[2] = new CloudPackage("R5-20", 4, 20, 1.38);
        cp[3] = new CloudPackage("R6-20", 6, 20, 1.88);
        int index;
        double totalCost=0;
        System.out.println(j1.toString());
        index = leastCost(cp,j1);
        totalCost+=cp[index].getTotalCost();
        System.out.println(cp[index].toString());
        System.out.println(j2.toString());
        index = leastCost(cp,j2);
        totalCost+=cp[index].getTotalCost();
        System.out.println(cp[index].toString());
        System.out.println(j3.toString());
        index = leastCost(cp,j3);
        totalCost+=cp[index].getTotalCost();
        System.out.println(cp[index].toString());
        System.out.println("Total Cost : " + totalCost);
    }
    public static int leastCost(CloudPackage[] a, Job b) {
        int index=0;
        double cost = Double.MAX_VALUE;
        for(int i=0; i<a.length; i++) {
            if (a[i].check(b)) {
                a[i].totalCost(b);
                if (a[i].getTotalCost()<cost) {
                    cost = a[i].getTotalCost();
                    index = i;
                }
            }
        }
        return index;
    }
}
