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

    // packet object (Packer p)
        //I'll need to make a placeholder packet that'll get overwritten
    Packet packet = new Packet("Placeholder", "Current", "Current", 0);
    
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
    Router(String name, String P1, String P2, String P3, String P4, String P5, Packet p){
        RouterName = name;
        Port1 = P1;
        Port2 = P2;
        Port3 = P3;
        Port4 = P4;
        Port5 = P5;
        packet = p;
    }// main constuctor
    
}// Router Call
