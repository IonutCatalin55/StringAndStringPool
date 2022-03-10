package ro.java.ctrln;

public class GarbageColection {
    
    public static void main(String[] args) {

        exampleOneGarbageColector();
        exampleTwoGarbageColector();
        exampleThreeGarbageColector();
        System.out.println("Final metoda main");
    }

    private static void exampleThreeGarbageColector() { // garbage colection cand folosim un obiect anonim

        new Client().setClientname("Client3");
        System.gc(); // apel care sugereaza JVM sa foloseasca garbage colection

    }

    private static void exampleTwoGarbageColector() { //garbage colection cand un obiect refera un alt obiect de acelasi fel
        Client clientOne = new Client();
        clientOne.setClientId(100);
        clientOne.setClientname("Client1");

        Client clientTwo = new Client();
        clientTwo.setClientname("Client2");
        clientTwo.setClientId(200);

        clientOne = clientTwo;
        System.out.println("Final metoda exampleTwoGarbageColector");
        System.gc(); // sugereaza JVM sa ruleze garbage colector

    }

    private static void exampleOneGarbageColector() {// garbage colection cand referinta este null
        Client client = new Client();
        client.setClientId(333);
        client.setClientname("Client");
        client = null;
        System.out.println("Final metoda exampleOneGarbageColector");
        System.gc(); // sugereaza JVM sa ruleze garbage colector

    }
}
