package ro.java.ctrln;

public class StringConcatenation {
    public static void main(String[] args) {

        String stringOne = "This is ";
        String stringTwo = "JAVA!";
        String stringThree = stringOne + " " + stringTwo;
        System.out.println(stringThree);

        String stringFour = stringThree + 2;
        System.out.println(stringFour);

        String stringFive = 2 + stringThree;
        System.out.println(stringFive);

        String stringSix = stringThree + false;  // false este transformat in stringul "false"
        System.out.println(stringSix);

        String strigSeven = stringThree + null;
        System.out.println(strigSeven);

        String stringEight = stringThree + "null";
        System.out.println(stringEight);

        String stringNine = "" + true + 1; // "" un string gol care forteaza true si 1 in string
        System.out.println(stringNine);

        String stringTen = "Java";
        stringTen += 1;
        System.out.println(stringTen);
    }
}
