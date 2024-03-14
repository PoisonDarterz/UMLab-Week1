//package pastyear;
//
//public class q3 {
//    public static void main(String[] args) {
//
//    }
//
//
//    //load
//    //print map
//    String[][] map = new String[21][21];
//    for(int i = 0; i < 21; i++){ // fill with ~ first
//        for(int j = 0; j < 21; j++){
//            map[i][j] = "~";
//        }
//    }
//    map[10][10] = "N";
//    for(DataBuoy d : db) {
//        if (d.getTemp() > avg) {
//            map[d.getLat()+10][d.getLon()+10] = "H";
//        }
//        else if (d.getTemp() < avg) {
//            map[d.getLat()+10][d.getLon()+10] = "C";
//        }
//        else if (d.getTemp() == avg) {
//            map[d.getLat()+10][d.getLon()+10] = "A";
//        }
//    }
//    // then print the map using 2 for loops i j
//
//
//    // read data from log file
//    // the concept of it, maybe some line order might be jumbled up
//    //try{
//        int flag = 0;
//    ArrayList<Node> nodes = new ArrayList<>();
//        while (flag < 18) {
//            while (in.hasNextLine()) { // in hindsight, this while loop MAYBE is not necessary, but i dont have the file to test it now
//                if (!in.hasNextLine()) {
//                    break;
//                }
//                String line = in.nextLine();
//                String[] data = line.split(" ");
//                String[] param = new String[5];
//                for (int i = 0; i < data.length; i++) {
//                    if (flag == 0) {
//                        if (data[i].contains("NodeName")) {
//                            param[0] = data[i].substring(9);
//                        }
//                    }
//                    if (flag == 1) {
//                        if (data[i].contains("CPUAlloc")) {
//                            param[1] = data[i].substring(9);
//                        }
//                        if (data[i].contains("CPUTot")) {
//                            param[2] = data[i].substring(7);
//                        }
//                    }
//                    // yi ci lei tui
//                    // memory flag == 7
//                    // partition flag == 9
//                    // these is to insert them into a string array(param) to pass into the constructor
//                }
//                flag++;
//                if (flag == 18) {
//                    flag = 0;
//                }
//                // then create a new node object and add it to the arraylist
//                Node n = new Node(param);
//                nodes.add(n);
//            }
//        }
//    //} catch.....
//
//    // the constructor
//    public Node(String[] param) {
//        this.name = param[0];
//        this.cpuAlloc = Integer.parseInt(param[1]);
//        this.cpuTot = Integer.parseInt(param[2]);
//        this.memAlloc = Integer.parseInt(param[3]);
//        this.memTot = Integer.parseInt(param[4]);
//        this.partition = param[5];
//    }
//}
