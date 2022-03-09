package ro.java.ctrln;

public class StringInmutability {

    public static void main(String[] args) {
        String stringOne = "wxyz";
        String stringTwo = new String("wxyz");
        stringOne.toUpperCase(); // Stringurile sunt inmutabile = ADICA NU POT SA LE MAI SCHIMB VALORILE ODATA CE LE AM DEFINIT
        stringTwo.toUpperCase(); // Stringurile sunt inmutabile = ADICA NU POT SA LE MAI SCHIMB VALORILE ODATA CE LE AM DEFINIT
        System.out.println(stringOne); //VA RETURNA STRINGONE CU LITER MICA
        System.out.println(stringTwo); //nu conteaza daca am definit strincul cu string literal sau cu constructor,ele sunt inmutabile

        // Daca avem nevie de uper case initalizam variabile noi ca mai jos
        String stringFour = stringOne.toUpperCase();
        String stringFive = stringTwo.toUpperCase();
        System.out.println(stringFour);
        System.out.println(stringFive);

        //sau afisam direct rezultatul oeratiuni
        System.out.println(stringOne.toUpperCase());
        System.out.println(stringTwo.toUpperCase());

        String stringSix = "   1234  ";
        stringSix.trim(); // este ignorata comanda trim pt ca stringul este inmutabil
        System.out.println(stringSix);

        //pt a pute alimina spatiile facem ca mai sus =ori asignam ori afisam direct
        System.out.println(stringSix.trim());


    }
}
