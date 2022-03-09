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

        stringOne = "This is Java Language!";
        System.out.println(stringOne.substring(2)); //printeaza elementele stringului de la pozitia 2(elem. 3)
        System.out.println(stringOne.substring(2, 6)); //pt ca strigOne este inmtabil el nu se modifica mai sus,va ramane la fel de fiecare data cand il apelam
        // se creaza un obiect String nou de fiecare data cand folosim stringOne
        System.out.println(stringOne);// test de inmutabilitate
        System.out.println(stringOne.replace('i', 'z')); //Inlocuim caracterul i cu z
        System.out.println(stringOne.replace("is", "as")); //Inlocuim o secventa de caractere
        System.out.println(stringOne.charAt(8)); //afiseaza caracterul de la pozitia 8
        System.out.println(stringOne.concat(stringFive)); // concat inlocuieste + intre cele 2 stringuri ai afiseaza ce doua stringuri
        System.out.println(stringOne.indexOf('L')); //cauta in strigul stringOne si afiseaza prima pozitie unde a gasit caracterul dorit
        System.out.println(stringOne.length()); // afiseaza lungimea stringului
        System.out.println(stringOne.startsWith("Jav")); // verifica daca stringul incepe cu Jav adevarat sau false
        System.out.println(stringOne.endsWith("e!")); // verifica daca stringul se ermina cu e!

    }
}
