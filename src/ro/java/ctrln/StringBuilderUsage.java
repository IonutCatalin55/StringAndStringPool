package ro.java.ctrln;

public class StringBuilderUsage {
    public static void main(String[] args) {
       /* StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder); // nu returneaza nimic(linie goala)
        System.out.println(stringBuilder.toString()); // nu returneaza nimic(linie goala)
        stringBuilder.append("JAVA!");
        System.out.println(stringBuilder); // returneaza JAVA!
        stringBuilder.append("Salut lume!");
        System.out.println(stringBuilder);
        */

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JAVA!Salut lume!");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.indexOf("VA")); //returneaza pozitia de unde incepe  stringul "VA"
        System.out.println(stringBuilder.replace(0, 4, "Hello!")); //inlocuieste o portiune din string cu alta
        System.out.println(stringBuilder.substring(0, 7)); //printeaza un substring al stringBuilder de la poz 0 la 7 inclusiv
        //Pt ca folosim StringBuilder care este mutabil primele 4 caractere din stringul original au fost inlocuite permanent cu Hello!
        // nu sa creat un obiect nou , a fost modificat cel existent
        System.out.println(stringBuilder.charAt(10)); // vedem caracterul de la pozitia 10
        System.out.println(stringBuilder.insert(5, " caca"));// se pote insera intr o anumita pozitie din string char,int,string,etc
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.delete(5, 6).delete(5, 6).delete(5, 6)); //putem sterge caratere din string de la pozitia ... la pozitia de mai multe ori


    }
}
