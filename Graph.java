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

     public void DisplaybreadthFirstSearch(int src){
        // Using a Queue
        Queue<Integer> queue = new LinkedList<>(); // Queues are interfaces

        // Using a Boolean type array to report if a Router has been visited
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            // removes element from the queue
            src = queue.poll();

            // Printing out Pulled Elements
            System.out.println(routers.get(src).RouterName + " = visited");

            // Look for any adjacent Neighbors
            for(int i = 0; i < matrix[src].length; i++){
                if(matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }// 
            }// for
        }// while
     }// DisplaybreadthFirstSearch

     public void DisplaydepthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        
        // Calling Helper Function
        DisplaydFSHelper(src, visited);
    }// DisplaydepthFirstSearch

    private void DisplaydFSHelper(int src, boolean[] visited){
        // Is example uses a "Call Stack", rather than a stack
        // "Call Stacks" are used in recusion

        // Check if current node we're on is visited or not
        if(visited[src]){
            return;
        }// if
        else {
            visited[src] = true;
            System.out.println(routers.get(src).RouterName + " = visited");
        }// else

        // Iterate over this row
        for(int i = 0; i < matrix[src].length; i++){
            if(matrix[src][i] == 1){
                DisplaydFSHelper(i, visited);
            }// if
        }// for
        // if succuessfully ran through entire for loop, return:
        return;
    }// DisplaydFSHelper

    public void breadthFirstSearch(int src, int dst){
        // Using a Queue
        Queue<Integer> queue = new LinkedList<>(); // Queues are interfaces

        // Using a Boolean type array to report if a Router has been visited
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            // removes element from the queue
            src = queue.poll();
            System.out.println(src);

            // Printing out Pulled Elements
            //System.out.println(routers.get(src).RouterName + " = visited");

            // Look for any adjacent Neighbors
            for(int i = 0; i < matrix[src].length; i++){
                if(matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }// 
            }// for
        }// while
     }// breadthFirstSearch
}// Graph Class
