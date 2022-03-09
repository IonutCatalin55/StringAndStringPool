package ro.java.ctrln;

public class StrinBufferUsage {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
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
    }
}
