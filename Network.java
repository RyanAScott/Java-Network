public class Network {
    
    static void ForwardPacket (Router R1, Router R2){
        R2.forward(R1.packet);
        R2.packet.HopCount++;
    }// ForwardPacket

    public static void main(String args[]) throws Exception {
        // Placeholder packet 
        Packet placeholder = new Packet("Placeholder", "Current", "Current");
        
        // Creating all the routers
        Router A1 = new Router("A1");
        Router B2 = new Router("B2");
        Router C3 = new Router("C3");
        Router D4 = new Router("D4");
        Router E5 = new Router("E5");
        Router F6 = new Router("F6");
        Router G7 = new Router("G7");
        Router H8 = new Router("H8");
        Router I9 = new Router("I9");
        Router J10 = new Router("J10");
        Router K11 = new Router("K11");
        Router L12 = new Router("L12");
        Router M13 = new Router("M13");
        Router N14 = new Router("N14");
        Router O15 = new Router("O15");
        Router P16 = new Router("P16");
        Router Q17 = new Router("Q17");
        Router R18 = new Router("R18");

        // Giving placeholder packet to A1 router
        A1.packet = placeholder;

        // Test to make sure the packet transfer works
        /* 
        System.out.println(A1.packet.Message);
        ForwardPacket(A1, B2);
        System.out.println(B2.packet.Message);
        System.out.println(B2.packet.HopCount);
        */

        // Making the graph to create the network
        Graph network = new Graph(18);

        // Adding all the routers
        network.addRouter(A1);
        network.addRouter(B2);
        network.addRouter(C3);
        network.addRouter(D4);
        network.addRouter(E5);
        network.addRouter(F6);
        network.addRouter(G7);
        network.addRouter(H8);
        network.addRouter(I9);
        network.addRouter(J10);
        network.addRouter(K11);
        network.addRouter(L12);
        network.addRouter(M13);
        network.addRouter(N14);
        network.addRouter(O15);
        network.addRouter(P16);
        network.addRouter(Q17);
        network.addRouter(R18);

        // Creating all the connections in the network

        // A1 Connections
        network.addPort(0, 1);
        network.addPort(0, 2);
        network.addPort(0, 3);
        network.addPort(0, 4);
        network.addPort(0, 5);
        network.addPort(1, 0);
        network.addPort(2, 0);
        network.addPort(3, 0);
        network.addPort(4, 0);
        network.addPort(5, 0);

        // B2 remaining connections
        network.addPort(1, 6);
        network.addPort(1, 7);
        network.addPort(6, 1);
        network.addPort(7, 1);

        // C3 remaining connections
        network.addPort(2, 7);
        network.addPort(2, 9);
        network.addPort(7, 2);
        network.addPort(9, 2);

        // D4 remaining connections
        network.addPort(3, 4);
        network.addPort(3, 10);
        network.addPort(4, 3);
        network.addPort(10, 3);

        // E5 remaining connections
        network.addPort(4, 5);
        network.addPort(4, 16);
        network.addPort(4, 15);
        network.addPort(5, 4);
        network.addPort(16, 4);
        network.addPort(15, 4);

        // F6 remaining connections
        network.addPort(5, 11);
        network.addPort(11, 5);

        // G7 remaining connections
        network.addPort(6, 12);
        network.addPort(6, 8);
        network.addPort(12, 6);
        network.addPort(8, 6);

        // H8 remaining connections
        network.addPort(7, 8);
        network.addPort(8, 7);

        // I9 remaining connections
        network.addPort(8, 9);
        network.addPort(9, 8);

        // J10 remaining connections
        network.addPort(9, 13);
        network.addPort(9, 10);
        network.addPort(13, 9);
        network.addPort(10, 9);

        // K11 remaining connections
        network.addPort(10, 14);
        network.addPort(14, 10);

        // L12 remaining connections
        network.addPort(11, 16);
        network.addPort(16, 11);

        // M13 remaining connections
        network.addPort(12, 13);
        network.addPort(13, 12);

        // N14 remaining connections
        network.addPort(13, 14);
        network.addPort(14, 13);

        // O15 remaining connections
        network.addPort(14, 15);
        network.addPort(15, 14);

        // P16 remaining connections
        network.addPort(15, 16);
        network.addPort(15, 17);
        network.addPort(16, 15);
        network.addPort(17, 15);

        // Testing out the print function
        /* 
        network.print();
        */

        // Testing out Display BFS and DFS functions.
        /* 
        network.DisplaybreadthFirstSearch(0);
        network.DisplaydepthFirstSearch(0);
        */

        network.breadthFirstSearch(0, 3);        
    }// main
}// Network Class
