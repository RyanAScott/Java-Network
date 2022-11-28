import java.util.*;

public class Graph {
    /*
     * Making the network out of an Arraylist (storing the routers)
     * And a 2D Matrix, storing the network connections
     */

     ArrayList<Router> routers;

     int[][] matrix;

     Graph(int size){
        routers = new ArrayList<>();
        matrix = new int[size][size];
     }// Graph Constructor

     public void addRouter(Router router){
        routers.add(router);
     }// addRouter

     public void addPort(int src, int dst){
        matrix[src][dst] = 1;
     }// addPort

     public boolean checkPort(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }// if
        else {
            return false;
        }// else
     }// checkPort

     public void print() {
        // Print Headers First
        System.out.print("  "); // Spacing added for formatting
        for(Router router : routers){
            System.out.print(router.RouterName + " ");
        }// for
        System.out.println();

        // Printing out the connections
        for(int i = 0; i < matrix.length; i++){
            // Printing out row headers
            System.out.print(routers.get(i).RouterName + " ");
            // Printing out the connections
            // 1 meaning connected, 0 being not connected
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }// for
            System.out.println();
        }// for
     }// print
}// Graph Class
