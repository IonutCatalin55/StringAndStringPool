package ro.java.ctrln;

public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder); // nu returneaza nimic(linie goala)
        System.out.println(stringBuilder.toString()); // nu returneaza nimic(linie goala)
        stringBuilder.append("JAVA!");
        System.out.println(stringBuilder); // returneaza JAVA!
        stringBuilder.append("Salut lume!");
        System.out.println(stringBuilder);
    }
}
