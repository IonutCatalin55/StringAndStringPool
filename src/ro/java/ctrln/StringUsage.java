package ro.java.ctrln;

public class StringUsage {

    public static void main(String[] args) {

        String stringOne = "This is Java!"; //obiectele sting din stanga sunt declarate folosind "string literals"
        String stringTwo = "This is Java!"; //obiectele sting din stanga sunt declarate folosind "string literals"
        String stringTree = new String("This is Java!"); //acest obiect este tinut pe heap ,nu pe string pool
        String stringFour = new String(stringOne);

        System.out.println("stringOne.equals(stringTwo) = " + stringOne.equals(stringTwo));
        System.out.println("stringOne = stringTwo = " + (stringOne == stringTwo));
        System.out.println("stringOne = stringTwo = " + stringOne == stringTwo); // ai grija ordine acompilari este string + string one == string two

        System.out.println("stringOne.equals(stringTree) = " + (stringOne.equals(stringTree)));
        System.out.println("stringOne == stringTree = " + (stringOne == stringTree)); //prin " == " se verifica daca cele doua sunt egale ca instanta
        System.out.println("stringOne.equals(stringFour) = " + (stringOne.equals(stringFour)));
        System.out.println("stringOne == stringFour = " + (stringOne == stringFour));


        String stringFive = new String(stringOne.getBytes());
        System.out.println("stringOne.equals(stringFive) = " + stringOne.equals(stringFive));
        System.out.println("stringOne == stringFive = " + (stringFive == stringOne));

        String stringSix = "JAVA"; //acest string este salvat=internalizat pe strigpool
        char[] chars = {'J', 'A', 'V', 'A'};
        String stringSeven = new String(chars); // acest strinh este un obiect si este salvat pe heap
        System.out.println("stringSix.equals(string.Seven) = " + stringSix.equals(stringSeven));
        System.out.println(" stringSix == string.Seven = " +(stringSix == stringSeven));

        StringBuilder stringBuilder = new StringBuilder("JAVA");
        System.out.println("stringSix.equals(stringBuilder) = " + stringSix.equals(stringBuilder)); //este fals pentru ca testeaza daca valorea unui obiect String este egala cu cea a stringBuilder
        System.out.println("stringSix.equals(stringBuilder.toString) = " + stringSix.equals(stringBuilder.toString())); //se iareprezenarea obiectului stringBuilder ca String cu ajutorul toString
       // System.out.println(stringSix == stringBuilder); // nu putem sa plicam == unui obict de tipul String si altul de tipul StringBuilder(sunt din clase diferite)


    }
    }


