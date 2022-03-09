package ro.java.ctrln;

public class StrinBufferUsage {
    public static void main(String[] args) {
      /*  StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);
        stringBuffer.append("2");
        stringBuffer.append(true);
        System.out.println(stringBuffer);
        // STRINGBUFFER ESTE TREADSAFE == APLICATI PE MAI MULTE FIRE DE EXECUTIE

        StringBuffer stringBuffer1 = new StringBuffer("1234");

        StringBuffer stringBuffer2 = new StringBuffer(1234); //o valoare de tip int arata capacitatea strig buffer si
        System.out.println(stringBuffer2);                          // returneaza un empty string de 1234 poziti
        //StringBuffer stringBuffer3 = new StringBuffer(CharSequence); //CharSequence este o interfata si nu se poate instantia,in schimb
        //se poate declara contrctul interfetei si sa folosim parametru ei.
        CharSequence charSequence = "Invat Java";
        StringBuffer stringBuffer3 = new StringBuffer(charSequence);
        System.out.println(stringBuffer3);

       */
        CharSequence charSequence = "Invat limbajul Java!!";
        StringBuffer stringBuffer3 = new StringBuffer(charSequence);

        System.out.println(stringBuffer3.append("dsdsd")); //adauga caractere noi la stringul existent
        System.out.println(stringBuffer3.indexOf("a")); //afiseaza prima poziti a caracterului a sau a unui string
        System.out.println(stringBuffer3.indexOf("limb")); //afiseaza prima poziti a caracterului a sau a unui string
        System.out.println(stringBuffer3.insert(3,5)); //insereaza la indexul 3 un caracter sau un string sau int = 5
        System.out.println(stringBuffer3.lastIndexOf("d"));// ultimul index din stringul nostru pt litera d
        System.out.println(stringBuffer3.length());
        System.out.println(stringBuffer3.charAt(18));// afiseaza caracterul de la indexul 18 !!! Daca avm un index mai mar decat lungimea stringului avem o exceptie
        System.out.println(stringBuffer3.delete(1, 5)); //Sterge caractere  de la index 1-inclusiv la 5-excusiv
        System.out.println(stringBuffer3.substring(2,18)); // afiseaza un sub string al stringBuffer
        System.out.println(stringBuffer3.replace(0, 2, "Invat tot")); // inlocuieste caracterele de la index la index cu un string nou


    }
}
