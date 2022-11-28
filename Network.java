public class Network {
    
    static void ForwardPacket (Router R1, Router R2){
        R2.forward(R1.packet);
        R2.packet.HopCount++;
    }// ForwardPacket

    public static void main(String args[]) {
        // Placeholder packet for router generation
        Packet placeholder = new Packet("Placeholder", "Current", "Current");
        
        Router A1 = new Router("A1");
        Router B2 = new Router("B2");
        
        A1.packet = placeholder;

        System.out.println(A1.packet.Message);
        ForwardPacket(A1, B2);
        System.out.println(B2.packet.Message);
        System.out.println(B2.packet.HopCount);
    }// main
}// Network Class
