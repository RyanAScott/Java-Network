/* 
 * Source URLS:
 * https://www.geeksforgeeks.org/passing-and-returning-objects-in-java/
*/

public class Packet {
    // Variable Declarations
    String Message;
    String Destination;
    String Origin;
    int HopCount;

    // Default Constructor *to prevent errors
    Packet() {

    }// Default Constructor

    /* Packet Constructor Defining:
    - Packet(String m, String d, String o, int hc) 
    - Packet Message (String m)
    - Destination (String d)
    - Origin (String o)
    - Hopcount (int hc)
    */ 
    Packet(String m, String d, String o, int hc){
        Message = m;
        Destination = d;
        Origin = o;
        HopCount = hc;
    }// main packet constructor

    /* Packet Cloner Constuctor:
     * Perfect for "Forks in the Road"
     * Packet(Packet p)
     * (Message = p.Message)
     * (Destination = p.Destination)
     * (Origin = p.Origin)
     * (Hopcount = p.Hopcount)
    */
    Packet(Packet p){
        Message = p.Message;
        Destination = p.Destination;
        Origin = p.Origin;
        HopCount = p.HopCount;
    }// cloner constuctor

    // Method to increase the hopcount
    public int AddHop(int H){
        H = H + 1;
        return H;
    }// AddHop

}// Packet Class
