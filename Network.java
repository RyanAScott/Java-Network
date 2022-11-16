import java.util.Scanner;

public class Network extends Router{
    public static void MakePacket(Packet packet){

    }// MakePacket
    
    public static boolean PortCheck(Router r1){
        // Check if the destination is directly connected:
        if (r1.packet.Destination == r1.Port1){
            return true;
        } else if (r1.packet.Destination == r1.Port2){
            return true;
        } else if (r1.packet.Destination == r1.Port3){
            return true;
        } else if (r1.packet.Destination == r1.Port4) {
            return true;
        } else if (r1.packet.Destination == r1.Port5){
            return true;
        } else {
            return false;
        }// if, else if, & else
    }// PortCheck

    public static void main(String args[]) {
        // Placeholder packet for router generation
        Packet placeholder = new Packet("Placeholder", "Current", "Current");
        
        // Array full of routers, creating the network
        Router[] NetworkArray;
        NetworkArray = new Router[18];

        // Populating said array with the same formation as HW5 Graph
        NetworkArray[0] = new Router("1A", "2B", "3C", "4D", "5E", "6F");
        
        // 2B has 3 connections: 7G, 8H, 1A
        NetworkArray[1] = new Router("2B", "7G", "8H", "1A", "NO CONNECTION", "NO CONNECTION");
        
        // 3C has 3 connections: 8H, 10J, 1A
        NetworkArray[2] = new Router("3C", "8H", "10J", "1A", "NO CONNECTION", "NO CONNECTION");
        
        // 4D has 3 connections: 1A, 11K, 5E
        NetworkArray[3] = new Router("4D", "1A", "11K", "5E", "NO CONNECTION", "NO CONNECTION");
        
        // 5E has 5 connections: 1A, 4D, 16P, 17Q, 6F
        NetworkArray[4] = new Router("5E", "1A", "4D", "16P", "17Q", "6F");
        
        // 6F has 3 connections: 1A. 5E, 12L
        NetworkArray[5] = new Router("6F", "1A", "5E", "12L", "NO CONNECTION", "NO CONNECTION");
        
        // 7G has 3 connections: 13M, 9I, 2B
        NetworkArray[6] = new Router("7G", "13M", "9I", "2B", "NO CONNECTION", "NO CONNECTION");
        
        // 8H has 3 connections: 2B, 9I, 3C
        NetworkArray[7] = new Router("8H", "2B", "9I", "3C", "NO CONNECTION", "NO CONNECTION");
        
        // 9I has 3 connections: 7G, 10J, 8H
        NetworkArray[8] = new Router("9I", "7G", "10J", "8H", "NO CONNECTION", "NO CONNECTION");
        
        // 10J has 4 connections: 9I, 14N, 11K, 3C
        NetworkArray[9] = new Router("10J", "9I", "14N", "11K", "3C", "NO CONNECTION");
        
        // 11K has 3 connections: 10J, 15O, 4D
        NetworkArray[10] = new Router("11K", "10J", "15O", "4D", "NO CONNECTION", "NO CONNECTION");
        
        // 12L has 2 connections: 6F, 17Q
        NetworkArray[11] = new Router("12L", "6F", "17Q", "NO CONNECTION", "NO CONNECTION", "NO CONNECTION");
        
        // 13M has 2 connections: 7G, 14N
        NetworkArray[12] = new Router("13M", "7G", "14N", "NO CONNECTION", "NO CONNECTION", "NO CONNECTION");
        
        // 14N has 3 connections: 13M, 10J, 15O
        NetworkArray[13] = new Router("14N", "13M", "10J", "15O", "NO CONNECTION", "NO CONNECTION");
        
        // 15O has 3 connections: 14N, 11K, 16P
        NetworkArray[14] = new Router("15O", "14N", "11K", "16P", "NO CONNECTION", "NO CONNECTION");
        
        // 16P has 4 connections: 15O, 5E, 17Q, 18R
        NetworkArray[15] = new Router("16P", "15O", "5E", "17Q", "18R", "NO CONNECTION");
        
        // 17Q has 4 connections: 12L, 5E, 16P, 18R
        NetworkArray[16] = new Router("17Q", "12L", "5E", "16P", "18R", "NO CONNECTION");
        
        // 18R has 2 connections: 16P, 17Q
        NetworkArray[17] = new Router("18R", "16P", "17Q", "NO CONNECTION", "NO CONNECTION", "NO CONNECTION");

        /*
         * This needs to be remade as a graph
         */

         
    }// main
}// Network Class
