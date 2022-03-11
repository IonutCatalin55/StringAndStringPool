package ro.java.ctrln;

public class PersonUsage {

    public static void main(String[] args) {

        Client newclient = new Client("1234567890123");
        newclient.setClientname("John");
        System.out.println(newclient);
        newclient = null; // asa facem dereferirea unui obiect,nu conteazza ca avem finalize in clasa parinte
        System.gc();
    }
}
