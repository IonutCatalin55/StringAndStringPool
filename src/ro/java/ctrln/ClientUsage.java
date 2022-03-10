package ro.java.ctrln;

public class ClientUsage {
    public static void main(String[] args) {

        Client clientOne = new Client();
        Client clientTwo = new Client();


        clientOne.setClientname("John");
        clientOne.setClientId(1);
        clientTwo.setClientname("John");
        clientTwo.setClientId(1);
        System.out.println("clientOne.getClientname() == clientTwo.getClientname() : " + (clientOne.getClientname() == clientTwo.getClientname()));

        System.out.println(clientOne);
        System.out.println(clientTwo);

        String clientOneString = clientOne.toString().intern(); //se internalizeaza in string pool iar la urmatoarele apeluri
        String clientTwoString = clientTwo.toString().intern(); //va cauta in stringPool stringul internalizat si l va afisa pe acela



        System.out.println("clientOneString.equals(clientTwoString): " + clientOneString.equals(clientTwoString));// sunt egale ca si continut
        System.out.println("clientOneString == clientTwoString : " + (clientOneString == clientTwoString));// sunt instate a doua obiecte diferite
        //Boolean a = clientOne.toString().intern() == clientTwo.toString().intern();
        //System.out.println(a);

    }
}
