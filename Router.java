public class Router {
    // Router Name
    String RouterName;

    // links to all 4 directions
    // Names of the connected routers will be stored into the Port variables
    String Port1;
    String Port2;
    String Port3;
    String Port4;
    String Port5;

    // Packet variable
    Packet packet;
 
    // Default Constructor *to prevent errors
    Router() {

    }// Default Constructor

    /* // Main Constructor
     * Router(String name, String NP, String WP, String SP, String EP, Packet p)
     * RouterName = name
     * NorthPort = NP
     * WestPort = WP
     * SouthPort = SP
     * EastPort = EP
     * place = p
    */
    Router(String RouterName){
        this.RouterName = RouterName;
    }// main constuctor
    
    Packet forward(Packet packet){
        // This will forward a packet to a router
        this.packet = packet;
        return packet;
    }// forward

}// Router Call
