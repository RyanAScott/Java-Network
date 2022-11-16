public class Router extends Packet {
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
    Router(String RouterName, String Port1, String Port2, String Port3, String Port4, String Port5){
        this.RouterName = RouterName;
        this.Port1 = Port1;
        this.Port2 = Port2;
        this.Port3 = Port3;
        this.Port4 = Port4;
        this.Port5 = Port5;
    }// main constuctor
    
}// Router Call
